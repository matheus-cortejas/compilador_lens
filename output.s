.section .data
    # Dados auxiliares
    newline: .asciz "\n"
    newline_len = . - newline
    input_buffer: .space 16
    number_buffer: .space 32
    temp_char: .space 1
    # Strings do programa
    str_1: .asciz "João Silva"
    str_1_len = . - str_1 - 1
    str_2: .asciz "Santos"
    str_2_len = . - str_2 - 1
    str_3: .asciz "=== DEMONSTRAÇÃO LENS ==="
    str_3_len = . - str_3 - 1
    str_4: .asciz "Nome completo:"
    str_4_len = . - str_4 - 1
    str_5: .asciz "Idade atual:"
    str_5_len = . - str_5 - 1
    str_6: .asciz "Altura:"
    str_6_len = . - str_6 - 1
    str_7: .asciz "Peso:"
    str_7_len = . - str_7 - 1
    str_8: .asciz "Status ativo:"
    str_8_len = . - str_8 - 1
    str_9: .asciz "Aprovado:"
    str_9_len = . - str_9 - 1
    str_10: .asciz "Operações com"
    str_10_len = . - str_10 - 1
    str_11: .asciz "e"
    str_11_len = . - str_11 - 1
    str_12: .asciz "Soma:"
    str_12_len = . - str_12 - 1
    str_13: .asciz "Subtração:"
    str_13_len = . - str_13 - 1
    str_14: .asciz "Multiplicação:"
    str_14_len = . - str_14 - 1
    str_15: .asciz "Divisão:"
    str_15_len = . - str_15 - 1
    str_16: .asciz "Resultado complexo:"
    str_16_len = . - str_16 - 1
    str_17: .asciz "Com parênteses:"
    str_17_len = . - str_17 - 1
    str_18: .asciz "=== COMPARAÇÕES ==="
    str_18_len = . - str_18 - 1
    str_19: .asciz "10 == 3:"
    str_19_len = . - str_19 - 1
    str_20: .asciz "10 != 3:"
    str_20_len = . - str_20 - 1
    str_21: .asciz "10 < 3:"
    str_21_len = . - str_21 - 1
    str_22: .asciz "10 > 3:"
    str_22_len = . - str_22 - 1
    str_23: .asciz "10 <= 3:"
    str_23_len = . - str_23 - 1
    str_24: .asciz "10 >= 3:"
    str_24_len = . - str_24 - 1
    str_25: .asciz "=== OPERAÇÕES LÓGICAS ==="
    str_25_len = . - str_25 - 1
    str_26: .asciz "True && False:"
    str_26_len = . - str_26 - 1
    str_27: .asciz "True || False:"
    str_27_len = . - str_27 - 1
    str_28: .asciz "Expressão complexa:"
    str_28_len = . - str_28 - 1
    str_29: .asciz "Digite um número:"
    str_29_len = . - str_29 - 1
    str_30: .asciz "Você digitou:"
    str_30_len = . - str_30 - 1
    str_31: .asciz "=== ESTRUTURAS CONDICIONAIS ==="
    str_31_len = . - str_31 - 1
    str_32: .asciz "Maior de idade"
    str_32_len = . - str_32 - 1
    str_33: .asciz "Criança"
    str_33_len = . - str_33 - 1
    str_34: .asciz "Adolescente"
    str_34_len = . - str_34 - 1
    str_35: .asciz "Adulto"
    str_35_len = . - str_35 - 1
    str_36: .asciz "Idoso"
    str_36_len = . - str_36 - 1
    str_37: .asciz "Usuário ativo"
    str_37_len = . - str_37 - 1
    str_38: .asciz "E está aprovado!"
    str_38_len = . - str_38 - 1
    str_39: .asciz "Mas não está aprovado"
    str_39_len = . - str_39 - 1
    str_40: .asciz "Usuário inativo"
    str_40_len = . - str_40 - 1
    str_41: .asciz "=== LAÇOS FOR ==="
    str_41_len = . - str_41 - 1
    str_42: .asciz "Contagem de 1 a 5:"
    str_42_len = . - str_42 - 1
    str_43: .asciz "Número:"
    str_43_len = . - str_43 - 1
    str_44: .asciz "Contagem regressiva:"
    str_44_len = . - str_44 - 1
    str_45: .asciz "Contagem:"
    str_45_len = . - str_45 - 1
    str_46: .asciz "Range dinâmico:"
    str_46_len = . - str_46 - 1
    str_47: .asciz "Valor de k:"
    str_47_len = . - str_47 - 1
    str_48: .asciz "Quadrado:"
    str_48_len = . - str_48 - 1
    str_49: .asciz "=== LAÇOS WHILE ==="
    str_49_len = . - str_49 - 1
    str_50: .asciz "Contagem while até 3:"
    str_50_len = . - str_50 - 1
    str_51: .asciz "Contador:"
    str_51_len = . - str_51 - 1
    str_52: .asciz "While com condição complexa:"
    str_52_len = . - str_52 - 1
    str_53: .asciz "x ="
    str_53_len = . - str_53 - 1
    str_54: .asciz "y ="
    str_54_len = . - str_54 - 1
    str_55: .asciz "=== CASOS AVANÇADOS ==="
    str_55_len = . - str_55 - 1
    str_56: .asciz "+"
    str_56_len = . - str_56 - 1
    str_57: .asciz "="
    str_57_len = . - str_57 - 1
    str_58: .asciz "-"
    str_58_len = . - str_58 - 1
    str_59: .asciz "*"
    str_59_len = . - str_59 - 1
    str_60: .asciz "/"
    str_60_len = . - str_60 - 1
    str_61: .asciz "Erro: Divisão por zero!"
    str_61_len = . - str_61 - 1
    str_62: .asciz "Calculando fatorial de"
    str_62_len = . - str_62 - 1
    str_63: .asciz "Passo"
    str_63_len = . - str_63 - 1
    str_64: .asciz ":"
    str_64_len = . - str_64 - 1
    str_65: .asciz "Fatorial final:"
    str_65_len = . - str_65 - 1
    str_66: .asciz "Sequência de Fibonacci:"
    str_66_len = . - str_66 - 1
    str_67: .asciz "F(0) ="
    str_67_len = . - str_67 - 1
    str_68: .asciz "F(1) ="
    str_68_len = . - str_68 - 1
    str_69: .asciz "F("
    str_69_len = . - str_69 - 1
    str_70: .asciz ") ="
    str_70_len = . - str_70 - 1
    str_71: .asciz "=== VALIDAÇÃO DE APROVAÇÃO ==="
    str_71_len = . - str_71 - 1
    str_72: .asciz "Nota:"
    str_72_len = . - str_72 - 1
    str_73: .asciz "Frequência:"
    str_73_len = . - str_73 - 1
    str_74: .asciz "APROVADO! ✓"
    str_74_len = . - str_74 - 1
    str_75: .asciz "RECUPERAÇÃO"
    str_75_len = . - str_75 - 1
    str_76: .asciz "REPROVADO ✗"
    str_76_len = . - str_76 - 1
    str_77: .asciz "=========================="
    str_77_len = . - str_77 - 1
    str_78: .asciz "Demonstração finalizada!"
    str_78_len = . - str_78 - 1
    str_79: .asciz "Todas as funcionalidades foram testadas:"
    str_79_len = . - str_79 - 1
    str_80: .asciz "✓ Tipos: int, float, String, bool"
    str_80_len = . - str_80 - 1
    str_81: .asciz "✓ Operadores: +, -, *, /, ==, !=, <, >, <=, >=, &&, ||"
    str_81_len = . - str_81 - 1
    str_82: .asciz "✓ Estruturas: if/elseif/else, for, while"
    str_82_len = . - str_82 - 1
    str_83: .asciz "✓ E/S: print, input"
    str_83_len = . - str_83 - 1
    str_84: .asciz "✓ Expressões complexas e precedência"
    str_84_len = . - str_84 - 1

.section .text
    .global _start

_start:
    pushq %rbp
    movq %rsp, %rbp

    # Atribuir 25 para idade
    movq $25, %rbx
    # Atribuir 1.75 para altura
    movq $1, %rcx
    # Atribuir string "João Silva" para nome
    leaq str_1(%rip), %r8
    # Atribuir True para ativo
    movq $1, %r9
    # Atribuir 0 para contador
    movq $0, %r10
    # Atribuir 70.5 para peso
    movq $70, %r11
    # Atribuir string "Santos" para sobrenome
    leaq str_2(%rip), %r12
    # Atribuir False para aprovado
    movq $0, %r13
    # idade + 5 -> t1
    movq %rbx, %rax
    addq $5, %rax
    movq %rax, %r14
    # Atribuir t1 para idade
    movq %r14, %rbx
    # altura - 0.05 -> t2
    movq %rcx, %rax
    subq $0, %rax
    movq %rax, %r15
    # Atribuir t2 para altura
    movq %r15, %rcx
    # contador * 2 -> t3
    pushq %rax     # Preservar RAX
    movq %r10, %rax
    imulq $2, %rax
    movq %rax, -8(%rbp)
    popq %rax      # Restaurar RAX
    # Atribuir t3 para contador
    movq -8(%rbp), %r10
    # peso / 2 -> t4
    pushq %rax     # Preservar RAX
    pushq %rdx     # Preservar RDX
    pushq %rcx     # Usar RCX como temporário
    movq %r11, %rax
    movq $2, %rcx
    cqto
    idivq %rcx
    movq %rax, -16(%rbp)
    popq %rcx      # Restaurar RCX
    popq %rdx      # Restaurar RDX
    popq %rax      # Restaurar RAX
    # Atribuir t4 para peso
    movq -16(%rbp), %r11
    # PRINT: {'op': 'PRINT', 'arg1': '"=== DEMONSTRAÇÃO LENS ==="', 'arg2': None, 'result': None}
    # Imprimir string "=== DEMONSTRAÇÃO LENS ==="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_3, %rsi
    movq $str_3_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'nome', 'arg2': None, 'result': None}
    # Imprimir string da variável nome = "João Silva"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_1, %rsi
    movq $str_1_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'idade', 'arg2': None, 'result': None}
    # Imprimir número completo: %rbx
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq %rbx, %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_62
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_62:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_62
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Nome completo:"', 'arg2': None, 'result': None}
    # Imprimir string "Nome completo:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_4, %rsi
    movq $str_4_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'nome', 'arg2': None, 'result': None}
    # Imprimir string da variável nome = "João Silva"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_1, %rsi
    movq $str_1_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'sobrenome', 'arg2': None, 'result': None}
    # Imprimir string da variável sobrenome = "Santos"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_2, %rsi
    movq $str_2_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Idade atual:"', 'arg2': None, 'result': None}
    # Imprimir string "Idade atual:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_5, %rsi
    movq $str_5_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'idade', 'arg2': None, 'result': None}
    # Imprimir número completo: %rbx
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq %rbx, %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_63
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_63:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_63
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Altura:"', 'arg2': None, 'result': None}
    # Imprimir string "Altura:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_6, %rsi
    movq $str_6_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'altura', 'arg2': None, 'result': None}
    # Imprimir número completo: %rcx
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq %rcx, %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_64
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_64:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_64
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Peso:"', 'arg2': None, 'result': None}
    # Imprimir string "Peso:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_7, %rsi
    movq $str_7_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'peso', 'arg2': None, 'result': None}
    # Imprimir número completo: %r11
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq %r11, %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_65
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_65:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_65
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Status ativo:"', 'arg2': None, 'result': None}
    # Imprimir string "Status ativo:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_8, %rsi
    movq $str_8_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'ativo', 'arg2': None, 'result': None}
    # Imprimir número completo: %r9
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq %r9, %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_66
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_66:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_66
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Aprovado:"', 'arg2': None, 'result': None}
    # Imprimir string "Aprovado:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_9, %rsi
    movq $str_9_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'aprovado', 'arg2': None, 'result': None}
    # Imprimir número completo: %r13
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq %r13, %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_67
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_67:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_67
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Atribuir 10 para a
    movq $10, -24(%rbp)
    # Atribuir 3 para b
    movq $3, -32(%rbp)
    # a + b -> t5
    movq -24(%rbp), %rax
    addq -32(%rbp), %rax
    movq %rax, -40(%rbp)
    # Atribuir t5 para soma (via %rax)
    movq -40(%rbp), %rax
    movq %rax, -48(%rbp)
    # a - b -> t6
    movq -24(%rbp), %rax
    subq -32(%rbp), %rax
    movq %rax, -56(%rbp)
    # Atribuir t6 para subtracao (via %rax)
    movq -56(%rbp), %rax
    movq %rax, -64(%rbp)
    # a * b -> t7
    pushq %rax     # Preservar RAX
    movq -24(%rbp), %rax
    imulq -32(%rbp)
    movq %rax, -72(%rbp)
    popq %rax      # Restaurar RAX
    # Atribuir t7 para multiplicacao (via %rax)
    movq -72(%rbp), %rax
    movq %rax, -80(%rbp)
    # a / b -> t8
    pushq %rax     # Preservar RAX
    pushq %rdx     # Preservar RDX
    movq -24(%rbp), %rax
    cqto
    idivq -32(%rbp)
    movq %rax, -88(%rbp)
    popq %rdx      # Restaurar RDX
    popq %rax      # Restaurar RAX
    # Atribuir t8 para divisao (via %rax)
    movq -88(%rbp), %rax
    movq %rax, -96(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"Operações com"', 'arg2': None, 'result': None}
    # Imprimir string "Operações com"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_10, %rsi
    movq $str_10_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'a', 'arg2': None, 'result': None}
    # Imprimir número completo: -24(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -24(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_68
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_68:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_68
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"e"', 'arg2': None, 'result': None}
    # Imprimir string "e"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_11, %rsi
    movq $str_11_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'b', 'arg2': None, 'result': None}
    # Imprimir número completo: -32(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -32(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_69
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_69:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_69
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Soma:"', 'arg2': None, 'result': None}
    # Imprimir string "Soma:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_12, %rsi
    movq $str_12_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'soma', 'arg2': None, 'result': None}
    # Imprimir número completo: -48(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -48(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_70
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_70:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_70
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Subtração:"', 'arg2': None, 'result': None}
    # Imprimir string "Subtração:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_13, %rsi
    movq $str_13_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'subtracao', 'arg2': None, 'result': None}
    # Imprimir número completo: -64(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -64(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_71
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_71:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_71
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Multiplicação:"', 'arg2': None, 'result': None}
    # Imprimir string "Multiplicação:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_14, %rsi
    movq $str_14_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'multiplicacao', 'arg2': None, 'result': None}
    # Imprimir número completo: -80(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -80(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_72
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_72:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_72
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Divisão:"', 'arg2': None, 'result': None}
    # Imprimir string "Divisão:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_15, %rsi
    movq $str_15_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'divisao', 'arg2': None, 'result': None}
    # Imprimir número completo: -96(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -96(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_73
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_73:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_73
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # b * 2 -> t9
    pushq %rax     # Preservar RAX
    movq -32(%rbp), %rax
    imulq $2, %rax
    movq %rax, -104(%rbp)
    popq %rax      # Restaurar RAX
    # a + t9 -> t10
    movq -24(%rbp), %rax
    addq -104(%rbp), %rax
    movq %rax, %rbx
    # t10 - 1 -> t11
    movq %rbx, %rax
    subq $1, %rax
    movq %rax, %rcx
    # Atribuir t11 para resultado
    movq %rcx, -112(%rbp)
    # a + b -> t12
    movq -24(%rbp), %rax
    addq -32(%rbp), %rax
    movq %rax, %r8
    # t12 * 2 -> t13
    pushq %rax     # Preservar RAX
    movq %r8, %rax
    imulq $2, %rax
    movq %rax, %r9
    popq %rax      # Restaurar RAX
    # Atribuir t13 para complexo
    movq %r9, -120(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"Resultado complexo:"', 'arg2': None, 'result': None}
    # Imprimir string "Resultado complexo:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_16, %rsi
    movq $str_16_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'resultado', 'arg2': None, 'result': None}
    # Imprimir número completo: -112(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -112(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_74
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_74:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_74
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Com parênteses:"', 'arg2': None, 'result': None}
    # Imprimir string "Com parênteses:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_17, %rsi
    movq $str_17_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'complexo', 'arg2': None, 'result': None}
    # Imprimir número completo: -120(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -120(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_75
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_75:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_75
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # a == b -> t14
    pushq %rax
    pushq %rbx
    movq -24(%rbp), %rax
    movq -32(%rbp), %rbx
    cmpq %rbx, %rax
    sete %al
    movzbq %al, %rax
    movq %rax, %r10
    popq %rbx
    popq %rax
    # Atribuir t14 para igual
    movq %r10, -128(%rbp)
    # a != b -> t15
    pushq %rax
    pushq %rbx
    movq -24(%rbp), %rax
    movq -32(%rbp), %rbx
    cmpq %rbx, %rax
    setne %al
    movzbq %al, %rax
    movq %rax, %r11
    popq %rbx
    popq %rax
    # Atribuir t15 para diferente
    movq %r11, -136(%rbp)
    # a < b -> t16
    pushq %rax
    pushq %rbx
    movq -24(%rbp), %rax
    movq -32(%rbp), %rbx
    cmpq %rbx, %rax
    setl %al
    movzbq %al, %rax
    movq %rax, %r12
    popq %rbx
    popq %rax
    # Atribuir t16 para menor
    movq %r12, -144(%rbp)
    # a > b -> t17
    pushq %rax
    pushq %rbx
    movq -24(%rbp), %rax
    movq -32(%rbp), %rbx
    cmpq %rbx, %rax
    setg %al
    movzbq %al, %rax
    movq %rax, %r13
    popq %rbx
    popq %rax
    # Atribuir t17 para maior
    movq %r13, -152(%rbp)
    # a <= b -> t18
    pushq %rax
    pushq %rbx
    movq -24(%rbp), %rax
    movq -32(%rbp), %rbx
    cmpq %rbx, %rax
    setle %al
    movzbq %al, %rax
    movq %rax, %r14
    popq %rbx
    popq %rax
    # Atribuir t18 para menorIgual
    movq %r14, -160(%rbp)
    # a >= b -> t19
    pushq %rax
    pushq %rbx
    movq -24(%rbp), %rax
    movq -32(%rbp), %rbx
    cmpq %rbx, %rax
    setge %al
    movzbq %al, %rax
    movq %rax, %r15
    popq %rbx
    popq %rax
    # Atribuir t19 para maiorIgual
    movq %r15, -168(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"=== COMPARAÇÕES ==="', 'arg2': None, 'result': None}
    # Imprimir string "=== COMPARAÇÕES ==="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_18, %rsi
    movq $str_18_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"10 == 3:"', 'arg2': None, 'result': None}
    # Imprimir string "10 == 3:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_19, %rsi
    movq $str_19_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'igual', 'arg2': None, 'result': None}
    # Imprimir número completo: -128(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -128(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_76
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_76:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_76
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"10 != 3:"', 'arg2': None, 'result': None}
    # Imprimir string "10 != 3:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_20, %rsi
    movq $str_20_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'diferente', 'arg2': None, 'result': None}
    # Imprimir número completo: -136(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -136(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_77
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_77:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_77
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"10 < 3:"', 'arg2': None, 'result': None}
    # Imprimir string "10 < 3:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_21, %rsi
    movq $str_21_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'menor', 'arg2': None, 'result': None}
    # Imprimir número completo: -144(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -144(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_78
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_78:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_78
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"10 > 3:"', 'arg2': None, 'result': None}
    # Imprimir string "10 > 3:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_22, %rsi
    movq $str_22_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'maior', 'arg2': None, 'result': None}
    # Imprimir número completo: -152(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -152(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_79
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_79:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_79
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"10 <= 3:"', 'arg2': None, 'result': None}
    # Imprimir string "10 <= 3:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_23, %rsi
    movq $str_23_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'menorIgual', 'arg2': None, 'result': None}
    # Imprimir número completo: -160(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -160(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_80
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_80:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_80
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"10 >= 3:"', 'arg2': None, 'result': None}
    # Imprimir string "10 >= 3:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_24, %rsi
    movq $str_24_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'maiorIgual', 'arg2': None, 'result': None}
    # Imprimir número completo: -168(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -168(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_81
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_81:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_81
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Atribuir True para condicao1
    movq $1, -176(%rbp)
    # Atribuir False para condicao2
    movq $0, -184(%rbp)
    # condicao1 && condicao2 -> t20
    movq -176(%rbp), %rbx
    cmpq $0, %rbx
    je and_end_82
    movq -184(%rbp), %rbx
and_end_82:
    # Atribuir t20 para e_logico
    movq %rbx, -192(%rbp)
    # condicao1 || condicao2 -> t21
    movq -176(%rbp), %rcx
    cmpq $0, %rcx
    jne or_end_83
    movq -184(%rbp), %rcx
or_end_83:
    # Atribuir t21 para ou_logico
    movq %rcx, -200(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"=== OPERAÇÕES LÓGICAS ==="', 'arg2': None, 'result': None}
    # Imprimir string "=== OPERAÇÕES LÓGICAS ==="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_25, %rsi
    movq $str_25_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"True && False:"', 'arg2': None, 'result': None}
    # Imprimir string "True && False:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_26, %rsi
    movq $str_26_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'e_logico', 'arg2': None, 'result': None}
    # Imprimir número completo: -192(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -192(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_84
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_84:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_84
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"True || False:"', 'arg2': None, 'result': None}
    # Imprimir string "True || False:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_27, %rsi
    movq $str_27_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'ou_logico', 'arg2': None, 'result': None}
    # Imprimir número completo: -200(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -200(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_85
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_85:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_85
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # a > b -> t22
    pushq %rax
    pushq %rbx
    movq -24(%rbp), %rax
    movq -32(%rbp), %rbx
    cmpq %rbx, %rax
    setg %al
    movzbq %al, %rax
    movq %rax, %r8
    popq %rbx
    popq %rax
    # soma > 10 -> t23
    pushq %rax
    pushq %rbx
    movq -48(%rbp), %rax
    movq $10, %rbx
    cmpq %rbx, %rax
    setg %al
    movzbq %al, %rax
    movq %rax, %r9
    popq %rbx
    popq %rax
    # t22 && t23 -> t24
    movq %r8, %r10
    cmpq $0, %r10
    je and_end_86
    movq %r9, %r10
and_end_86:
    # Atribuir t24 para complexa
    movq %r10, -208(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"Expressão complexa:"', 'arg2': None, 'result': None}
    # Imprimir string "Expressão complexa:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_28, %rsi
    movq $str_28_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'complexa', 'arg2': None, 'result': None}
    # Imprimir número completo: -208(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -208(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_87
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_87:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_87
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Digite um número:"', 'arg2': None, 'result': None}
    # Imprimir string "Digite um número:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_29, %rsi
    movq $str_29_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Ler entrada para entrada_usuario
    # Preservar registradores
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    # Syscall read
    movq $0, %rax         # sys_read
    movq $0, %rdi         # stdin
    movq $input_buffer, %rsi
    movq $16, %rdx
    syscall
    # Conversão básica: primeiro caractere - '0'
    movb input_buffer(%rip), %al
    subb $48, %al         # Converter ASCII para número
    movzbq %al, %rax      # Estender para 64 bits
    # Verificar se é válido (0-9)
    cmpq $9, %rax
    jle valid_input_88
    # Input inválido, usar 42 como fallback
    movq $42, %rax
valid_input_88:
    movq %rax, -216(%rbp)
    # Restaurar registradores
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Você digitou:"', 'arg2': None, 'result': None}
    # Imprimir string "Você digitou:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_30, %rsi
    movq $str_30_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'entrada_usuario', 'arg2': None, 'result': None}
    # Imprimir número completo: -216(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -216(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_90
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_90:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_90
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"=== ESTRUTURAS CONDICIONAIS ==="', 'arg2': None, 'result': None}
    # Imprimir string "=== ESTRUTURAS CONDICIONAIS ==="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_31, %rsi
    movq $str_31_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # idade >= 18 -> t25
    pushq %rax
    pushq %rbx
    movq %rbx, %rax
    movq $18, %rbx
    cmpq %rbx, %rax
    setge %al
    movzbq %al, %rax
    movq %rax, %r11
    popq %rbx
    popq %rax
    # Se t25 == 0, ir para L2
    cmpq $0, %r11
    je L2
    # PRINT: {'op': 'PRINT', 'arg1': '"Maior de idade"', 'arg2': None, 'result': None}
    # Imprimir string "Maior de idade"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_32, %rsi
    movq $str_32_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    jmp L1
L2:
L1:
    # idade < 13 -> t26
    pushq %rax
    pushq %rbx
    movq %rbx, %rax
    movq $13, %rbx
    cmpq %rbx, %rax
    setl %al
    movzbq %al, %rax
    movq %rax, %r12
    popq %rbx
    popq %rax
    # Se t26 == 0, ir para L4
    cmpq $0, %r12
    je L4
    # PRINT: {'op': 'PRINT', 'arg1': '"Criança"', 'arg2': None, 'result': None}
    # Imprimir string "Criança"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_33, %rsi
    movq $str_33_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    jmp L3
L4:
    # idade < 18 -> t27
    pushq %rax
    pushq %rbx
    movq %rbx, %rax
    movq $18, %rbx
    cmpq %rbx, %rax
    setl %al
    movzbq %al, %rax
    movq %rax, %r13
    popq %rbx
    popq %rax
    # Se t27 == 0, ir para L5
    cmpq $0, %r13
    je L5
    # PRINT: {'op': 'PRINT', 'arg1': '"Adolescente"', 'arg2': None, 'result': None}
    # Imprimir string "Adolescente"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_34, %rsi
    movq $str_34_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    jmp L3
L5:
    # idade < 60 -> t28
    pushq %rax
    pushq %rbx
    movq %rbx, %rax
    movq $60, %rbx
    cmpq %rbx, %rax
    setl %al
    movzbq %al, %rax
    movq %rax, %r14
    popq %rbx
    popq %rax
    # Se t28 == 0, ir para L6
    cmpq $0, %r14
    je L6
    # PRINT: {'op': 'PRINT', 'arg1': '"Adulto"', 'arg2': None, 'result': None}
    # Imprimir string "Adulto"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_35, %rsi
    movq $str_35_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    jmp L3
L6:
    # PRINT: {'op': 'PRINT', 'arg1': '"Idoso"', 'arg2': None, 'result': None}
    # Imprimir string "Idoso"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_36, %rsi
    movq $str_36_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
L3:
    # ativo == True -> t29
    pushq %rax
    pushq %rbx
    movq %r9, %rax
    movq $1, %rbx
    cmpq %rbx, %rax
    sete %al
    movzbq %al, %rax
    movq %rax, %r15
    popq %rbx
    popq %rax
    # Se t29 == 0, ir para L8
    cmpq $0, %r15
    je L8
    # PRINT: {'op': 'PRINT', 'arg1': '"Usuário ativo"', 'arg2': None, 'result': None}
    # Imprimir string "Usuário ativo"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_37, %rsi
    movq $str_37_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # aprovado == True -> t30
    pushq %rax
    pushq %rbx
    movq %r13, %rax
    movq $1, %rbx
    cmpq %rbx, %rax
    sete %al
    movzbq %al, %rax
    movq %rax, %rbx
    popq %rbx
    popq %rax
    # Se t30 == 0, ir para L10
    cmpq $0, %rbx
    je L10
    # PRINT: {'op': 'PRINT', 'arg1': '"E está aprovado!"', 'arg2': None, 'result': None}
    # Imprimir string "E está aprovado!"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_38, %rsi
    movq $str_38_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    jmp L9
L10:
    # PRINT: {'op': 'PRINT', 'arg1': '"Mas não está aprovado"', 'arg2': None, 'result': None}
    # Imprimir string "Mas não está aprovado"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_39, %rsi
    movq $str_39_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
L9:
    jmp L7
L8:
    # PRINT: {'op': 'PRINT', 'arg1': '"Usuário inativo"', 'arg2': None, 'result': None}
    # Imprimir string "Usuário inativo"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_40, %rsi
    movq $str_40_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
L7:
    # PRINT: {'op': 'PRINT', 'arg1': '"=== LAÇOS FOR ==="', 'arg2': None, 'result': None}
    # Imprimir string "=== LAÇOS FOR ==="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_41, %rsi
    movq $str_41_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Contagem de 1 a 5:"', 'arg2': None, 'result': None}
    # Imprimir string "Contagem de 1 a 5:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_42, %rsi
    movq $str_42_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Atribuir 1 para i
    movq $1, -224(%rbp)
L11:
    # i <= 5 -> t31
    pushq %rax
    pushq %rbx
    movq -224(%rbp), %rax
    movq $5, %rbx
    cmpq %rbx, %rax
    setle %al
    movzbq %al, %rax
    movq %rax, %rcx
    popq %rbx
    popq %rax
    # Se t31 == 0, ir para L12
    cmpq $0, %rcx
    je L12
    # PRINT: {'op': 'PRINT', 'arg1': '"Número:"', 'arg2': None, 'result': None}
    # Imprimir string "Número:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_43, %rsi
    movq $str_43_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'i', 'arg2': None, 'result': None}
    # Imprimir número completo: -224(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -224(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_91
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_91:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_91
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # i + 1 -> t32
    movq -224(%rbp), %rax
    addq $1, %rax
    movq %rax, %r8
    # Atribuir t32 para i
    movq %r8, -224(%rbp)
    jmp L11
L12:
    # PRINT: {'op': 'PRINT', 'arg1': '"Contagem regressiva:"', 'arg2': None, 'result': None}
    # Imprimir string "Contagem regressiva:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_44, %rsi
    movq $str_44_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Atribuir 10 para j
    movq $10, -232(%rbp)
L13:
    # j >= 7 -> t33
    pushq %rax
    pushq %rbx
    movq -232(%rbp), %rax
    movq $7, %rbx
    cmpq %rbx, %rax
    setge %al
    movzbq %al, %rax
    movq %rax, %r9
    popq %rbx
    popq %rax
    # Se t33 == 0, ir para L14
    cmpq $0, %r9
    je L14
    # PRINT: {'op': 'PRINT', 'arg1': '"Contagem:"', 'arg2': None, 'result': None}
    # Imprimir string "Contagem:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_45, %rsi
    movq $str_45_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'j', 'arg2': None, 'result': None}
    # Imprimir número completo: -232(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -232(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_92
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_92:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_92
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # j - 1 -> t34
    movq -232(%rbp), %rax
    subq $1, %rax
    movq %rax, %r10
    # Atribuir t34 para j
    movq %r10, -232(%rbp)
    jmp L13
L14:
    # Atribuir 0 para inicio
    movq $0, -240(%rbp)
    # Atribuir 3 para fim
    movq $3, -248(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"Range dinâmico:"', 'arg2': None, 'result': None}
    # Imprimir string "Range dinâmico:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_46, %rsi
    movq $str_46_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Atribuir inicio para k (via %rax)
    movq -240(%rbp), %rax
    movq %rax, -256(%rbp)
L15:
    # k <= fim -> t35
    pushq %rax
    pushq %rbx
    movq -256(%rbp), %rax
    movq -248(%rbp), %rbx
    cmpq %rbx, %rax
    setle %al
    movzbq %al, %rax
    movq %rax, %r11
    popq %rbx
    popq %rax
    # Se t35 == 0, ir para L16
    cmpq $0, %r11
    je L16
    # PRINT: {'op': 'PRINT', 'arg1': '"Valor de k:"', 'arg2': None, 'result': None}
    # Imprimir string "Valor de k:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_47, %rsi
    movq $str_47_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'k', 'arg2': None, 'result': None}
    # Imprimir número completo: -256(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -256(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_93
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_93:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_93
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # k * k -> t36
    pushq %rax     # Preservar RAX
    movq -256(%rbp), %rax
    imulq -256(%rbp)
    movq %rax, %r12
    popq %rax      # Restaurar RAX
    # Atribuir t36 para quadrado
    movq %r12, -264(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"Quadrado:"', 'arg2': None, 'result': None}
    # Imprimir string "Quadrado:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_48, %rsi
    movq $str_48_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'quadrado', 'arg2': None, 'result': None}
    # Imprimir número completo: -264(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -264(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_94
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_94:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_94
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # k + 1 -> t37
    movq -256(%rbp), %rax
    addq $1, %rax
    movq %rax, %r13
    # Atribuir t37 para k
    movq %r13, -256(%rbp)
    jmp L15
L16:
    # PRINT: {'op': 'PRINT', 'arg1': '"=== LAÇOS WHILE ==="', 'arg2': None, 'result': None}
    # Imprimir string "=== LAÇOS WHILE ==="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_49, %rsi
    movq $str_49_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Atribuir 0 para cont
    movq $0, -272(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"Contagem while até 3:"', 'arg2': None, 'result': None}
    # Imprimir string "Contagem while até 3:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_50, %rsi
    movq $str_50_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
L17:
    # cont < 3 -> t38
    pushq %rax
    pushq %rbx
    movq -272(%rbp), %rax
    movq $3, %rbx
    cmpq %rbx, %rax
    setl %al
    movzbq %al, %rax
    movq %rax, %r14
    popq %rbx
    popq %rax
    # Se t38 == 0, ir para L18
    cmpq $0, %r14
    je L18
    # PRINT: {'op': 'PRINT', 'arg1': '"Contador:"', 'arg2': None, 'result': None}
    # Imprimir string "Contador:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_51, %rsi
    movq $str_51_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'cont', 'arg2': None, 'result': None}
    # Imprimir número completo: -272(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -272(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_95
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_95:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_95
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # cont + 1 -> t39
    movq -272(%rbp), %rax
    addq $1, %rax
    movq %rax, %r15
    # Atribuir t39 para cont
    movq %r15, -272(%rbp)
    jmp L17
L18:
    # Atribuir 10 para x
    movq $10, -280(%rbp)
    # Atribuir 1 para y
    movq $1, -288(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"While com condição complexa:"', 'arg2': None, 'result': None}
    # Imprimir string "While com condição complexa:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_52, %rsi
    movq $str_52_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
L19:
    # x > y -> t40
    pushq %rax
    pushq %rbx
    movq -280(%rbp), %rax
    movq -288(%rbp), %rbx
    cmpq %rbx, %rax
    setg %al
    movzbq %al, %rax
    movq %rax, %rbx
    popq %rbx
    popq %rax
    # y < 5 -> t41
    pushq %rax
    pushq %rbx
    movq -288(%rbp), %rax
    movq $5, %rbx
    cmpq %rbx, %rax
    setl %al
    movzbq %al, %rax
    movq %rax, %rcx
    popq %rbx
    popq %rax
    # t40 && t41 -> t42
    movq %rbx, %r8
    cmpq $0, %r8
    je and_end_96
    movq %rcx, %r8
and_end_96:
    # Se t42 == 0, ir para L20
    cmpq $0, %r8
    je L20
    # PRINT: {'op': 'PRINT', 'arg1': '"x ="', 'arg2': None, 'result': None}
    # Imprimir string "x ="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_53, %rsi
    movq $str_53_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'x', 'arg2': None, 'result': None}
    # Imprimir número completo: -280(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -280(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_97
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_97:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_97
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"y ="', 'arg2': None, 'result': None}
    # Imprimir string "y ="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_54, %rsi
    movq $str_54_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'y', 'arg2': None, 'result': None}
    # Imprimir número completo: -288(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -288(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_98
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_98:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_98
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # x - 2 -> t43
    movq -280(%rbp), %rax
    subq $2, %rax
    movq %rax, %r9
    # Atribuir t43 para x
    movq %r9, -280(%rbp)
    # y + 1 -> t44
    movq -288(%rbp), %rax
    addq $1, %rax
    movq %rax, %r10
    # Atribuir t44 para y
    movq %r10, -288(%rbp)
    jmp L19
L20:
    # PRINT: {'op': 'PRINT', 'arg1': '"=== CASOS AVANÇADOS ==="', 'arg2': None, 'result': None}
    # Imprimir string "=== CASOS AVANÇADOS ==="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_55, %rsi
    movq $str_55_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Atribuir 15 para num1
    movq $15, -296(%rbp)
    # Atribuir 4 para num2
    movq $4, -304(%rbp)
    # Atribuir 1 para operacao
    movq $1, -312(%rbp)
    # operacao == 1 -> t45
    pushq %rax
    pushq %rbx
    movq -312(%rbp), %rax
    movq $1, %rbx
    cmpq %rbx, %rax
    sete %al
    movzbq %al, %rax
    movq %rax, %r11
    popq %rbx
    popq %rax
    # Se t45 == 0, ir para L22
    cmpq $0, %r11
    je L22
    # num1 + num2 -> t46
    movq -296(%rbp), %rax
    addq -304(%rbp), %rax
    movq %rax, %r12
    # Atribuir t46 para result
    movq %r12, -320(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"Soma:"', 'arg2': None, 'result': None}
    # Imprimir string "Soma:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_12, %rsi
    movq $str_12_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'num1', 'arg2': None, 'result': None}
    # Imprimir número completo: -296(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -296(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_99
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_99:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_99
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"+"', 'arg2': None, 'result': None}
    # Imprimir string "+"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_56, %rsi
    movq $str_56_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'num2', 'arg2': None, 'result': None}
    # Imprimir número completo: -304(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -304(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_100
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_100:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_100
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"="', 'arg2': None, 'result': None}
    # Imprimir string "="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_57, %rsi
    movq $str_57_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'result', 'arg2': None, 'result': None}
    # Imprimir número completo: -320(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -320(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_101
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_101:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_101
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    jmp L21
L22:
    # operacao == 2 -> t47
    pushq %rax
    pushq %rbx
    movq -312(%rbp), %rax
    movq $2, %rbx
    cmpq %rbx, %rax
    sete %al
    movzbq %al, %rax
    movq %rax, %r13
    popq %rbx
    popq %rax
    # Se t47 == 0, ir para L23
    cmpq $0, %r13
    je L23
    # num1 - num2 -> t48
    movq -296(%rbp), %rax
    subq -304(%rbp), %rax
    movq %rax, %r14
    # Atribuir t48 para result
    movq %r14, -320(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"Subtração:"', 'arg2': None, 'result': None}
    # Imprimir string "Subtração:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_13, %rsi
    movq $str_13_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'num1', 'arg2': None, 'result': None}
    # Imprimir número completo: -296(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -296(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_102
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_102:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_102
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"-"', 'arg2': None, 'result': None}
    # Imprimir string "-"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_58, %rsi
    movq $str_58_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'num2', 'arg2': None, 'result': None}
    # Imprimir número completo: -304(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -304(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_103
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_103:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_103
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"="', 'arg2': None, 'result': None}
    # Imprimir string "="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_57, %rsi
    movq $str_57_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'result', 'arg2': None, 'result': None}
    # Imprimir número completo: -320(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -320(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_104
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_104:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_104
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    jmp L21
L23:
    # operacao == 3 -> t49
    pushq %rax
    pushq %rbx
    movq -312(%rbp), %rax
    movq $3, %rbx
    cmpq %rbx, %rax
    sete %al
    movzbq %al, %rax
    movq %rax, %r15
    popq %rbx
    popq %rax
    # Se t49 == 0, ir para L24
    cmpq $0, %r15
    je L24
    # num1 * num2 -> t50
    pushq %rax     # Preservar RAX
    movq -296(%rbp), %rax
    imulq -304(%rbp)
    movq %rax, %rbx
    popq %rax      # Restaurar RAX
    # Atribuir t50 para result
    movq %rbx, -320(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"Multiplicação:"', 'arg2': None, 'result': None}
    # Imprimir string "Multiplicação:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_14, %rsi
    movq $str_14_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'num1', 'arg2': None, 'result': None}
    # Imprimir número completo: -296(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -296(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_105
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_105:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_105
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"*"', 'arg2': None, 'result': None}
    # Imprimir string "*"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_59, %rsi
    movq $str_59_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'num2', 'arg2': None, 'result': None}
    # Imprimir número completo: -304(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -304(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_106
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_106:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_106
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"="', 'arg2': None, 'result': None}
    # Imprimir string "="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_57, %rsi
    movq $str_57_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'result', 'arg2': None, 'result': None}
    # Imprimir número completo: -320(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -320(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_107
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_107:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_107
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    jmp L21
L24:
    # operacao == 4 -> t51
    pushq %rax
    pushq %rbx
    movq -312(%rbp), %rax
    movq $4, %rbx
    cmpq %rbx, %rax
    sete %al
    movzbq %al, %rax
    movq %rax, %rcx
    popq %rbx
    popq %rax
    # Se t51 == 0, ir para L25
    cmpq $0, %rcx
    je L25
    # num2 != 0 -> t52
    pushq %rax
    pushq %rbx
    movq -304(%rbp), %rax
    movq $0, %rbx
    cmpq %rbx, %rax
    setne %al
    movzbq %al, %rax
    movq %rax, %r8
    popq %rbx
    popq %rax
    # Se t52 == 0, ir para L27
    cmpq $0, %r8
    je L27
    # num1 / num2 -> t53
    pushq %rax     # Preservar RAX
    pushq %rdx     # Preservar RDX
    movq -296(%rbp), %rax
    cqto
    idivq -304(%rbp)
    movq %rax, %r9
    popq %rdx      # Restaurar RDX
    popq %rax      # Restaurar RAX
    # Atribuir t53 para result
    movq %r9, -320(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"Divisão:"', 'arg2': None, 'result': None}
    # Imprimir string "Divisão:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_15, %rsi
    movq $str_15_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'num1', 'arg2': None, 'result': None}
    # Imprimir número completo: -296(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -296(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_108
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_108:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_108
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"/"', 'arg2': None, 'result': None}
    # Imprimir string "/"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_60, %rsi
    movq $str_60_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'num2', 'arg2': None, 'result': None}
    # Imprimir número completo: -304(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -304(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_109
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_109:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_109
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"="', 'arg2': None, 'result': None}
    # Imprimir string "="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_57, %rsi
    movq $str_57_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'result', 'arg2': None, 'result': None}
    # Imprimir número completo: -320(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -320(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_110
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_110:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_110
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    jmp L26
L27:
    # PRINT: {'op': 'PRINT', 'arg1': '"Erro: Divisão por zero!"', 'arg2': None, 'result': None}
    # Imprimir string "Erro: Divisão por zero!"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_61, %rsi
    movq $str_61_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
L26:
    jmp L21
L25:
L21:
    # Atribuir 5 para n
    movq $5, -328(%rbp)
    # Atribuir 1 para fatorial
    movq $1, -336(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"Calculando fatorial de"', 'arg2': None, 'result': None}
    # Imprimir string "Calculando fatorial de"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_62, %rsi
    movq $str_62_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'n', 'arg2': None, 'result': None}
    # Imprimir número completo: -328(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -328(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_111
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_111:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_111
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Atribuir 1 para f
    movq $1, -344(%rbp)
L28:
    # f <= n -> t54
    pushq %rax
    pushq %rbx
    movq -344(%rbp), %rax
    movq -328(%rbp), %rbx
    cmpq %rbx, %rax
    setle %al
    movzbq %al, %rax
    movq %rax, %r10
    popq %rbx
    popq %rax
    # Se t54 == 0, ir para L29
    cmpq $0, %r10
    je L29
    # fatorial * f -> t55
    pushq %rax     # Preservar RAX
    movq -336(%rbp), %rax
    imulq -344(%rbp)
    movq %rax, %r11
    popq %rax      # Restaurar RAX
    # Atribuir t55 para fatorial
    movq %r11, -336(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"Passo"', 'arg2': None, 'result': None}
    # Imprimir string "Passo"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_63, %rsi
    movq $str_63_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'f', 'arg2': None, 'result': None}
    # Imprimir número completo: -344(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -344(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_112
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_112:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_112
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '":"', 'arg2': None, 'result': None}
    # Imprimir string ":"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_64, %rsi
    movq $str_64_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'fatorial', 'arg2': None, 'result': None}
    # Imprimir número completo: -336(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -336(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_113
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_113:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_113
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # f + 1 -> t56
    movq -344(%rbp), %rax
    addq $1, %rax
    movq %rax, %r12
    # Atribuir t56 para f
    movq %r12, -344(%rbp)
    jmp L28
L29:
    # PRINT: {'op': 'PRINT', 'arg1': '"Fatorial final:"', 'arg2': None, 'result': None}
    # Imprimir string "Fatorial final:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_65, %rsi
    movq $str_65_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'fatorial', 'arg2': None, 'result': None}
    # Imprimir número completo: -336(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -336(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_114
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_114:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_114
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Atribuir 0 para fib1
    movq $0, -352(%rbp)
    # Atribuir 1 para fib2
    movq $1, -360(%rbp)
    # Atribuir 0 para fib_count
    movq $0, -368(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"Sequência de Fibonacci:"', 'arg2': None, 'result': None}
    # Imprimir string "Sequência de Fibonacci:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_66, %rsi
    movq $str_66_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"F(0) ="', 'arg2': None, 'result': None}
    # Imprimir string "F(0) ="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_67, %rsi
    movq $str_67_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'fib1', 'arg2': None, 'result': None}
    # Imprimir número completo: -352(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -352(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_115
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_115:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_115
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"F(1) ="', 'arg2': None, 'result': None}
    # Imprimir string "F(1) ="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_68, %rsi
    movq $str_68_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'fib2', 'arg2': None, 'result': None}
    # Imprimir número completo: -360(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -360(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_116
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_116:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_116
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
L30:
    # fib_count < 8 -> t57
    pushq %rax
    pushq %rbx
    movq -368(%rbp), %rax
    movq $8, %rbx
    cmpq %rbx, %rax
    setl %al
    movzbq %al, %rax
    movq %rax, %r13
    popq %rbx
    popq %rax
    # Se t57 == 0, ir para L31
    cmpq $0, %r13
    je L31
    # fib1 + fib2 -> t58
    movq -352(%rbp), %rax
    addq -360(%rbp), %rax
    movq %rax, %r14
    # Atribuir t58 para proximo
    movq %r14, -376(%rbp)
    # fib_count + 1 -> t59
    movq -368(%rbp), %rax
    addq $1, %rax
    movq %rax, %r15
    # Atribuir t59 para fib_count
    movq %r15, -368(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"F("', 'arg2': None, 'result': None}
    # Imprimir string "F("
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_69, %rsi
    movq $str_69_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # fib_count + 1 -> t60
    movq -368(%rbp), %rax
    addq $1, %rax
    movq %rax, %rbx
    # PRINT: {'op': 'PRINT', 'arg1': 't60', 'arg2': None, 'result': None}
    # Imprimir número completo: %rbx
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq %rbx, %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_117
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_117:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_117
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '") ="', 'arg2': None, 'result': None}
    # Imprimir string ") ="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_70, %rsi
    movq $str_70_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'proximo', 'arg2': None, 'result': None}
    # Imprimir número completo: -376(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -376(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_118
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_118:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_118
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Atribuir fib2 para fib1 (via %rax)
    movq -360(%rbp), %rax
    movq %rax, -352(%rbp)
    # Atribuir proximo para fib2 (via %rax)
    movq -376(%rbp), %rax
    movq %rax, -360(%rbp)
    jmp L30
L31:
    # Atribuir 8.5 para nota
    movq $8, -384(%rbp)
    # Atribuir 85.0 para frequencia
    movq $85, -392(%rbp)
    # PRINT: {'op': 'PRINT', 'arg1': '"=== VALIDAÇÃO DE APROVAÇÃO ==="', 'arg2': None, 'result': None}
    # Imprimir string "=== VALIDAÇÃO DE APROVAÇÃO ==="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_71, %rsi
    movq $str_71_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Nota:"', 'arg2': None, 'result': None}
    # Imprimir string "Nota:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_72, %rsi
    movq $str_72_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'nota', 'arg2': None, 'result': None}
    # Imprimir número completo: -384(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -384(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_119
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_119:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_119
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Frequência:"', 'arg2': None, 'result': None}
    # Imprimir string "Frequência:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_73, %rsi
    movq $str_73_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': 'frequencia', 'arg2': None, 'result': None}
    # Imprimir número completo: -392(%rbp)
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    pushq %rcx
    pushq %r8
    # Carregar número
    movq -392(%rbp), %rax
    # Buffer para conversão
    movq $number_buffer, %rdi
    addq $31, %rdi  # Apontar para o final do buffer
    movb $0, (%rdi)  # Terminar string
    movq $10, %rcx   # Base 10
    # Verificar sinal
    cmpq $0, %rax
    jge convert_loop_120
    # Número negativo
    negq %rax
    movb $45, temp_char  # '-'
    pushq %rax
    movq $1, %rax
    movq $1, %rdi
    movq $temp_char, %rsi
    movq $1, %rdx
    syscall
    popq %rax
    movq $number_buffer, %rdi
    addq $31, %rdi
convert_loop_120:
    decq %rdi
    xorq %rdx, %rdx
    divq %rcx
    addq $48, %rdx  # Converter para ASCII
    movb %dl, (%rdi)
    testq %rax, %rax
    jnz convert_loop_120
    # Imprimir string convertida
    movq $number_buffer, %rsi
    addq $32, %rsi
    subq %rdi, %rsi  # Calcular comprimento
    movq %rsi, %rdx
    movq %rdi, %rsi
    movq $1, %rax
    movq $1, %rdi
    syscall
    # Restaurar registradores
    popq %r8
    popq %rcx
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # nota >= 7.0 -> t61
    pushq %rax
    pushq %rbx
    movq -384(%rbp), %rax
    movq $7, %rbx
    cmpq %rbx, %rax
    setge %al
    movzbq %al, %rax
    movq %rax, %rcx
    popq %rbx
    popq %rax
    # frequencia >= 75.0 -> t62
    pushq %rax
    pushq %rbx
    movq -392(%rbp), %rax
    movq $75, %rbx
    cmpq %rbx, %rax
    setge %al
    movzbq %al, %rax
    movq %rax, %r8
    popq %rbx
    popq %rax
    # t61 && t62 -> t63
    movq %rcx, %r9
    cmpq $0, %r9
    je and_end_121
    movq %r8, %r9
and_end_121:
    # Se t63 == 0, ir para L33
    cmpq $0, %r9
    je L33
    # PRINT: {'op': 'PRINT', 'arg1': '"APROVADO! ✓"', 'arg2': None, 'result': None}
    # Imprimir string "APROVADO! ✓"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_74, %rsi
    movq $str_74_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    jmp L32
L33:
    # nota >= 5.0 -> t64
    pushq %rax
    pushq %rbx
    movq -384(%rbp), %rax
    movq $5, %rbx
    cmpq %rbx, %rax
    setge %al
    movzbq %al, %rax
    movq %rax, %r10
    popq %rbx
    popq %rax
    # frequencia >= 75.0 -> t65
    pushq %rax
    pushq %rbx
    movq -392(%rbp), %rax
    movq $75, %rbx
    cmpq %rbx, %rax
    setge %al
    movzbq %al, %rax
    movq %rax, %r11
    popq %rbx
    popq %rax
    # t64 && t65 -> t66
    movq %r10, %r12
    cmpq $0, %r12
    je and_end_122
    movq %r11, %r12
and_end_122:
    # Se t66 == 0, ir para L34
    cmpq $0, %r12
    je L34
    # PRINT: {'op': 'PRINT', 'arg1': '"RECUPERAÇÃO"', 'arg2': None, 'result': None}
    # Imprimir string "RECUPERAÇÃO"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_75, %rsi
    movq $str_75_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    jmp L32
L34:
    # PRINT: {'op': 'PRINT', 'arg1': '"REPROVADO ✗"', 'arg2': None, 'result': None}
    # Imprimir string "REPROVADO ✗"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_76, %rsi
    movq $str_76_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
L32:
    # PRINT: {'op': 'PRINT', 'arg1': '"=========================="', 'arg2': None, 'result': None}
    # Imprimir string "=========================="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_77, %rsi
    movq $str_77_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Demonstração finalizada!"', 'arg2': None, 'result': None}
    # Imprimir string "Demonstração finalizada!"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_78, %rsi
    movq $str_78_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"Todas as funcionalidades foram testadas:"', 'arg2': None, 'result': None}
    # Imprimir string "Todas as funcionalidades foram testadas:"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_79, %rsi
    movq $str_79_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"✓ Tipos: int, float, String, bool"', 'arg2': None, 'result': None}
    # Imprimir string "✓ Tipos: int, float, String, bool"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_80, %rsi
    movq $str_80_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"✓ Operadores: +, -, *, /, ==, !=, <, >, <=, >=, &&, ||"', 'arg2': None, 'result': None}
    # Imprimir string "✓ Operadores: +, -, *, /, ==, !=, <, >, <=, >=, &&, ||"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_81, %rsi
    movq $str_81_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"✓ Estruturas: if/elseif/else, for, while"', 'arg2': None, 'result': None}
    # Imprimir string "✓ Estruturas: if/elseif/else, for, while"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_82, %rsi
    movq $str_82_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"✓ E/S: print, input"', 'arg2': None, 'result': None}
    # Imprimir string "✓ E/S: print, input"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_83, %rsi
    movq $str_83_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"✓ Expressões complexas e precedência"', 'arg2': None, 'result': None}
    # Imprimir string "✓ Expressões complexas e precedência"
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_84, %rsi
    movq $str_84_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # PRINT: {'op': 'PRINT', 'arg1': '"=========================="', 'arg2': None, 'result': None}
    # Imprimir string "=========================="
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $str_77, %rsi
    movq $str_77_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax
    # Imprimir newline
    pushq %rax
    pushq %rdi
    pushq %rsi
    pushq %rdx
    movq $1, %rax      # sys_write
    movq $1, %rdi      # stdout
    movq $newline, %rsi
    movq $newline_len, %rdx
    syscall
    popq %rdx
    popq %rsi
    popq %rdi
    popq %rax

    # Finalizar programa
    jmp exit_program

exit_program:
    # Restaurar stack frame
    movq %rbp, %rsp
    popq %rbp
    # Syscall exit(0)
    movq $60, %rax      # sys_exit
    movq $0, %rdi       # status code 0
    syscall