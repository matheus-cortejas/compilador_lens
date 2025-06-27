import logging

class X86AssemblyGenerator:
    """
    Gerador de Assembly x86-64 a partir de código TAC.
    Gera apenas o código Assembly como texto (sem compilação).
    """
    
    def __init__(self, tac_instructions):
        self.tac_instructions = tac_instructions
        self.assembly_code = []
        self.variable_map = {}  # Mapeia variáveis para registradores/stack
        self.temp_map = {}      # Mapeia temporárias para registradores
        self.label_map = {}     # Mapeia labels TAC para Assembly
        self.stack_offset = 0   # Offset atual na stack
        self.string_literals = {}  # Mapeia strings para labels
        self.string_counter = 0    # Contador de strings
        
        # Registradores disponíveis (x86-64) - excluindo RAX/RDX que são especiais
        self.registers = ['rbx', 'rcx', 'rsi', 'rdi', 'r8', 'r9', 'r10', 'r11', 'r12', 'r13', 'r14', 'r15']
        self.used_registers = set()
        
    def generate(self):
        """Gera código Assembly completo."""
        self.assembly_code = []  # Reset
        
        # Primeiro passo: coletar strings
        self.collect_string_literals()
        
        # Gerar o código
        self.emit_header()
        
        for instr in self.tac_instructions:
            self.translate_instruction(instr)
        
        self.emit_footer()
        return '\n'.join(self.assembly_code)
    
    def emit_header(self):
        """Emite cabeçalho do Assembly."""
        self.assembly_code.extend([
            "# =============================================================================",
            "# Assembly x86-64 gerado pelo Compilador Lens",
            "# =============================================================================",
            "# Para compilar e executar:",
            "#   as -64 output.s -o output.o",
            "#   ld output.o -o programa",
            "#   ./programa",
            "# =============================================================================",
            "",
            ".section .data",
            "    # Strings do programa"
        ])
        
        # Adicionar strings literais coletadas
        if self.string_literals:
            for string_val, label in self.string_literals.items():
                clean_string = string_val[1:-1]  # Remove aspas
                # Escapar caracteres especiais
                clean_string = clean_string.replace('\\', '\\\\').replace('"', '\\"')
                self.assembly_code.extend([
                    f"    {label}: .ascii \"{clean_string}\"",
                    f"    {label}_len = . - {label}"
                ])
        else:
            self.assembly_code.append("    # (Nenhuma string literal encontrada)")
        
        # Newline para prints
        self.assembly_code.extend([
            "    newline: .ascii \"\\n\"",
            "    newline_len = . - newline",
            "",
            "# =============================================================================",
            ".section .text",
            "    .global _start",
            "",
            "_start:",
            "    # Configurar stack frame",
            "    pushq %rbp",
            "    movq %rsp, %rbp",
            ""
        ])
    
    def collect_string_literals(self):
        """Coleta todas as strings literais para a seção de dados."""
        for instr in self.tac_instructions:
            if instr['op'] == 'PRINT':
                # Verifica arg1
                if instr['arg1'] and isinstance(instr['arg1'], str):
                    if instr['arg1'].startswith('"') and instr['arg1'].endswith('"'):
                        self.add_string_literal(instr['arg1'])
                
                # Verifica arg2  
                if instr['arg2'] and isinstance(instr['arg2'], str):
                    if instr['arg2'].startswith('"') and instr['arg2'].endswith('"'):
                        self.add_string_literal(instr['arg2'])
    
    def add_string_literal(self, string_value):
        """Adiciona uma string literal à seção de dados."""
        if string_value not in self.string_literals:
            self.string_counter += 1
            label = f"str_{self.string_counter}"
            self.string_literals[string_value] = label
    
    def emit_footer(self):
        """Emite rodapé do Assembly."""
        self.assembly_code.extend([
            "",
            "# =============================================================================", 
            "# Finalização do programa",
            "# =============================================================================",
            "",
            "exit_program:",
            "    # Restaurar stack frame",
            "    movq %rbp, %rsp",
            "    popq %rbp",
            "",
            "    # Syscall exit(0)",
            "    movq $60, %rax      # sys_exit",
            "    movq $0, %rdi       # status code 0",
            "    syscall",
            "",
            "# =============================================================================",
            "# Fim do código Assembly",
            "# ============================================================================="
        ])
    
    def get_register(self, identifier):
        """Aloca registrador para variável/temporária."""
        # Se já foi mapeado, retorna
        if identifier in self.temp_map:
            return f"%{self.temp_map[identifier]}"
        
        if identifier in self.variable_map:
            return f"%{self.variable_map[identifier]}"
        
        # Alocar novo registrador
        for reg in self.registers:
            if reg not in self.used_registers:
                self.used_registers.add(reg)
                if identifier.startswith('t'):
                    self.temp_map[identifier] = reg
                else:
                    self.variable_map[identifier] = reg
                return f"%{reg}"
        
        # Se não há registradores livres, usar stack
        self.stack_offset += 8
        location = f"-{self.stack_offset}(%rbp)"
        
        if identifier.startswith('t'):
            self.temp_map[identifier] = location
        else:
            self.variable_map[identifier] = location
        
        return location
    
    def translate_instruction(self, instr):
        """Traduz uma instrução TAC para Assembly."""
        op = instr['op']
        
        if op == 'LABEL':
            self.translate_label(instr)
        elif op == 'ASSIGN':
            self.translate_assign(instr)
        elif op in ['+', '-', '*']:
            self.translate_arithmetic(instr)
        elif op == '/':
            self.translate_division(instr)
        elif op in ['==', '!=', '<', '<=', '>', '>=']:
            self.translate_comparison(instr)
        elif op in ['&&', '||']:
            self.translate_logical(instr)
        elif op == 'PRINT':
            self.translate_print(instr)
        elif op == 'read':
            self.translate_read(instr)
        elif op == 'GOTO':
            self.translate_goto(instr)
        elif op == 'IF_FALSE':
            self.translate_if_false(instr)
        elif op == 'IF_TRUE':
            self.translate_if_true(instr)
        else:
            self.assembly_code.append(f"    # OPERAÇÃO NÃO IMPLEMENTADA: {op}")
        
        self.assembly_code.append("")  # Linha em branco para legibilidade
    
    def translate_label(self, instr):
        """Traduz labels."""
        label_name = instr['result']
        if label_name in ['START', 'END']:
            self.assembly_code.append(f"{label_name.lower()}:")
        else:
            self.assembly_code.append(f"{label_name}:")
    
    def translate_assign(self, instr):
        """Traduz atribuições."""
        src = self.get_operand_value(instr['arg1'])
        dst = self.get_register(instr['result'])
        
        self.assembly_code.append(f"    movq {src}, {dst}")
    
    def translate_arithmetic(self, instr):
        """Traduz operações aritméticas (+, -, *)."""
        op = instr['op']
        left = self.get_operand_value(instr['arg1'])
        right = self.get_operand_value(instr['arg2'])
        result = self.get_register(instr['result'])
        
        if op == '+':
            self.assembly_code.extend([
                f"    movq {left}, {result}",
                f"    addq {right}, {result}"
            ])
        elif op == '-':
            self.assembly_code.extend([
                f"    movq {left}, {result}",
                f"    subq {right}, {result}"
            ])
        elif op == '*':
            # Multiplicação usa %rax como acumulador
            self.assembly_code.extend([
                f"    movq {left}, %rax",
                f"    imulq {right}, %rax",
                f"    movq %rax, {result}"
            ])
    
    def translate_division(self, instr):
        """Traduz divisão (usa RAX/RDX)."""
        left = self.get_operand_value(instr['arg1'])
        right = self.get_operand_value(instr['arg2'])
        result = self.get_register(instr['result'])
        
        self.assembly_code.extend([
            f"    movq {left}, %rax",
            f"    cqto                 # Estende sinal RAX para RDX:RAX",
            f"    idivq {right}        # RAX = RDX:RAX / operando",
            f"    movq %rax, {result}"
        ])
    
    def translate_comparison(self, instr):
        """Traduz comparações."""
        op = instr['op']
        left = self.get_operand_value(instr['arg1'])
        right = self.get_operand_value(instr['arg2'])
        result = self.get_register(instr['result'])
        
        # Mapear operadores para instruções set
        set_instructions = {
            '==': 'sete',   # Set if Equal
            '!=': 'setne',  # Set if Not Equal 
            '<': 'setl',    # Set if Less
            '<=': 'setle',  # Set if Less or Equal
            '>': 'setg',    # Set if Greater
            '>=': 'setge'   # Set if Greater or Equal
        }
        
        self.assembly_code.extend([
            f"    cmpq {right}, {left}",
            f"    {set_instructions[op]} %al",
            f"    movzbq %al, {result}    # Zera-estende AL para 64 bits"
        ])
    
    def translate_logical(self, instr):
        """Traduz operações lógicas (&&, ||)."""
        op = instr['op']
        left = self.get_operand_value(instr['arg1'])
        right = self.get_operand_value(instr['arg2'])
        result = self.get_register(instr['result'])
        
        if op == '&&':
            # AND: result = (left != 0) && (right != 0)
            end_label = f"and_end_{self.get_unique_id()}"
            self.assembly_code.extend([
                f"    movq {left}, {result}",
                f"    cmpq $0, {result}",
                f"    je {end_label}       # Se left = 0, resultado = 0",
                f"    movq {right}, {result}",
                f"    cmpq $0, {result}",
                f"    setne %al",
                f"    movzbq %al, {result}",
                f"{end_label}:"
            ])
        elif op == '||':
            # OR: result = (left != 0) || (right != 0)
            end_label = f"or_end_{self.get_unique_id()}"
            self.assembly_code.extend([
                f"    movq {left}, {result}",
                f"    cmpq $0, {result}",
                f"    jne {end_label}      # Se left != 0, resultado = left",
                f"    movq {right}, {result}",
                f"{end_label}:"
            ])
    
    def translate_print(self, instr):
        """Traduz comando print."""
        if instr['arg2']:  
            # Formato: print "string", value
            self.print_string(instr['arg1'])
            self.print_value(instr['arg2'])
        else:  
            # Formato: print value
            if instr['arg1'] and instr['arg1'].startswith('"'):
                self.print_string(instr['arg1'])
            else:
                self.print_value(instr['arg1'])
        
        # Sempre print newline no final
        self.print_newline()
    
    def print_string(self, string_value):
        """Imprime uma string literal."""
        if string_value in self.string_literals:
            label = self.string_literals[string_value]
            self.assembly_code.extend([
                f"    # Imprimir string: {string_value}",
                f"    movq $1, %rax        # sys_write",
                f"    movq $1, %rdi        # stdout",
                f"    movq ${label}, %rsi  # endereço da string",
                f"    movq ${label}_len, %rdx  # tamanho da string",
                f"    syscall"
            ])
        else:
            self.assembly_code.append(f"    # ERRO: String {string_value} não encontrada!")
    
    def print_value(self, value):
        """Imprime um valor (número ou variável)."""
        # Versão simplificada - apenas coloca o valor em %rax
        # Em implementação real, converteria número para string
        value_operand = self.get_operand_value(value)
        self.assembly_code.extend([
            f"    # Imprimir valor: {value} (simplificado)",
            f"    movq {value_operand}, %rax",
            f"    # TODO: Converter número para string e imprimir"
        ])
    
    def print_newline(self):
        """Imprime quebra de linha."""
        self.assembly_code.extend([
            f"    # Imprimir newline",
            f"    movq $1, %rax        # sys_write",
            f"    movq $1, %rdi        # stdout",
            f"    movq $newline, %rsi  # endereço do \\n",
            f"    movq $newline_len, %rdx  # tamanho = 1",
            f"    syscall"
        ])
    
    def translate_read(self, instr):
        """Traduz comando read."""
        result = self.get_register(instr['result'])
        self.assembly_code.extend([
            f"    # Ler entrada (implementação simplificada)",
            f"    # TODO: Implementar syscall read real",
            f"    movq $42, {result}   # Valor placeholder"
        ])
    
    def translate_goto(self, instr):
        """Traduz salto incondicional."""
        self.assembly_code.append(f"    jmp {instr['result']}")
    
    def translate_if_false(self, instr):
        """Traduz salto condicional se falso."""
        condition = self.get_operand_value(instr['arg1'])
        label = instr['result']
        
        self.assembly_code.extend([
            f"    cmpq $0, {condition}",
            f"    je {label}           # Salta se condição = 0 (falso)"
        ])
    
    def translate_if_true(self, instr):
        """Traduz salto condicional se verdadeiro."""
        condition = self.get_operand_value(instr['arg1'])
        label = instr['result']
        
        self.assembly_code.extend([
            f"    cmpq $0, {condition}",
            f"    jne {label}          # Salta se condição != 0 (verdadeiro)"
        ])
    
    def format_tac_instruction(self, instr):
        """Formata instrução TAC para comentário."""
        op = instr['op']
        
        if op == 'ASSIGN':
            return f"{instr['result']} = {instr['arg1']}"
        elif op in ['+', '-', '*', '/', '==', '!=', '<', '<=', '>', '>=', '&&', '||']:
            return f"{instr['result']} = {instr['arg1']} {op} {instr['arg2']}"
        elif op == 'PRINT':
            if instr['arg2']:
                return f"print {instr['arg1']}, {instr['arg2']}"
            return f"print {instr['arg1']}"
        elif op == 'LABEL':
            return f"{instr['result']}:"
        elif op == 'GOTO':
            return f"goto {instr['result']}"
        elif op == 'IF_FALSE':
            return f"if_false {instr['arg1']} goto {instr['result']}"
        elif op == 'IF_TRUE':
            return f"if_true {instr['arg1']} goto {instr['result']}"
        elif op == 'read':
            return f"read {instr['result']}"
        else:
            return f"{op} {instr['arg1']} {instr['arg2']} {instr['result']}"
    
    def get_operand_value(self, operand):
        """Obtém valor do operando (literal, variável ou temporária)."""
        if operand is None:
            return "$0"
        elif isinstance(operand, str):
            # Literal numérico
            if operand.isdigit() or (operand.startswith('-') and operand[1:].isdigit()):
                return f"${operand}"
            # String literal (não deve chegar aqui para operandos aritméticos)
            elif operand.startswith('"') and operand.endswith('"'):
                return operand  # Retorna como está para tratamento especial
            # Variável ou temporária
            else:
                return self.get_register(operand)
        else:
            # Caso seja outro tipo, converte para string
            return f"${str(operand)}"
    
    def get_unique_id(self):
        """Gera ID único para labels internos."""
        if not hasattr(self, '_unique_counter'):
            self._unique_counter = 0
        self._unique_counter += 1
        return self._unique_counter
    
    def save_to_file(self, filename="output.s"):
        """Salva código Assembly em arquivo."""
        try:
            with open(filename, "w", encoding="utf-8") as f:
                f.write(self.generate())
            logging.info(f"Assembly x86-64 salvo em '{filename}'")
            return True
        except Exception as e:
            logging.error(f"Erro ao salvar Assembly: {e}")
            print(f"❌ Erro ao salvar Assembly: {e}")
            return False