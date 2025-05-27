import logging
from colorama import init, Fore, Style
from generated.lensVisitor import lensVisitor
from generated.lensParser import lensParser

init(autoreset=True)  # Ativa cores no terminal automaticamente

class SemanticAnalyzer(lensVisitor):
    """
    Classe responsável pela análise semântica da linguagem Lens.
    Extende o visitor gerado pelo ANTLR para visitar os nós da árvore
    sintática e aplicar validações semânticas.
    """

    def __init__(self):
        self.scope_stack = [{}]  # Pilha de escopos (escopo atual é o último)
        self.errors_found = False

    def error(self, line, msg):
        """Registra um erro semântico, marca que houve erro e imprime em vermelho no terminal."""
        mensagem = f"[Erro Semântico] Linha {line}: {msg}"
        logging.error(mensagem)
        print(Fore.RED + mensagem)
        self.errors_found = True

    def log_action(self, msg):
        """Registra uma ação semântica bem-sucedida no log."""
        logging.info(f"[Semântico] {msg}")

    def declarar_var(self, var_name, tipo, line):
        """Declara uma variável no escopo atual, verificando duplicidade."""
        if var_name in self.scope_stack[-1]:
            self.error(line, f"Variável '{var_name}' já declarada neste escopo.")
        else:
            self.scope_stack[-1][var_name] = {
                "type": tipo,
                "line": line,
                "atribuida": False
            }
            self.log_action(f"Declarada variável '{var_name}' do tipo '{tipo}'.")

    def buscar_var(self, var_name, line):
        """Busca a variável nos escopos e retorna seu símbolo."""
        for escopo in reversed(self.scope_stack):
            if var_name in escopo:
                return escopo[var_name]
        self.error(line, f"Variável '{var_name}' usada sem declaração.")
        return None

    def visitDec(self, ctx: lensParser.DecContext):
        var_name = ctx.letvar().VAR().getText()
        var_type = ctx.class_().getText()
        line = ctx.start.line

        self.declarar_var(var_name, var_type, line)

        if ctx.atr():
            self.scope_stack[-1][var_name]["atribuida"] = True
            valor_tipo = self.visit(ctx.atr())
            if valor_tipo and not self.comparar_tipos(var_type, valor_tipo):
                self.error(line, f"Atribuição incompatível: '{var_name}' é '{var_type}', mas recebeu '{valor_tipo}'.")
        return None

    def visitAtrsolta(self, ctx: lensParser.AtrsoltaContext):
        var_name = ctx.VAR().getText()
        line = ctx.start.line

        simbolo = self.buscar_var(var_name, line)
        if simbolo:
            self.log_action(f"Atribuição para variável '{var_name}'.")
            simbolo["atribuida"] = True

            valor_tipo = self.visit(ctx.rolav())
            if valor_tipo and not self.comparar_tipos(simbolo["type"], valor_tipo):
                self.error(line, f"Atribuição incompatível: '{var_name}' é '{simbolo['type']}', mas recebeu '{valor_tipo}'.")
        return None

    def visitAtr(self, ctx: lensParser.AtrContext):
        return self.visit(ctx.rolav())

    def visitRolav(self, ctx: lensParser.RolavContext):
        if ctx.exp():
            return self.visit(ctx.exp())
        return self.visit(ctx.valor())

    def visitConcat(self, ctx: lensParser.ConcatContext):
        for item in ctx.rolav():
            self.visit(item)
        return None

    def visitImprime(self, ctx: lensParser.ImprimeContext):
        self.visit(ctx.concat())
        return None


    def visitArit(self, ctx: lensParser.AritContext):
        valores = ctx.valor()
        operadores = ctx.oparit()
        tipos = [self.visit(v) for v in valores]

        if operadores:
            if "string" in tipos or "bool" in tipos:
                self.error(ctx.start.line, f"Operação aritmética inválida com tipos: {tipos}")
                return "erro"
            if any(op.getText() == '/' and valor.INT() and valor.INT().getText() == '0'
                   for op, valor in zip(operadores, valores[1:])):
                self.error(ctx.start.line, "Divisão por zero.")

            return "float" if "float" in tipos else "int"
        else:
            return tipos[0] if tipos else "indefinido"

    def visitExpcond(self, ctx: lensParser.ExpcondContext):
        return self.visit(ctx.explogi())

    def visitExplogi(self, ctx: lensParser.ExplogiContext):
        exp_list = ctx.expcomp()
        for exp in exp_list:
            tipo = self.visit(exp)
            if tipo != "bool":
                self.error(ctx.start.line, f"Expressão lógica requer booleanos, mas obteve '{tipo}'.")
        return "bool"


    def visitExpcomp(self, ctx: lensParser.ExpcompContext):
        left = self.visit(ctx.arit(0))
        right = self.visit(ctx.arit(1)) if len(ctx.arit()) > 1 else None

        if right:
            if left != right:
                if {left, right} <= {"int", "float"}:
                    return "bool"
                self.error(ctx.start.line, f"Comparacão inválida entre tipos '{left}' e '{right}'.")
                return "erro"
            return "bool"
        return "bool" if left in ["bool"] else left
    

    def visitExp(self, ctx: lensParser.ExpContext):
        return self.visit(ctx.expTemplate())

    def visitExpTemplate(self, ctx: lensParser.ExpTemplateContext):
        if ctx.getToken(lensParser.VAR, 0):
            return self.visitValor(ctx)
        if ctx.getToken(lensParser.INT, 0):
            return "int"
        if ctx.getToken(lensParser.FLOAT, 0):
            return "float"
        if ctx.getToken(lensParser.STRING, 0):
            return "string"
        if ctx.getToken(lensParser.BOOL, 0):
            return "bool"
        if ctx.arit():
            return self.visit(ctx.arit())
        if ctx.explogi():
            return self.visit(ctx.explogi())
        if ctx.expcomp():
            return self.visit(ctx.expcomp())
        return "indefinido"


    def visitValor(self, ctx: lensParser.ValorContext):
        if ctx.getToken(lensParser.INT, 0): return "int"
        if ctx.getToken(lensParser.FLOAT, 0): return "float"
        if ctx.getToken(lensParser.BOOL, 0): return "bool"
        if ctx.getToken(lensParser.STRING, 0): return "string"
        if ctx.getToken(lensParser.VAR, 0):
            var_name = ctx.getToken(lensParser.VAR, 0).getText()
            simbolo = self.buscar_var(var_name, ctx.start.line)
            if simbolo:
                if not simbolo.get("atribuida", False):
                    self.error(ctx.start.line, f"Variável '{var_name}' usada antes de ser atribuída.")
                return simbolo["type"]
            else:
                return "indefinido"
        if ctx.aritp():
            return self.visit(ctx.aritp())
        return "indefinido"



    def visitAritp(self, ctx: lensParser.AritpContext):
        if ctx.explogi():
            return self.visit(ctx.explogi())
        return "indefinido"

    def visitIfcond(self, ctx: lensParser.IfcondContext):
        self.scope_stack.append({})
        self.visitChildren(ctx)
        self.scope_stack.pop()
        return None

    def visitElifcond(self, ctx: lensParser.ElifcondContext):
        self.scope_stack.append({})
        self.visitChildren(ctx)
        self.scope_stack.pop()
        return None

    def visitElcond(self, ctx: lensParser.ElcondContext):
        self.scope_stack.append({})
        self.visitChildren(ctx)
        self.scope_stack.pop()
        return None

    def visitLacofor(self, ctx: lensParser.LacoforContext):
        self.scope_stack.append({})
        self.visitChildren(ctx)
        self.scope_stack.pop()
        return None

    def visitLacowhile(self, ctx: lensParser.LacowhileContext):
        self.scope_stack.append({})
        self.visitChildren(ctx)
        self.scope_stack.pop()
        return None

    def comparar_tipos(self, tipo_destino, tipo_origem):
        if tipo_destino == tipo_origem:
            return True
        if {tipo_destino, tipo_origem} <= {"int", "float"}:
            return True  # coerção permitida
        return False


    def report(self):
        if not self.errors_found:
            logging.info("Análise semântica concluída sem erros.")
