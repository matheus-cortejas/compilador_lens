import logging

class LLVMIRGenerator:
    """
    Gerador de LLVM IR a partir de código TAC para Windows.
    """
    
    def __init__(self, tac_instructions):
        self.tac_instructions = tac_instructions
        self.llvm_code = []
        self.variable_map = {}
        self.temp_map = {}
        self.string_literals = {}
        self.string_counter = 0
        self.reg_counter = 1
        self.variable_types = {}
        self.string_variables = set()
        
    def generate(self):
        """Gera código LLVM IR completo."""
        self.llvm_code = []
        
        # Coletar strings e tipos
        self.collect_string_literals()
        
        # Gerar código
        self.emit_header()
        self.emit_main_start()
        
        for instr in self.tac_instructions:
            self.translate_instruction(instr)
        
        self.emit_main_end()
        return '\n'.join(self.llvm_code)
    
    def emit_header(self):
        """Emite cabeçalho LLVM IR para Windows."""
        self.llvm_code.extend([
            "; LLVM IR gerado pelo compilador - Windows",
            "target triple = \"x86_64-pc-windows-msvc\"",
            "target datalayout = \"e-m:w-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128\"",
            "",
            "; Declarações de funções externas para Windows",
            "declare dso_local i32 @printf(i8*, ...)",
            "declare dso_local i32 @scanf(i8*, ...)",
            "declare dso_local void @exit(i32)",
            ""
        ])
        
        # Formato para números
        self.llvm_code.append("@.str_int = private constant [4 x i8] c\"%d\\0A\\00\", align 1")
        
        # Strings do programa
        if self.string_literals:
            for string_val, label in self.string_literals.items():
                clean_string = string_val[1:-1]  # Remove aspas
                clean_string = clean_string.replace('\\', '\\\\').replace('"', '\\"')
                length = len(clean_string) + 2  # +1 para \n, +1 para \00
                self.llvm_code.append(f"@{label} = private constant [{length} x i8] c\"{clean_string}\\0A\\00\", align 1")
        
        self.llvm_code.append("")
    
    def emit_main_start(self):
        """Inicia função main para Windows."""
        self.llvm_code.extend([
            "define dso_local i32 @main() {",
            "entry:"
        ])
    
    def emit_main_end(self):
        """Finaliza função main."""
        self.llvm_code.extend([
            "  ret i32 0",
            "}"
        ])
    
    def get_next_reg(self):
        """Gera próximo registrador LLVM."""
        reg = f"%{self.reg_counter}"
        self.reg_counter += 1
        return reg
    
    def get_variable_reg(self, var_name):
        """Mapeia variável para registrador LLVM."""
        if var_name not in self.variable_map:
            self.variable_map[var_name] = self.get_next_reg()
        return self.variable_map[var_name]
    
    def get_operand_value(self, operand):
        """Converte operando para valor LLVM."""
        if isinstance(operand, str):
            if operand.isdigit() or (operand.startswith('-') and operand[1:].isdigit()):
                return operand
            else:
                return self.get_variable_reg(operand)
        return str(operand)
    
    def collect_string_literals(self):
        """Coleta strings literais e mapeia tipos."""
        for instr in self.tac_instructions:
            if instr['op'] == 'ASSIGN':
                if instr.get('arg1') and isinstance(instr['arg1'], str):
                    if instr['arg1'].startswith('"') and instr['arg1'].endswith('"'):
                        self.add_string_literal(instr['arg1'])
                        self.variable_types[instr['result']] = 'string'
                        self.string_variables.add(instr['result'])
                    else:
                        self.variable_types[instr['result']] = 'number'
            
            if instr['op'] == 'PRINT':
                if instr.get('arg1') and isinstance(instr['arg1'], str):
                    if instr['arg1'].startswith('"') and instr['arg1'].endswith('"'):
                        self.add_string_literal(instr['arg1'])
    
    def add_string_literal(self, string_value):
        """Adiciona string literal."""
        if string_value not in self.string_literals:
            self.string_counter += 1
            label = f"str_{self.string_counter}"
            self.string_literals[string_value] = label
    
    def translate_instruction(self, instr):
        """Traduz instrução TAC para LLVM IR."""
        op = instr['op']
        
        if op == 'ASSIGN':
            self.translate_assign(instr)
        elif op in ['+', '-', '*', '/']:
            self.translate_arithmetic(instr)
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
        elif op == 'LABEL':
            self.translate_label(instr)
        else:
            self.llvm_code.append(f"  ; OPERAÇÃO DESCONHECIDA: {op}")
    
    def translate_assign(self, instr):
        """Traduz atribuições."""
        src_value = instr['arg1']
        dst_reg = self.get_variable_reg(instr['result'])
        
        if isinstance(src_value, str) and src_value.startswith('"'):
            # String literal - armazenar ponteiro
            label = self.string_literals[src_value]
            length = len(src_value) - 1  # Remove aspas
            self.llvm_code.extend([
                f"  ; Atribuir string {src_value} para {instr['result']}",
                f"  {dst_reg} = getelementptr [{length} x i8], [{length} x i8]* @{label}, i32 0, i32 0"
            ])
        else:
            # Número ou variável
            src = self.get_operand_value(src_value)
            if src.isdigit() or (src.startswith('-') and src[1:].isdigit()):
                self.llvm_code.append(f"  {dst_reg} = add i64 0, {src}")
            else:
                self.llvm_code.append(f"  {dst_reg} = add i64 0, {src}")
    
    def translate_arithmetic(self, instr):
        """Traduz operações aritméticas."""
        op_map = {'+': 'add', '-': 'sub', '*': 'mul', '/': 'sdiv'}
        
        left = self.get_operand_value(instr['arg1'])
        right = self.get_operand_value(instr['arg2'])
        result_reg = self.get_variable_reg(instr['result'])
        
        llvm_op = op_map[instr['op']]
        
        self.llvm_code.extend([
            f"  ; {instr['arg1']} {instr['op']} {instr['arg2']} -> {instr['result']}",
            f"  {result_reg} = {llvm_op} i64 {left}, {right}"
        ])
    
    def translate_comparison(self, instr):
        """Traduz comparações."""
        cmp_map = {
            '==': 'eq', '!=': 'ne', '<': 'slt', 
            '<=': 'sle', '>': 'sgt', '>=': 'sge'
        }
        
        left = self.get_operand_value(instr['arg1'])
        right = self.get_operand_value(instr['arg2'])
        result_reg = self.get_variable_reg(instr['result'])
        
        temp_reg = self.get_next_reg()
        llvm_cmp = cmp_map[instr['op']]
        
        self.llvm_code.extend([
            f"  ; {instr['arg1']} {instr['op']} {instr['arg2']} -> {instr['result']}",
            f"  {temp_reg} = icmp {llvm_cmp} i64 {left}, {right}",
            f"  {result_reg} = zext i1 {temp_reg} to i64"
        ])
    
    def translate_logical(self, instr):
        """Traduz operações lógicas."""
        left = self.get_operand_value(instr['arg1'])
        right = self.get_operand_value(instr['arg2'])
        result_reg = self.get_variable_reg(instr['result'])
        
        # Converter para booleano primeiro
        temp1_reg = self.get_next_reg()
        temp2_reg = self.get_next_reg()
        temp3_reg = self.get_next_reg()
        
        if instr['op'] == '&&':
            self.llvm_code.extend([
                f"  ; {instr['arg1']} && {instr['arg2']} -> {instr['result']}",
                f"  {temp1_reg} = icmp ne i64 {left}, 0",
                f"  {temp2_reg} = icmp ne i64 {right}, 0",
                f"  {temp3_reg} = and i1 {temp1_reg}, {temp2_reg}",
                f"  {result_reg} = zext i1 {temp3_reg} to i64"
            ])
        elif instr['op'] == '||':
            self.llvm_code.extend([
                f"  ; {instr['arg1']} || {instr['arg2']} -> {instr['result']}",
                f"  {temp1_reg} = icmp ne i64 {left}, 0",
                f"  {temp2_reg} = icmp ne i64 {right}, 0",
                f"  {temp3_reg} = or i1 {temp1_reg}, {temp2_reg}",
                f"  {result_reg} = zext i1 {temp3_reg} to i64"
            ])
    
    def translate_print(self, instr):
        """Traduz print."""
        if instr['arg1'] and isinstance(instr['arg1'], str):
            if instr['arg1'].startswith('"'):
                # String literal
                label = self.string_literals[instr['arg1']]
                ptr_reg = self.get_next_reg()
                length = len(instr['arg1']) + 1  # +2 para \n\00, -1 para aspas
                self.llvm_code.extend([
                    f"  ; Imprimir string {instr['arg1']}",
                    f"  {ptr_reg} = getelementptr [{length} x i8], [{length} x i8]* @{label}, i32 0, i32 0",
                    f"  call i32 @printf(i8* {ptr_reg})"
                ])
            else:
                # Variável
                if instr['arg1'] in self.string_variables:
                    # Variável string
                    var_reg = self.get_variable_reg(instr['arg1'])
                    self.llvm_code.extend([
                        f"  ; Imprimir variável string {instr['arg1']}",
                        f"  call i32 @printf(i8* {var_reg})"
                    ])
                else:
                    # Variável numérica
                    var = self.get_operand_value(instr['arg1'])
                    format_reg = self.get_next_reg()
                    self.llvm_code.extend([
                        f"  ; Imprimir número {instr['arg1']}",
                        f"  {format_reg} = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0",
                        f"  call i32 @printf(i8* {format_reg}, i64 {var})"
                    ])
    
    def translate_read(self, instr):
        """Traduz operação de leitura."""
        var_reg = self.get_variable_reg(instr['result'])
        format_reg = self.get_next_reg()
        alloc_reg = self.get_next_reg()
        
        self.llvm_code.extend([
            f"  ; Ler valor para {instr['result']}",
            f"  {alloc_reg} = alloca i64, align 8",
            f"  {format_reg} = getelementptr [3 x i8], [3 x i8]* @.str_read, i32 0, i32 0",
            f"  call i32 @scanf(i8* {format_reg}, i64* {alloc_reg})",
            f"  {var_reg} = load i64, i64* {alloc_reg}, align 8"
        ])
        
        # Adicionar formato de leitura se ainda não existe
        if "@.str_read" not in str(self.llvm_code):
            header_index = next(i for i, line in enumerate(self.llvm_code) if line.startswith("@.str_int"))
            self.llvm_code.insert(header_index + 1, "@.str_read = private constant [3 x i8] c\"%d\\00\", align 1")
    
    def translate_goto(self, instr):
        """Traduz GOTO."""
        self.llvm_code.append(f"  br label %{instr['arg1']}")
    
    def translate_if_false(self, instr):
        """Traduz IF_FALSE (se condição é falsa, pula)."""
        condition = self.get_operand_value(instr['arg1'])
        temp_reg = self.get_next_reg()
        
        self.llvm_code.extend([
            f"  ; Se {instr['arg1']} é falso, pular para {instr['arg2']}",
            f"  {temp_reg} = icmp eq i64 {condition}, 0",
            f"  br i1 {temp_reg}, label %{instr['arg2']}, label %{self.get_next_label()}"
        ])
    
    def translate_if_true(self, instr):
        """Traduz IF_TRUE (se condição é verdadeira, pula)."""
        condition = self.get_operand_value(instr['arg1'])
        temp_reg = self.get_next_reg()
        
        self.llvm_code.extend([
            f"  ; Se {instr['arg1']} é verdadeiro, pular para {instr['arg2']}",
            f"  {temp_reg} = icmp ne i64 {condition}, 0",
            f"  br i1 {temp_reg}, label %{instr['arg2']}, label %{self.get_next_label()}"
        ])
    
    def translate_label(self, instr):
        """Traduz labels."""
        self.llvm_code.append(f"{instr['result']}:")
    
    def get_next_label(self):
        """Gera próximo label único."""
        label = f"label_{self.reg_counter}"
        self.reg_counter += 1
        return label
    
    def save_to_file(self, filename="output.ll"):
        """Salva em arquivo."""
        try:
            with open(filename, "w", encoding="utf-8") as f:
                f.write(self.generate())
            logging.info(f"LLVM IR salvo em '{filename}'")
            print(f"✅ LLVM IR gerado: {filename}")
            return True
        except Exception as e:
            logging.error(f"Erro ao salvar LLVM IR: {e}")
            print(f"❌ Erro ao salvar: {e}")
            return False