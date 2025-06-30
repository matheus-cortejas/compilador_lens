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
        
        # CORREÇÃO 1: Separar registradores para dados e syscalls
        # Registradores para dados do programa (não usados em syscalls)
        self.data_registers = ['rbx', 'rcx', 'r8', 'r9', 'r10', 'r11', 'r12', 'r13', 'r14', 'r15']
        self.used_registers = set()
        
        # CORREÇÃO 2: Buffer para input
        self.input_buffer_size = 16

        self.variable_types = {}  # Mapeia variáveis para seus tipos
        self.string_variables = set()  # Variáveis que contêm strings
        
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
        """Emite cabeçalho corrigido."""
        self.assembly_code.extend([
            ".section .data"
        ])
        
        # CORREÇÃO: Sempre incluir dados auxiliares primeiro
        self.assembly_code.extend([
            "    # Dados auxiliares",
            "    newline: .asciz \"\\n\"",
            "    newline_len = . - newline",
            f"    input_buffer: .space {self.input_buffer_size}",
            "    number_buffer: .space 32",
            "    temp_char: .space 1"
        ])
        
        # Depois adicionar strings se existirem
        if self.string_literals:
            self.assembly_code.append("    # Strings do programa")
            for string_val, label in self.string_literals.items():
                clean_string = string_val[1:-1]  # Remove aspas
                clean_string = clean_string.replace('\\', '\\\\').replace('"', '\\"')
                self.assembly_code.extend([
                    f"    {label}: .asciz \"{clean_string}\"",
                    f"    {label}_len = . - {label} - 1"
                ])
        
        self.assembly_code.extend([
            "",
            ".section .text",
            "    .global _start",
            "",
            "_start:",
            "    pushq %rbp",
            "    movq %rsp, %rbp",
            ""
        ])
    
    def collect_string_literals(self):
        """Coleta strings E mapeia tipos de variáveis."""
        for instr in self.tac_instructions:
            # ASSIGN strings - mapear tipo da variável
            if instr['op'] == 'ASSIGN':
                if instr.get('arg1') and isinstance(instr['arg1'], str):
                    if instr['arg1'].startswith('"') and instr['arg1'].endswith('"'):
                        self.add_string_literal(instr['arg1'])
                        # MARCAR VARIÁVEL COMO STRING
                        self.variable_types[instr['result']] = 'string'
                        self.string_variables.add(instr['result'])
                    else:
                        # É número ou booleano
                        self.variable_types[instr['result']] = 'number'
            
            # PRINT strings
            if instr['op'] == 'PRINT':
                for arg in ['arg1', 'arg2']:
                    if instr.get(arg) and isinstance(instr[arg], str):
                        if instr[arg].startswith('"') and instr[arg].endswith('"'):
                            self.add_string_literal(instr[arg])
    
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
            "    # Finalizar programa",
            "    jmp exit_program",
            "",
            "exit_program:",
            "    # Restaurar stack frame",
            "    movq %rbp, %rsp",
            "    popq %rbp",
            "    # Syscall exit(0)",
            "    movq $60, %rax      # sys_exit",
            "    movq $0, %rdi       # status code 0",
            "    syscall"
        ])
    
    def get_register(self, identifier):
        """Aloca registrador - VERSÃO CORRIGIDA."""
        # Se já foi mapeado, retorna
        if identifier in self.temp_map:
            mapped = self.temp_map[identifier]
            # CORREÇÃO: Se é registrador (string), adiciona %. Se é stack location, retorna como está
            return f"%{mapped}" if isinstance(mapped, str) and not mapped.startswith('-') else mapped
        
        if identifier in self.variable_map:
            mapped = self.variable_map[identifier]
            # CORREÇÃO: Se é registrador (string), adiciona %. Se é stack location, retorna como está
            return f"%{mapped}" if isinstance(mapped, str) and not mapped.startswith('-') else mapped
        
        # CORREÇÃO: Tentar reaproveitar registradores para temporárias de curta duração
        if identifier.startswith('t') and len(identifier) > 2:
            # Temporária numerada - pode reaproveitar registradores
            temp_num = int(identifier[1:]) if identifier[1:].isdigit() else 0
            reg_index = temp_num % len(self.data_registers)
            reg = self.data_registers[reg_index]
            self.temp_map[identifier] = reg
            return f"%{reg}"
        
        # Para variáveis principais, usar registradores únicos
        for reg in self.data_registers:
            if reg not in self.used_registers:
                self.used_registers.add(reg)
                if identifier.startswith('t'):
                    self.temp_map[identifier] = reg
                else:
                    self.variable_map[identifier] = reg
                return f"%{reg}"
        
        # Stack como último recurso
        self.stack_offset += 8
        location = f"-{self.stack_offset}(%rbp)"
        
        if identifier.startswith('t'):
            self.temp_map[identifier] = location
        else:
            self.variable_map[identifier] = location
        
        return location
    
    def translate_instruction(self, instr):
        """Traduz uma instrução TAC para Assembly."""
        try:
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
                self.assembly_code.append(f"    # OPERAÇÃO DESCONHECIDA: {op}")
                
        except Exception as e:
            self.assembly_code.append(f"    # ERRO na instrução {instr}: {e}")
    
    def translate_label(self, instr):
        """Traduz labels."""
        label_name = instr['result']
        self.assembly_code.append(f"{label_name}:")
    
    def is_memory_operand(self, operand):
        """Verifica se o operando é um endereço de memória."""
        return operand and isinstance(operand, str) and '(%rbp)' in operand

    def translate_assign(self, instr):
        """Traduz atribuições - VERSÃO CORRIGIDA."""
        src_value = instr['arg1']
        dst = self.get_register(instr['result'])
        
        if isinstance(src_value, str) and src_value.startswith('"') and src_value.endswith('"'):
            # CORREÇÃO: Para strings, armazenar o ENDEREÇO DA STRING
            if src_value not in self.string_literals:
                self.add_string_literal(src_value)
            
            label = self.string_literals[src_value]
            self.assembly_code.extend([
                f"    # Atribuir string {src_value} para {instr['result']}",
                f"    leaq {label}(%rip), {dst}"  # ← LEA em vez de MOV $
            ])
        else:
            # Valor normal
            src = self.get_operand_value(src_value)
            
            # CORREÇÃO: Verificar se ambos são memória
            if self.is_memory_operand(src) and self.is_memory_operand(dst):
                # Usar registrador temporário
                self.assembly_code.extend([
                    f"    # Atribuir {src_value} para {instr['result']} (via %rax)",
                    f"    movq {src}, %rax",
                    f"    movq %rax, {dst}"
                ])
            else:
                self.assembly_code.extend([
                    f"    # Atribuir {src_value} para {instr['result']}",
                    f"    movq {src}, {dst}"
                ])
    
    def translate_arithmetic(self, instr):
        """Traduz operações aritméticas (+, -, *) - VERSÃO CORRIGIDA FINAL."""
        op = instr['op']
        left = self.get_operand_value(instr['arg1'])
        right = self.get_operand_value(instr['arg2'])
        result = self.get_register(instr['result'])
        
        self.assembly_code.append(f"    # {instr['arg1']} {op} {instr['arg2']} -> {instr['result']}")
        
        if op == '+':
            # CORREÇÃO: Evitar memory-to-memory SEMPRE
            self.assembly_code.extend([
                f"    movq {left}, %rax",      # Move left para %rax
                f"    addq {right}, %rax",     # Adiciona right a %rax  
                f"    movq %rax, {result}"     # Move resultado final
            ])
            
        elif op == '-':
            # CORREÇÃO: Evitar memory-to-memory SEMPRE
            self.assembly_code.extend([
                f"    movq {left}, %rax",      # Move left para %rax
                f"    subq {right}, %rax",     # Subtrai right de %rax
                f"    movq %rax, {result}"     # Move resultado final
            ])
            
        elif op == '*':
            # CORREÇÃO: Multiplicação sempre via %rax
            self.assembly_code.extend([
                f"    pushq %rax     # Preservar RAX",
                f"    movq {left}, %rax"
            ])
            
            if right.startswith('$'):
                # Para literal: usar imulq $valor, %rax
                self.assembly_code.append(f"    imulq {right}, %rax")
            else:
                # Para registrador/memória: usar imulq operand
                self.assembly_code.append(f"    imulq {right}")
            
            self.assembly_code.extend([
                f"    movq %rax, {result}",
                f"    popq %rax      # Restaurar RAX"
            ])
    
    def translate_division(self, instr):
        """Traduz divisão (usa RAX/RDX) - VERSÃO CORRIGIDA."""
        left = self.get_operand_value(instr['arg1'])
        right = self.get_operand_value(instr['arg2'])
        result = self.get_register(instr['result'])
        
        self.assembly_code.extend([
            f"    # {instr['arg1']} / {instr['arg2']} -> {instr['result']}",
            f"    pushq %rax     # Preservar RAX",
            f"    pushq %rdx     # Preservar RDX"
        ])
        
        if right.startswith('$'):
            # Se é literal, usar um registrador temporário
            self.assembly_code.extend([
                f"    pushq %rcx     # Usar RCX como temporário",
                f"    movq {left}, %rax",
                f"    movq {right}, %rcx",
                f"    cqto",
                f"    idivq %rcx",
                f"    movq %rax, {result}",
                f"    popq %rcx      # Restaurar RCX"
            ])
        else:
            # Se é registrador/memória
            self.assembly_code.extend([
                f"    movq {left}, %rax",
                f"    cqto",
                f"    idivq {right}",
                f"    movq %rax, {result}"
            ])
        
        self.assembly_code.extend([
            f"    popq %rdx      # Restaurar RDX",
            f"    popq %rax      # Restaurar RAX"
        ])

    def translate_comparison(self, instr):
        """Traduz comparações - VERSÃO CORRIGIDA FINAL."""
        op = instr['op']
        left = self.get_operand_value(instr['arg1'])
        right = self.get_operand_value(instr['arg2'])
        result = self.get_register(instr['result'])
        
        set_instructions = {
            '==': 'sete',
            '!=': 'setne', 
            '<': 'setl',
            '<=': 'setle',
            '>': 'setg',
            '>=': 'setge'
        }
        
        # CORREÇÃO REAL: left COMPARE right (não right compare left)
        self.assembly_code.extend([
            f"    # {instr['arg1']} {op} {instr['arg2']} -> {instr['result']}",
            f"    pushq %rax",
            f"    pushq %rbx",
            f"    movq {left}, %rax",   # left em %rax
            f"    movq {right}, %rbx",  # right em %rbx
            f"    cmpq %rbx, %rax",     # Comparar %rax (left) com %rbx (right)
            f"    {set_instructions[op]} %al",
            f"    movzbq %al, %rax",
            f"    movq %rax, {result}",
            f"    popq %rbx",
            f"    popq %rax"
        ])

    def translate_logical(self, instr):
        """Traduz operações lógicas (&&, ||) - VERSÃO CORRIGIDA."""
        op = instr['op']
        left = self.get_operand_value(instr['arg1'])
        right = self.get_operand_value(instr['arg2'])
        result = self.get_register(instr['result'])
        
        if op == '&&':
            end_label = f"and_end_{self.get_unique_id()}"
            
            # CORREÇÃO: Evitar memory-to-memory
            if self.is_memory_operand(left) and self.is_memory_operand(result):
                self.assembly_code.extend([
                    f"    # {instr['arg1']} && {instr['arg2']} -> {instr['result']}",
                    f"    movq {left}, %rax",
                    f"    movq %rax, {result}",
                    f"    cmpq $0, {result}",
                    f"    je {end_label}"
                ])
            else:
                self.assembly_code.extend([
                    f"    # {instr['arg1']} && {instr['arg2']} -> {instr['result']}",
                    f"    movq {left}, {result}",
                    f"    cmpq $0, {result}",
                    f"    je {end_label}"
                ])
            
            # Para o segundo operando
            if self.is_memory_operand(right) and self.is_memory_operand(result):
                self.assembly_code.extend([
                    f"    movq {right}, %rax",
                    f"    movq %rax, {result}"
                ])
            else:
                self.assembly_code.append(f"    movq {right}, {result}")
            
            self.assembly_code.append(f"{end_label}:")
            
        elif op == '||':
            end_label = f"or_end_{self.get_unique_id()}"
            
            # CORREÇÃO: Evitar memory-to-memory
            if self.is_memory_operand(left) and self.is_memory_operand(result):
                self.assembly_code.extend([
                    f"    # {instr['arg1']} || {instr['arg2']} -> {instr['result']}",
                    f"    movq {left}, %rax",
                    f"    movq %rax, {result}",
                    f"    cmpq $0, {result}",
                    f"    jne {end_label}"
                ])
            else:
                self.assembly_code.extend([
                    f"    # {instr['arg1']} || {instr['arg2']} -> {instr['result']}",
                    f"    movq {left}, {result}",
                    f"    cmpq $0, {result}",
                    f"    jne {end_label}"
                ])
            
            # Para o segundo operando
            if self.is_memory_operand(right) and self.is_memory_operand(result):
                self.assembly_code.extend([
                    f"    movq {right}, %rax",
                    f"    movq %rax, {result}"
                ])
            else:
                self.assembly_code.append(f"    movq {right}, {result}")
            
            self.assembly_code.append(f"{end_label}:")
    
    def translate_print(self, instr):
        """Traduz comando print."""
        self.assembly_code.append(f"    # PRINT: {instr}")
        
        # CORREÇÃO 8: Melhor tratamento de print
        if instr['arg2']:  
            # Formato: print "string", value
            if instr['arg1']:
                self.print_string_or_value(instr['arg1'])
            if instr['arg2']:
                self.print_string_or_value(instr['arg2'])
        else:  
            # Formato: print value
            if instr['arg1']:
                self.print_string_or_value(instr['arg1'])
        
        # Sempre print newline no final
        self.print_newline()
    
    def print_number_complete(self, value_operand, unique_id):
        """Versão completa para imprimir números de qualquer tamanho."""
        return [
            f"    # Imprimir número completo: {value_operand}",
            f"    pushq %rax",
            f"    pushq %rdi", 
            f"    pushq %rsi",
            f"    pushq %rdx",
            f"    pushq %rcx",
            f"    pushq %r8",
            f"    # Carregar número",
            f"    movq {value_operand}, %rax",
            f"    # Buffer para conversão",
            f"    movq $number_buffer, %rdi",
            f"    addq $31, %rdi  # Apontar para o final do buffer",
            f"    movb $0, (%rdi)  # Terminar string",
            f"    movq $10, %rcx   # Base 10",
            f"    # Verificar sinal",
            f"    cmpq $0, %rax",
            f"    jge convert_loop_{unique_id}",
            f"    # Número negativo",
            f"    negq %rax",
            f"    movb $45, temp_char  # '-'",
            f"    pushq %rax",
            f"    movq $1, %rax",
            f"    movq $1, %rdi", 
            f"    movq $temp_char, %rsi",
            f"    movq $1, %rdx",
            f"    syscall",
            f"    popq %rax",
            f"    movq $number_buffer, %rdi",
            f"    addq $31, %rdi",
            f"convert_loop_{unique_id}:",
            f"    decq %rdi",
            f"    xorq %rdx, %rdx",
            f"    divq %rcx",
            f"    addq $48, %rdx  # Converter para ASCII",
            f"    movb %dl, (%rdi)",
            f"    testq %rax, %rax",
            f"    jnz convert_loop_{unique_id}",
            f"    # Imprimir string convertida",
            f"    movq $number_buffer, %rsi",
            f"    addq $32, %rsi",
            f"    subq %rdi, %rsi  # Calcular comprimento",
            f"    movq %rsi, %rdx",
            f"    movq %rdi, %rsi",
            f"    movq $1, %rax",
            f"    movq $1, %rdi",
            f"    syscall",
            f"    # Restaurar registradores",
            f"    popq %r8",
            f"    popq %rcx",
            f"    popq %rdx",
            f"    popq %rsi",
            f"    popq %rdi",
            f"    popq %rax"
        ]

    def print_string_or_value(self, operand):
        """Versão REAL - usa sistema de tipos."""
        if operand and isinstance(operand, str) and operand.startswith('"') and operand.endswith('"'):
            # É uma string literal
            self.print_string(operand)
        elif operand in self.string_variables:
            # É uma variável que contém string - imprimir como string
            self.print_string_variable(operand)
        else:
            # É um valor numérico
            self.print_value(operand)
    
    def print_string(self, string_literal):
        """Imprime uma string literal."""
        if string_literal not in self.string_literals:
            self.add_string_literal(string_literal)
        
        label = self.string_literals[string_literal]
        
        self.assembly_code.extend([
            f"    # Imprimir string {string_literal}",
            f"    pushq %rax",
            f"    pushq %rdi",
            f"    pushq %rsi",
            f"    pushq %rdx",
            f"    movq $1, %rax      # sys_write",
            f"    movq $1, %rdi      # stdout",
            f"    movq ${label}, %rsi",
            f"    movq ${label}_len, %rdx",
            f"    syscall",
            f"    popq %rdx",
            f"    popq %rsi",
            f"    popq %rdi",
            f"    popq %rax"
        ])

    def print_string_variable(self, var_name):
        """Versão simplificada - usa tamanho pré-calculado."""
        
        # Encontrar qual string foi atribuída a esta variável
        for instr in self.tac_instructions:
            if (instr['op'] == 'ASSIGN' and 
                instr['result'] == var_name and 
                isinstance(instr['arg1'], str) and 
                instr['arg1'].startswith('"')):
                
                # Encontrou! Imprimir diretamente a string literal
                string_literal = instr['arg1']
                label = self.string_literals[string_literal]
                
                self.assembly_code.extend([
                    f"    # Imprimir string da variável {var_name} = {string_literal}",
                    f"    pushq %rax",
                    f"    pushq %rdi",
                    f"    pushq %rsi",
                    f"    pushq %rdx",
                    f"    movq $1, %rax      # sys_write",
                    f"    movq $1, %rdi      # stdout",
                    f"    movq ${label}, %rsi",      # ← Endereço direto da string
                    f"    movq ${label}_len, %rdx",  # ← Tamanho pré-calculado
                    f"    syscall",
                    f"    popq %rdx",
                    f"    popq %rsi",
                    f"    popq %rdi",
                    f"    popq %rax"
                ])
                return
        
        # Se não encontrou, imprimir como número (fallback)
        self.print_value(var_name)
    
    def print_value(self, value):
        """Imprime um valor - VERSÃO CORRIGIDA."""
        if value is None:
            return
        
        value_operand = self.get_operand_value(value)
        
        # CORREÇÃO: IDs únicos consistentes
        unique_id = self.get_unique_id()
        
        self.assembly_code.extend(self.print_number_complete(value_operand, unique_id))
    
    def print_newline(self):
        """Imprime quebra de linha."""
        self.assembly_code.extend([
            f"    # Imprimir newline",
            f"    pushq %rax",
            f"    pushq %rdi", 
            f"    pushq %rsi",
            f"    pushq %rdx",
            f"    movq $1, %rax      # sys_write",
            f"    movq $1, %rdi      # stdout",
            f"    movq $newline, %rsi",
            f"    movq $newline_len, %rdx",
            f"    syscall",
            f"    popq %rdx",
            f"    popq %rsi",
            f"    popq %rdi",
            f"    popq %rax"
        ])
    
    def translate_read(self, instr):
        """Traduz comando read - VERSÃO MELHORADA."""
        var_name = instr['result']
        result = self.get_register(var_name)
        
        self.assembly_code.extend([
            f"    # Ler entrada para {var_name}",
            f"    # Preservar registradores",
            f"    pushq %rax",
            f"    pushq %rdi",
            f"    pushq %rsi", 
            f"    pushq %rdx",
            f"    # Syscall read",
            f"    movq $0, %rax         # sys_read",
            f"    movq $0, %rdi         # stdin",
            f"    movq $input_buffer, %rsi",
            f"    movq ${self.input_buffer_size}, %rdx",
            f"    syscall",
            f"    # Conversão básica: primeiro caractere - '0'",
            f"    movb input_buffer(%rip), %al",
            f"    subb $48, %al         # Converter ASCII para número",
            f"    movzbq %al, %rax      # Estender para 64 bits",
            f"    # Verificar se é válido (0-9)",
            f"    cmpq $9, %rax",
            f"    jle valid_input_{self.get_unique_id()}",
            f"    # Input inválido, usar 42 como fallback",
            f"    movq $42, %rax",
            f"valid_input_{self.get_unique_id() - 1}:",
            f"    movq %rax, {result}",
            f"    # Restaurar registradores",
            f"    popq %rdx",
            f"    popq %rsi",
            f"    popq %rdi",
            f"    popq %rax"
        ])
    
    def translate_goto(self, instr):
        """Traduz salto incondicional."""
        self.assembly_code.append(f"    jmp {instr['result']}")
    
    def translate_if_false(self, instr):
        """Traduz salto condicional se falso."""
        condition = self.get_operand_value(instr['arg1'])
        label = instr['result']
        
        self.assembly_code.extend([
            f"    # Se {instr['arg1']} == 0, ir para {label}",
            f"    cmpq $0, {condition}",
            f"    je {label}"
        ])
    
    def translate_if_true(self, instr):
        """Traduz salto condicional se verdadeiro."""
        condition = self.get_operand_value(instr['arg1'])
        label = instr['result']
        
        self.assembly_code.extend([
            f"    # Se {instr['arg1']} != 0, ir para {label}",
            f"    cmpq $0, {condition}",
            f"    jne {label}"
        ])
    
    def get_operand_value(self, operand):
        """Obtém valor do operando - VERSÃO CORRIGIDA."""
        if operand is None:
            return "$0"
        elif isinstance(operand, str):
            if operand.isdigit() or (operand.startswith('-') and operand[1:].isdigit()):
                return f"${operand}"
            elif '.' in operand and operand.replace('.', '').replace('-', '').isdigit():
                # Float -> int
                try:
                    int_val = int(float(operand))
                    return f"${int_val}"
                except:
                    return "$0"
            elif operand in ["True", "true"]:
                return "$1"
            elif operand in ["False", "false"]:
                return "$0"
            elif operand.startswith('"') and operand.endswith('"'):
                # String literal - retornar endereço se existe
                if operand in self.string_literals:
                    return f"${self.string_literals[operand]}"
                # Se não existe, adicionar
                self.add_string_literal(operand)
                return f"${self.string_literals[operand]}"
            else:
                # Variável ou temporária
                return self.get_register(operand)
        else:
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