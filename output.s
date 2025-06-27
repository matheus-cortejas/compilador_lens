# =============================================================================
# Assembly x86-64 gerado pelo Compilador Lens
# =============================================================================
# Para compilar e executar:
#   as -64 output.s -o output.o
#   ld output.o -o programa
#   ./programa
# =============================================================================

.section .data
    # Strings do programa
    str_1: .ascii "Resultado válido:"
    str_1_len = . - str_1
    newline: .ascii "\n"
    newline_len = . - newline

# =============================================================================
.section .text
    .global _start

_start:
    # Configurar stack frame
    pushq %rbp
    movq %rsp, %rbp

    movq $1, %rbx
    addq $2, %rbx

    movq %rbx, %rcx

    # Imprimir string: "Resultado válido:"
    movq $1, %rax        # sys_write
    movq $1, %rdi        # stdout
    movq $str_1, %rsi  # endereço da string
    movq $str_1_len, %rdx  # tamanho da string
    syscall
    # Imprimir valor: valido (simplificado)
    movq %rcx, %rax
    # TODO: Converter número para string e imprimir
    # Imprimir newline
    movq $1, %rax        # sys_write
    movq $1, %rdi        # stdout
    movq $newline, %rsi  # endereço do \n
    movq $newline_len, %rdx  # tamanho = 1
    syscall


# =============================================================================
# Finalização do programa
# =============================================================================

exit_program:
    # Restaurar stack frame
    movq %rbp, %rsp
    popq %rbp

    # Syscall exit(0)
    movq $60, %rax      # sys_exit
    movq $0, %rdi       # status code 0
    syscall

# =============================================================================
# Fim do código Assembly
# =============================================================================