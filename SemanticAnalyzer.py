import logging
from generated.lensVisitor import lensVisitor
from generated.lensParser import lensParser
from colorama import init, Fore, Style
init(autoreset=True)

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
        """Visita declaração com 'let', atribui tipo e valor se houver."""
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
        """Visita atribuição solta: VAR = valor"""
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

    def visitArit(self, ctx: lensParser.AritContext):
        """Verifica operações aritméticas, coerções e divisão por zero."""
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

    def visitExplogi(self, ctx: lensParser.ExplogiContext):
        """Valida expressões lógicas: todos os termos devem ser booleanos."""
        exp_list = ctx.expcomp()
        for exp in exp_list:
            tipo = self.visit(exp)
            if tipo != "bool":
                self.error(ctx.start.line, f"Expressão lógica requer booleanos, mas obteve '{tipo}'.")
        return "bool"

    def visitExpcomp(self, ctx: lensParser.ExpcompContext):
        """Valida comparações. Aceita coerção implícita entre int/float."""
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

    def visitValor(self, ctx: lensParser.ValorContext):
        """Retorna o tipo de um valor literal ou variável."""
        if ctx.INT(): return "int"
        if ctx.FLOAT(): return "float"
        if ctx.BOOL(): return "bool"
        if ctx.VAR():
            var_name = ctx.VAR().getText()
            simbolo = self.buscar_var(var_name, ctx.start.line)
            if simbolo:
                if not simbolo.get("atribuida", False):
                    self.error(ctx.start.line, f"Variável '{var_name}' usada antes de ser atribuída.")
                return simbolo["type"]
        if ctx.aritp():
            return self.visit(ctx.aritp())
        return "indefinido"

    def visitAritp(self, ctx: lensParser.AritpContext):
        """Avalia uma subexpressão entre parênteses."""
        if ctx.explogi():
            return self.visit(ctx.explogi())
        return "indefinido"

    def visitIfcond(self, ctx: lensParser.IfcondContext):
        """Cria escopo para o bloco if."""
        self.scope_stack.append({})
        self.visitChildren(ctx)
        self.scope_stack.pop()
        return None

    def visitElifcond(self, ctx: lensParser.ElifcondContext):
        """Cria escopo para o bloco elseif."""
        self.scope_stack.append({})
        self.visitChildren(ctx)
        self.scope_stack.pop()
        return None

    def visitElcond(self, ctx: lensParser.ElcondContext):
        """Cria escopo para o bloco else."""
        self.scope_stack.append({})
        self.visitChildren(ctx)
        self.scope_stack.pop()
        return None

    def visitLacofor(self, ctx: lensParser.LacoforContext):
        """Cria escopo para o laço for."""
        self.scope_stack.append({})
        self.visitChildren(ctx)
        self.scope_stack.pop()
        return None

    def visitLacowhile(self, ctx: lensParser.LacowhileContext):
        """Cria escopo para o laço while."""
        self.scope_stack.append({})
        self.visitChildren(ctx)
        self.scope_stack.pop()
        return None

    def comparar_tipos(self, tipo_destino, tipo_origem):
        """Compara tipos permitindo coerção implícita entre int e float."""
        if tipo_destino == tipo_origem:
            return True
        if {tipo_destino, tipo_origem} <= {"int", "float"}:
            return True  # coerção permitida
        return False

    def report(self):
        """Imprime no log se não houve erro semântico."""
        if not self.errors_found:
            logging.info("Análise semântica concluída sem erros.")
