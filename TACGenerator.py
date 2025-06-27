import logging
from generated.lensVisitor import lensVisitor
from generated.lensParser import lensParser

class TACGenerator(lensVisitor):
    """
    Gerador de Código Intermediário TAC (Three-Address Code)
    para a linguagem Lens.
    """
    
    def __init__(self):
        self.instructions = []      # Lista de instruções TAC
        self.temp_counter = 0       # Contador de temporárias (t1, t2, t3...)
        self.label_counter = 0      # Contador de labels (L1, L2, L3...)
        
    def new_temp(self):
        """Gera uma nova variável temporária."""
        self.temp_counter += 1
        return f"t{self.temp_counter}"
    
    def new_label(self):
        """Gera um novo label."""
        self.label_counter += 1
        return f"L{self.label_counter}"
    
    def emit(self, op, arg1=None, arg2=None, result=None):
        """Emite uma instrução TAC."""
        instruction = {
            'op': op,
            'arg1': arg1,
            'arg2': arg2,
            'result': result
        }
        self.instructions.append(instruction)
        logging.info(f"TAC: {self.format_instruction(instruction)}")
        return instruction
    
    def format_instruction(self, instr):
        """Formata uma instrução TAC para exibição."""
        op = instr['op']
        arg1 = instr['arg1']
        arg2 = instr['arg2']
        result = instr['result']
        
        if op == 'ASSIGN':
            return f"{result} = {arg1}"
        elif op in ['+', '-', '*', '/', '%']:
            return f"{result} = {arg1} {op} {arg2}"
        elif op in ['==', '!=', '<', '<=', '>', '>=']:
            return f"{result} = {arg1} {op} {arg2}"
        elif op in ['&&', '||']:
            return f"{result} = {arg1} {op} {arg2}"
        elif op == 'PRINT':
            if arg2:
                return f"print {arg1}, {arg2}"
            return f"print {arg1}"
        elif op == 'READ':
            return f"read {result}"
        elif op == 'LABEL':
            return f"{result}:"
        elif op == 'GOTO':
            return f"goto {result}"
        elif op == 'IF_FALSE':
            return f"if_false {arg1} goto {result}"
        elif op == 'IF_TRUE':
            return f"if_true {arg1} goto {result}"
        else:
            return f"{op} {arg1} {arg2} {result}"
    
    def get_tac_code(self):
        """Retorna o código TAC formatado para exibição."""
        lines = []
        for i, instr in enumerate(self.instructions):
            lines.append(f"{i+1:3d}: {self.format_instruction(instr)}")
        return "\n".join(lines)
    
    def save_to_file(self, filename="output.tac"):
        """Salva o código TAC em arquivo."""
        try:
            with open(filename, "w", encoding="utf-8") as f:
                f.write("// Código Intermediário TAC - Linguagem Lens\n")
                f.write("// Gerado automaticamente pelo compilador\n\n")
                for instr in self.instructions:
                    f.write(self.format_instruction(instr) + "\n")
            return True
        except Exception as e:
            logging.error(f"Erro ao salvar TAC: {e}")
            return False

    # ========================================
    # VISITADORES PRINCIPAIS
    # ========================================
    
    def visitLens(self, ctx: lensParser.LensContext):
        """Ponto de entrada principal."""
        
        # Visitar todos os comandos
        for comando in ctx.comando():
            self.visit(comando)
        
        return None

    def visitDeclaracao(self, ctx: lensParser.DeclaracaoContext):
        """Gera TAC para declaração de variável."""
        var_name = ctx.VAR().getText()
        
        # Se há inicialização
        if hasattr(ctx, 'expressao') and ctx.expressao():
            expr_result = self.visit(ctx.expressao())
            self.emit('ASSIGN', expr_result, None, var_name)
        
        return var_name

    def visitAtribuicao(self, ctx: lensParser.AtribuicaoContext):
        """Gera TAC para atribuição."""
        var_name = ctx.VAR().getText()
        expr_result = self.visit(ctx.expressao())
        
        self.emit('ASSIGN', expr_result, None, var_name)
        return var_name

    def visitImpressao(self, ctx: lensParser.ImpressaoContext):
        """Gera TAC para comando print."""
        expressions = ctx.expressao()
        
        if len(expressions) == 1:
            # print :: expressao
            expr_result = self.visit(expressions[0])
            self.emit('PRINT', expr_result, None, None)
        elif len(expressions) == 2:
            # print :: "string", expressao
            string_result = self.visit(expressions[0])
            expr_result = self.visit(expressions[1])
            self.emit('PRINT', string_result, expr_result, None)
        
        return None

    def visitEntrada(self, ctx: lensParser.EntradaContext):
        """Gera TAC para comando read."""
        var_name = ctx.VAR().getText()
        self.emit('READ', None, None, var_name)
        return None

    # ========================================
    # EXPRESSÕES ARITMÉTICAS
    # ========================================

    def visitExpressao_arit(self, ctx: lensParser.Expressao_aritContext):
        """Gera TAC para expressões aritméticas (+, -)."""
        result = self.visit(ctx.termo_arit(0))
        
        for i in range(1, len(ctx.termo_arit())):
            op = ctx.op_adicao(i-1).getText()  # +, -
            right = self.visit(ctx.termo_arit(i))
            temp = self.new_temp()
            
            self.emit(op, result, right, temp)
            result = temp
        
        return result

    def visitTermo_arit(self, ctx: lensParser.Termo_aritContext):
        """Gera TAC para termos aritméticos (*, /, %)."""
        result = self.visit(ctx.fator(0))
        
        for i in range(1, len(ctx.fator())):
            op = ctx.op_multiplicacao(i-1).getText()  # *, /, %
            right = self.visit(ctx.fator(i))
            temp = self.new_temp()
            
            self.emit(op, result, right, temp)
            result = temp
        
        return result

    def visitFator(self, ctx: lensParser.FatorContext):
        """Gera TAC para fatores."""
        texto = ctx.getText()
        
        # Variável
        if hasattr(ctx, 'VAR') and ctx.VAR():
            return ctx.VAR().getText()
        
        # Literais diretos
        elif hasattr(ctx, 'INT') and ctx.INT():
            return ctx.INT().getText()
        elif hasattr(ctx, 'FLOAT') and ctx.FLOAT():
            return ctx.FLOAT().getText()
        elif hasattr(ctx, 'STRING') and ctx.STRING():
            return ctx.STRING().getText()
        elif hasattr(ctx, 'BOOL') and ctx.BOOL():
            return ctx.BOOL().getText()
        
        # Expressão entre parênteses
        elif hasattr(ctx, 'expressao') and ctx.expressao():
            return self.visit(ctx.expressao())
        
        # Fallback: analisar pelo texto
        elif texto.startswith('"') and texto.endswith('"'):
            return texto
        elif texto in ["True", "False"]:
            return texto
        elif '.' in texto and texto.replace('.', '').replace('-', '').isdigit():
            return texto
        elif texto.replace('-', '').isdigit():
            return texto
        
        return texto

    # ========================================
    # EXPRESSÕES LÓGICAS E COMPARAÇÃO
    # ========================================

    def visitExpressao_logica(self, ctx: lensParser.Expressao_logicaContext):
        """Gera TAC para expressões lógicas (&&, ||)."""
        result = self.visit(ctx.expressao_comparacao(0))
        
        for i in range(1, len(ctx.expressao_comparacao())):
            op = ctx.op_logico(i-1).getText()  # &&, ||
            right = self.visit(ctx.expressao_comparacao(i))
            temp = self.new_temp()
            
            self.emit(op, result, right, temp)
            result = temp
        
        return result

    def visitExpressao_comparacao(self, ctx: lensParser.Expressao_comparacaoContext):
        """Gera TAC para comparações."""
        result = self.visit(ctx.expressao_arit(0))
        
        if len(ctx.expressao_arit()) > 1:
            op = ctx.op_comparacao(0).getText()  # <, >, ==, !=, <=, >=
            right = self.visit(ctx.expressao_arit(1))
            temp = self.new_temp()
            
            self.emit(op, result, right, temp)
            result = temp
        
        return result

    def visitExpressao(self, ctx: lensParser.ExpressaoContext):
        """Gera TAC para expressão geral."""
        return self.visit(ctx.expressao_logica())

    def visitCondicao(self, ctx: lensParser.CondicaoContext):
        """Gera TAC para condição."""
        return self.visit(ctx.expressao_logica())

    # ========================================
    # ESTRUTURAS DE CONTROLE
    # ========================================

    def visitCondicional(self, ctx: lensParser.CondicionalContext):
        """Gera TAC para estruturas condicionais."""
        end_label = self.new_label()
        
        # IF
        for if_stmt in ctx.if_stmt():
            self.visit_if_statement(if_stmt, end_label)
        
        # ELSEIF
        for elseif_stmt in ctx.elseif_stmt():
            self.visit_elseif_statement(elseif_stmt, end_label)
        
        # ELSE
        if ctx.else_stmt():
            self.visit_else_statement(ctx.else_stmt())
        
        self.emit('LABEL', None, None, end_label)
        return None

    def visit_if_statement(self, ctx, end_label):
        """Processa statement IF."""
        else_label = self.new_label()
        
        # Avaliar condição
        condition = self.visit(ctx.condicao())
        self.emit('IF_FALSE', condition, None, else_label)
        
        # Comandos do IF
        for comando in ctx.comando():
            self.visit(comando)
        
        self.emit('GOTO', None, None, end_label)
        self.emit('LABEL', None, None, else_label)

    def visit_elseif_statement(self, ctx, end_label):
        """Processa statement ELSEIF."""
        else_label = self.new_label()
        
        # Avaliar condição
        condition = self.visit(ctx.condicao())
        self.emit('IF_FALSE', condition, None, else_label)
        
        # Comandos do ELSEIF
        for comando in ctx.comando():
            self.visit(comando)
        
        self.emit('GOTO', None, None, end_label)
        self.emit('LABEL', None, None, else_label)

    def visit_else_statement(self, ctx):
        """Processa statement ELSE."""
        # Comandos do ELSE
        for comando in ctx.comando():
            self.visit(comando)

    def visitLacowhile(self, ctx: lensParser.LacowhileContext):
        """Gera TAC para laço while."""
        start_label = self.new_label()
        end_label = self.new_label()
        
        self.emit('LABEL', None, None, start_label)
        
        # Avaliar condição
        condition = self.visit(ctx.condicao())
        self.emit('IF_FALSE', condition, None, end_label)
        
        # Comandos do while
        for comando in ctx.comando():
            self.visit(comando)
        
        self.emit('GOTO', None, None, start_label)
        self.emit('LABEL', None, None, end_label)
        
        return None

    def visitLacofor(self, ctx: lensParser.LacoforContext):
        """Gera TAC para laço for."""
        start_label = self.new_label()
        end_label = self.new_label()
        
        # Inicialização (se houver)
        if hasattr(ctx, 'declaracao') and ctx.declaracao():
            self.visit(ctx.declaracao())
        
        self.emit('LABEL', None, None, start_label)
        
        # Condição (se houver)
        if hasattr(ctx, 'condicao') and ctx.condicao():
            condition = self.visit(ctx.condicao())
            self.emit('IF_FALSE', condition, None, end_label)
        
        # Comandos do for
        for comando in ctx.comando():
            self.visit(comando)
        
        # Incremento (se houver)
        if hasattr(ctx, 'atribuicao') and ctx.atribuicao():
            self.visit(ctx.atribuicao())
        
        self.emit('GOTO', None, None, start_label)
        self.emit('LABEL', None, None, end_label)
        
        return None