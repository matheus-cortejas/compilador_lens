// Código Intermediário TAC - Linguagem Lens
// Gerado automaticamente pelo compilador

idade = 25
altura = 175
nome = "João Silva"
ativo = True
contador = 0
peso = 70
sobrenome = "Santos"
aprovado = False
t1 = idade + 5
idade = t1
t2 = altura - 5
altura = t2
t3 = contador * 2
contador = t3
t4 = peso / 2
peso = t4
print "=== DEMONSTRAÇÃO LENS ==="
print nome
print idade
print "Nome completo:"
print nome
print sobrenome
print "Idade atual:"
print idade
print "Altura:"
print altura
print "Peso:"
print peso
print "Status ativo:"
print ativo
print "Aprovado:"
print aprovado
a = 10
b = 3
t5 = a + b
soma = t5
t6 = a - b
subtracao = t6
t7 = a * b
multiplicacao = t7
t8 = a / b
divisao = t8
print "Operações com"
print a
print "e"
print b
print "Soma:"
print soma
print "Subtração:"
print subtracao
print "Multiplicação:"
print multiplicacao
print "Divisão:"
print divisao
t9 = b * 2
t10 = a + t9
t11 = t10 - 1
resultado = t11
t12 = a + b
t13 = t12 * 2
complexo = t13
print "Resultado complexo:"
print resultado
print "Com parênteses:"
print complexo
t14 = a == b
igual = t14
t15 = a != b
diferente = t15
t16 = a < b
menor = t16
t17 = a > b
maior = t17
t18 = a <= b
menorIgual = t18
t19 = a >= b
maiorIgual = t19
print "=== COMPARAÇÕES ==="
print "10 == 3:"
print igual
print "10 != 3:"
print diferente
print "10 < 3:"
print menor
print "10 > 3:"
print maior
print "10 <= 3:"
print menorIgual
print "10 >= 3:"
print maiorIgual
condicao1 = True
condicao2 = False
t20 = condicao1 && condicao2
e_logico = t20
t21 = condicao1 || condicao2
ou_logico = t21
print "=== OPERAÇÕES LÓGICAS ==="
print "True && False:"
print e_logico
print "True || False:"
print ou_logico
t22 = a > b
t23 = soma > 10
t24 = t22 && t23
complexa = t24
print "Expressão complexa:"
print complexa
print "Digite um número:"
read entrada_usuario
print "Você digitou:"
print entrada_usuario
print "=== ESTRUTURAS CONDICIONAIS ==="
t25 = idade >= 18
if_false t25 goto L2
print "Maior de idade"
goto L1
L2:
L1:
t26 = idade < 13
if_false t26 goto L4
print "Criança"
goto L3
L4:
t27 = idade < 18
if_false t27 goto L5
print "Adolescente"
goto L3
L5:
t28 = idade < 60
if_false t28 goto L6
print "Adulto"
goto L3
L6:
print "Idoso"
L3:
t29 = ativo == True
if_false t29 goto L8
print "Usuário ativo"
t30 = aprovado == True
if_false t30 goto L10
print "E está aprovado!"
goto L9
L10:
print "Mas não está aprovado"
L9:
goto L7
L8:
print "Usuário inativo"
L7:
print "=== LAÇOS FOR ==="
print "Contagem de 1 a 5:"
i = 1
L11:
t31 = i <= 5
if_false t31 goto L12
print "Número:"
print i
t32 = i + 1
i = t32
goto L11
L12:
print "Contagem regressiva:"
j = 10
L13:
t33 = j >= 7
if_false t33 goto L14
print "Contagem:"
print j
t34 = j - 1
j = t34
goto L13
L14:
inicio = 0
fim = 3
print "Range dinâmico:"
k = inicio
L15:
t35 = k <= fim
if_false t35 goto L16
print "Valor de k:"
print k
t36 = k * k
quadrado = t36
print "Quadrado:"
print quadrado
t37 = k + 1
k = t37
goto L15
L16:
print "=== LAÇOS WHILE ==="
cont = 0
print "Contagem while até 3:"
L17:
t38 = cont < 3
if_false t38 goto L18
print "Contador:"
print cont
t39 = cont + 1
cont = t39
goto L17
L18:
x = 10
y = 1
print "While com condição complexa:"
L19:
t40 = x > y
t41 = y < 5
t42 = t40 && t41
if_false t42 goto L20
print "x ="
print x
print "y ="
print y
t43 = x - 2
x = t43
t44 = y + 1
y = t44
goto L19
L20:
print "=== CASOS AVANÇADOS ==="
num1 = 15
num2 = 4
operacao = 1
t45 = operacao == 1
if_false t45 goto L22
t46 = num1 + num2
result = t46
print "Soma:"
print num1
print "+"
print num2
print "="
print result
goto L21
L22:
t47 = operacao == 2
if_false t47 goto L23
t48 = num1 - num2
result = t48
print "Subtração:"
print num1
print "-"
print num2
print "="
print result
goto L21
L23:
t49 = operacao == 3
if_false t49 goto L24
t50 = num1 * num2
result = t50
print "Multiplicação:"
print num1
print "*"
print num2
print "="
print result
goto L21
L24:
t51 = operacao == 4
if_false t51 goto L25
t52 = num2 != 0
if_false t52 goto L27
t53 = num1 / num2
result = t53
print "Divisão:"
print num1
print "/"
print num2
print "="
print result
goto L26
L27:
print "Erro: Divisão por zero!"
L26:
goto L21
L25:
L21:
n = 5
fatorial = 1
print "Calculando fatorial de"
print n
f = 1
L28:
t54 = f <= n
if_false t54 goto L29
t55 = fatorial * f
fatorial = t55
print "Passo"
print f
print ":"
print fatorial
t56 = f + 1
f = t56
goto L28
L29:
print "Fatorial final:"
print fatorial
fib1 = 0
fib2 = 1
fib_count = 0
print "Sequência de Fibonacci:"
print "F(0) ="
print fib1
print "F(1) ="
print fib2
L30:
t57 = fib_count < 8
if_false t57 goto L31
t58 = fib1 + fib2
proximo = t58
t59 = fib_count + 1
fib_count = t59
print "F("
t60 = fib_count + 1
print t60
print ") ="
print proximo
fib1 = fib2
fib2 = proximo
goto L30
L31:
nota = 8
frequencia = 85
print "=== VALIDAÇÃO DE APROVAÇÃO ==="
print "Nota:"
print nota
print "Frequência:"
print frequencia
t61 = nota >= 7
t62 = frequencia >= 75
t63 = t61 && t62
if_false t63 goto L33
print "APROVADO! ✓"
goto L32
L33:
t64 = nota >= 5
t65 = frequencia >= 75
t66 = t64 && t65
if_false t66 goto L34
print "RECUPERAÇÃO"
goto L32
L34:
print "REPROVADO ✗"
L32:
print "=========================="
print "Demonstração finalizada!"
print "Todas as funcionalidades foram testadas:"
print "✓ Tipos: int, int, String, bool"
print "✓ Operadores: +, -, *, /, ==, !=, <, >, <=, >=, &&, ||"
print "✓ Estruturas: if/elseif/else, for, while"
print "✓ E/S: print, input"
print "✓ Expressões complexas e precedência"
print "=========================="
