; LLVM IR gerado pelo compilador - Windows
target triple = "x86_64-pc-windows-msvc"
target datalayout = "e-m:w-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"

; Declarações de funções externas para Windows
declare dso_local i32 @printf(i8*, ...)
declare dso_local i32 @scanf(i8*, ...)
declare dso_local void @exit(i32)

@.str_int = private constant [4 x i8] c"%d\0A\00", align 1
@str_1 = private constant [12 x i8] c"João Silva\0A\00", align 1
@str_2 = private constant [8 x i8] c"Santos\0A\00", align 1
@str_3 = private constant [27 x i8] c"=== DEMONSTRAÇÃO LENS ===\0A\00", align 1
@str_4 = private constant [16 x i8] c"Nome completo:\0A\00", align 1
@str_5 = private constant [14 x i8] c"Idade atual:\0A\00", align 1
@str_6 = private constant [9 x i8] c"Altura:\0A\00", align 1
@str_7 = private constant [7 x i8] c"Peso:\0A\00", align 1
@str_8 = private constant [15 x i8] c"Status ativo:\0A\00", align 1
@str_9 = private constant [11 x i8] c"Aprovado:\0A\00", align 1
@str_10 = private constant [15 x i8] c"Operações com\0A\00", align 1
@str_11 = private constant [3 x i8] c"e\0A\00", align 1
@str_12 = private constant [7 x i8] c"Soma:\0A\00", align 1
@str_13 = private constant [12 x i8] c"Subtração:\0A\00", align 1
@str_14 = private constant [16 x i8] c"Multiplicação:\0A\00", align 1
@str_15 = private constant [10 x i8] c"Divisão:\0A\00", align 1
@str_16 = private constant [21 x i8] c"Resultado complexo:\0A\00", align 1
@str_17 = private constant [17 x i8] c"Com parênteses:\0A\00", align 1
@str_18 = private constant [21 x i8] c"=== COMPARAÇÕES ===\0A\00", align 1
@str_19 = private constant [10 x i8] c"10 == 3:\0A\00", align 1
@str_20 = private constant [10 x i8] c"10 != 3:\0A\00", align 1
@str_21 = private constant [9 x i8] c"10 < 3:\0A\00", align 1
@str_22 = private constant [9 x i8] c"10 > 3:\0A\00", align 1
@str_23 = private constant [10 x i8] c"10 <= 3:\0A\00", align 1
@str_24 = private constant [10 x i8] c"10 >= 3:\0A\00", align 1
@str_25 = private constant [27 x i8] c"=== OPERAÇÕES LÓGICAS ===\0A\00", align 1
@str_26 = private constant [16 x i8] c"True && False:\0A\00", align 1
@str_27 = private constant [16 x i8] c"True || False:\0A\00", align 1
@str_28 = private constant [21 x i8] c"Expressão complexa:\0A\00", align 1
@str_29 = private constant [19 x i8] c"Digite um número:\0A\00", align 1
@str_30 = private constant [15 x i8] c"Você digitou:\0A\00", align 1
@str_31 = private constant [33 x i8] c"=== ESTRUTURAS CONDICIONAIS ===\0A\00", align 1
@str_32 = private constant [16 x i8] c"Maior de idade\0A\00", align 1
@str_33 = private constant [9 x i8] c"Criança\0A\00", align 1
@str_34 = private constant [13 x i8] c"Adolescente\0A\00", align 1
@str_35 = private constant [8 x i8] c"Adulto\0A\00", align 1
@str_36 = private constant [7 x i8] c"Idoso\0A\00", align 1
@str_37 = private constant [15 x i8] c"Usuário ativo\0A\00", align 1
@str_38 = private constant [18 x i8] c"E está aprovado!\0A\00", align 1
@str_39 = private constant [23 x i8] c"Mas não está aprovado\0A\00", align 1
@str_40 = private constant [17 x i8] c"Usuário inativo\0A\00", align 1
@str_41 = private constant [19 x i8] c"=== LAÇOS FOR ===\0A\00", align 1
@str_42 = private constant [20 x i8] c"Contagem de 1 a 5:\0A\00", align 1
@str_43 = private constant [9 x i8] c"Número:\0A\00", align 1
@str_44 = private constant [22 x i8] c"Contagem regressiva:\0A\00", align 1
@str_45 = private constant [11 x i8] c"Contagem:\0A\00", align 1
@str_46 = private constant [17 x i8] c"Range dinâmico:\0A\00", align 1
@str_47 = private constant [13 x i8] c"Valor de k:\0A\00", align 1
@str_48 = private constant [11 x i8] c"Quadrado:\0A\00", align 1
@str_49 = private constant [21 x i8] c"=== LAÇOS WHILE ===\0A\00", align 1
@str_50 = private constant [23 x i8] c"Contagem while até 3:\0A\00", align 1
@str_51 = private constant [11 x i8] c"Contador:\0A\00", align 1
@str_52 = private constant [30 x i8] c"While com condição complexa:\0A\00", align 1
@str_53 = private constant [5 x i8] c"x =\0A\00", align 1
@str_54 = private constant [5 x i8] c"y =\0A\00", align 1
@str_55 = private constant [25 x i8] c"=== CASOS AVANÇADOS ===\0A\00", align 1
@str_56 = private constant [3 x i8] c"+\0A\00", align 1
@str_57 = private constant [3 x i8] c"=\0A\00", align 1
@str_58 = private constant [3 x i8] c"-\0A\00", align 1
@str_59 = private constant [3 x i8] c"*\0A\00", align 1
@str_60 = private constant [3 x i8] c"/\0A\00", align 1
@str_61 = private constant [25 x i8] c"Erro: Divisão por zero!\0A\00", align 1
@str_62 = private constant [24 x i8] c"Calculando fatorial de\0A\00", align 1
@str_63 = private constant [7 x i8] c"Passo\0A\00", align 1
@str_64 = private constant [3 x i8] c":\0A\00", align 1
@str_65 = private constant [17 x i8] c"Fatorial final:\0A\00", align 1
@str_66 = private constant [25 x i8] c"Sequência de Fibonacci:\0A\00", align 1
@str_67 = private constant [8 x i8] c"F(0) =\0A\00", align 1
@str_68 = private constant [8 x i8] c"F(1) =\0A\00", align 1
@str_69 = private constant [4 x i8] c"F(\0A\00", align 1
@str_70 = private constant [5 x i8] c") =\0A\00", align 1
@str_71 = private constant [32 x i8] c"=== VALIDAÇÃO DE APROVAÇÃO ===\0A\00", align 1
@str_72 = private constant [7 x i8] c"Nota:\0A\00", align 1
@str_73 = private constant [13 x i8] c"Frequência:\0A\00", align 1
@str_74 = private constant [13 x i8] c"APROVADO! ✓\0A\00", align 1
@str_75 = private constant [13 x i8] c"RECUPERAÇÃO\0A\00", align 1
@str_76 = private constant [13 x i8] c"REPROVADO ✗\0A\00", align 1
@str_77 = private constant [28 x i8] c"==========================\0A\00", align 1
@str_78 = private constant [26 x i8] c"Demonstração finalizada!\0A\00", align 1
@str_79 = private constant [42 x i8] c"Todas as funcionalidades foram testadas:\0A\00", align 1
@str_80 = private constant [33 x i8] c"✓ Tipos: int, int, String, bool\0A\00", align 1
@str_81 = private constant [56 x i8] c"✓ Operadores: +, -, *, /, ==, !=, <, >, <=, >=, &&, ||\0A\00", align 1
@str_82 = private constant [42 x i8] c"✓ Estruturas: if/elseif/else, for, while\0A\00", align 1
@str_83 = private constant [21 x i8] c"✓ E/S: print, input\0A\00", align 1
@str_84 = private constant [38 x i8] c"✓ Expressões complexas e precedência\0A\00", align 1

define dso_local i32 @main() {
entry:
  %1 = add i64 0, 25
  %2 = add i64 0, 175
  ; Atribuir string "João Silva" para nome
  %3 = getelementptr [11 x i8], [11 x i8]* @str_1, i32 0, i32 0
  %4 = add i64 0, %5
  %6 = add i64 0, 0
  %7 = add i64 0, 70
  ; Atribuir string "Santos" para sobrenome
  %8 = getelementptr [7 x i8], [7 x i8]* @str_2, i32 0, i32 0
  %9 = add i64 0, %10
  ; idade + 5 -> t1
  %11 = add i64 %1, 5
  %1 = add i64 0, %11
  ; altura - 5 -> t2
  %12 = sub i64 %2, 5
  %2 = add i64 0, %12
  ; contador * 2 -> t3
  %13 = mul i64 %6, 2
  %6 = add i64 0, %13
  ; peso / 2 -> t4
  %14 = sdiv i64 %7, 2
  %7 = add i64 0, %14
  ; Imprimir string "=== DEMONSTRAÇÃO LENS ==="
  %353 = getelementptr [28 x i8], [28 x i8]* @str_3, i32 0, i32 0
  call i32 @printf(i8* %353)
  ; Imprimir variável string nome
  call i32 @printf(i8* %3)
  ; Imprimir número idade
  %354 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %354, i64 %1)
  ; Imprimir string "Nome completo:"
  %355 = getelementptr [17 x i8], [17 x i8]* @str_4, i32 0, i32 0
  call i32 @printf(i8* %355)
  ; Imprimir variável string nome
  call i32 @printf(i8* %3)
  ; Imprimir variável string sobrenome
  call i32 @printf(i8* %8)
  ; Imprimir string "Idade atual:"
  %356 = getelementptr [15 x i8], [15 x i8]* @str_5, i32 0, i32 0
  call i32 @printf(i8* %356)
  ; Imprimir número idade
  %357 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %357, i64 %1)
  ; Imprimir string "Altura:"
  %358 = getelementptr [10 x i8], [10 x i8]* @str_6, i32 0, i32 0
  call i32 @printf(i8* %358)
  ; Imprimir número altura
  %359 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %359, i64 %2)
  ; Imprimir string "Peso:"
  %360 = getelementptr [8 x i8], [8 x i8]* @str_7, i32 0, i32 0
  call i32 @printf(i8* %360)
  ; Imprimir número peso
  %361 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %361, i64 %7)
  ; Imprimir string "Status ativo:"
  %362 = getelementptr [16 x i8], [16 x i8]* @str_8, i32 0, i32 0
  call i32 @printf(i8* %362)
  ; Imprimir número ativo
  %363 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %363, i64 %4)
  ; Imprimir string "Aprovado:"
  %364 = getelementptr [12 x i8], [12 x i8]* @str_9, i32 0, i32 0
  call i32 @printf(i8* %364)
  ; Imprimir número aprovado
  %365 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %365, i64 %9)
  %28 = add i64 0, 10
  %29 = add i64 0, 3
  ; a + b -> t5
  %30 = add i64 %28, %29
  %31 = add i64 0, %30
  ; a - b -> t6
  %32 = sub i64 %28, %29
  %33 = add i64 0, %32
  ; a * b -> t7
  %34 = mul i64 %28, %29
  %35 = add i64 0, %34
  ; a / b -> t8
  %36 = sdiv i64 %28, %29
  %37 = add i64 0, %36
  ; Imprimir string "Operações com"
  %366 = getelementptr [16 x i8], [16 x i8]* @str_10, i32 0, i32 0
  call i32 @printf(i8* %366)
  ; Imprimir número a
  %367 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %367, i64 %28)
  ; Imprimir string "e"
  %368 = getelementptr [4 x i8], [4 x i8]* @str_11, i32 0, i32 0
  call i32 @printf(i8* %368)
  ; Imprimir número b
  %369 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %369, i64 %29)
  ; Imprimir string "Soma:"
  %370 = getelementptr [8 x i8], [8 x i8]* @str_12, i32 0, i32 0
  call i32 @printf(i8* %370)
  ; Imprimir número soma
  %371 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %371, i64 %31)
  ; Imprimir string "Subtração:"
  %372 = getelementptr [13 x i8], [13 x i8]* @str_13, i32 0, i32 0
  call i32 @printf(i8* %372)
  ; Imprimir número subtracao
  %373 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %373, i64 %33)
  ; Imprimir string "Multiplicação:"
  %374 = getelementptr [17 x i8], [17 x i8]* @str_14, i32 0, i32 0
  call i32 @printf(i8* %374)
  ; Imprimir número multiplicacao
  %375 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %375, i64 %35)
  ; Imprimir string "Divisão:"
  %376 = getelementptr [11 x i8], [11 x i8]* @str_15, i32 0, i32 0
  call i32 @printf(i8* %376)
  ; Imprimir número divisao
  %377 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %377, i64 %37)
  ; b * 2 -> t9
  %50 = mul i64 %29, 2
  ; a + t9 -> t10
  %51 = add i64 %28, %50
  ; t10 - 1 -> t11
  %52 = sub i64 %51, 1
  %53 = add i64 0, %52
  ; a + b -> t12
  %54 = add i64 %28, %29
  ; t12 * 2 -> t13
  %55 = mul i64 %54, 2
  %56 = add i64 0, %55
  ; Imprimir string "Resultado complexo:"
  %378 = getelementptr [22 x i8], [22 x i8]* @str_16, i32 0, i32 0
  call i32 @printf(i8* %378)
  ; Imprimir número resultado
  %379 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %379, i64 %53)
  ; Imprimir string "Com parênteses:"
  %380 = getelementptr [18 x i8], [18 x i8]* @str_17, i32 0, i32 0
  call i32 @printf(i8* %380)
  ; Imprimir número complexo
  %381 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %381, i64 %56)
  ; a == b -> t14
  %382 = icmp eq i64 %28, %29
  %61 = zext i1 %382 to i64
  %63 = add i64 0, %61
  ; a != b -> t15
  %383 = icmp ne i64 %28, %29
  %64 = zext i1 %383 to i64
  %66 = add i64 0, %64
  ; a < b -> t16
  %384 = icmp slt i64 %28, %29
  %67 = zext i1 %384 to i64
  %69 = add i64 0, %67
  ; a > b -> t17
  %385 = icmp sgt i64 %28, %29
  %70 = zext i1 %385 to i64
  %72 = add i64 0, %70
  ; a <= b -> t18
  %386 = icmp sle i64 %28, %29
  %73 = zext i1 %386 to i64
  %75 = add i64 0, %73
  ; a >= b -> t19
  %387 = icmp sge i64 %28, %29
  %76 = zext i1 %387 to i64
  %78 = add i64 0, %76
  ; Imprimir string "=== COMPARAÇÕES ==="
  %388 = getelementptr [22 x i8], [22 x i8]* @str_18, i32 0, i32 0
  call i32 @printf(i8* %388)
  ; Imprimir string "10 == 3:"
  %389 = getelementptr [11 x i8], [11 x i8]* @str_19, i32 0, i32 0
  call i32 @printf(i8* %389)
  ; Imprimir número igual
  %390 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %390, i64 %63)
  ; Imprimir string "10 != 3:"
  %391 = getelementptr [11 x i8], [11 x i8]* @str_20, i32 0, i32 0
  call i32 @printf(i8* %391)
  ; Imprimir número diferente
  %392 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %392, i64 %66)
  ; Imprimir string "10 < 3:"
  %393 = getelementptr [10 x i8], [10 x i8]* @str_21, i32 0, i32 0
  call i32 @printf(i8* %393)
  ; Imprimir número menor
  %394 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %394, i64 %69)
  ; Imprimir string "10 > 3:"
  %395 = getelementptr [10 x i8], [10 x i8]* @str_22, i32 0, i32 0
  call i32 @printf(i8* %395)
  ; Imprimir número maior
  %396 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %396, i64 %72)
  ; Imprimir string "10 <= 3:"
  %397 = getelementptr [11 x i8], [11 x i8]* @str_23, i32 0, i32 0
  call i32 @printf(i8* %397)
  ; Imprimir número menorIgual
  %398 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %398, i64 %75)
  ; Imprimir string "10 >= 3:"
  %399 = getelementptr [11 x i8], [11 x i8]* @str_24, i32 0, i32 0
  call i32 @printf(i8* %399)
  ; Imprimir número maiorIgual
  %400 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %400, i64 %78)
  %92 = add i64 0, %5
  %93 = add i64 0, %10
  ; condicao1 && condicao2 -> t20
  %401 = icmp ne i64 %92, 0
  %402 = icmp ne i64 %93, 0
  %403 = and i1 %401, %402
  %94 = zext i1 %403 to i64
  %98 = add i64 0, %94
  ; condicao1 || condicao2 -> t21
  %404 = icmp ne i64 %92, 0
  %405 = icmp ne i64 %93, 0
  %406 = or i1 %404, %405
  %99 = zext i1 %406 to i64
  %103 = add i64 0, %99
  ; Imprimir string "=== OPERAÇÕES LÓGICAS ==="
  %407 = getelementptr [28 x i8], [28 x i8]* @str_25, i32 0, i32 0
  call i32 @printf(i8* %407)
  ; Imprimir string "True && False:"
  %408 = getelementptr [17 x i8], [17 x i8]* @str_26, i32 0, i32 0
  call i32 @printf(i8* %408)
  ; Imprimir número e_logico
  %409 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %409, i64 %98)
  ; Imprimir string "True || False:"
  %410 = getelementptr [17 x i8], [17 x i8]* @str_27, i32 0, i32 0
  call i32 @printf(i8* %410)
  ; Imprimir número ou_logico
  %411 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %411, i64 %103)
  ; a > b -> t22
  %412 = icmp sgt i64 %28, %29
  %109 = zext i1 %412 to i64
  ; soma > 10 -> t23
  %413 = icmp sgt i64 %31, 10
  %111 = zext i1 %413 to i64
  ; t22 && t23 -> t24
  %414 = icmp ne i64 %109, 0
  %415 = icmp ne i64 %111, 0
  %416 = and i1 %414, %415
  %113 = zext i1 %416 to i64
  %117 = add i64 0, %113
  ; Imprimir string "Expressão complexa:"
  %417 = getelementptr [22 x i8], [22 x i8]* @str_28, i32 0, i32 0
  call i32 @printf(i8* %417)
  ; Imprimir número complexa
  %418 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %418, i64 %117)
  ; Imprimir string "Digite um número:"
  %419 = getelementptr [20 x i8], [20 x i8]* @str_29, i32 0, i32 0
  call i32 @printf(i8* %419)
  ; Ler valor para entrada_usuario
  %421 = alloca i64, align 8
  %420 = getelementptr [3 x i8], [3 x i8]* @.str_read, i32 0, i32 0
  call i32 @scanf(i8* %420, i64* %421)
  %121 = load i64, i64* %421, align 8
  ; Imprimir string "Você digitou:"
  %422 = getelementptr [16 x i8], [16 x i8]* @str_30, i32 0, i32 0
  call i32 @printf(i8* %422)
  ; Imprimir número entrada_usuario
  %423 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %423, i64 %121)
  ; Imprimir string "=== ESTRUTURAS CONDICIONAIS ==="
  %424 = getelementptr [34 x i8], [34 x i8]* @str_31, i32 0, i32 0
  call i32 @printf(i8* %424)
  ; idade >= 18 -> t25
  %425 = icmp sge i64 %1, 18
  %127 = zext i1 %425 to i64
  ; Se t25 é falso, pular para None
  %426 = icmp eq i64 %127, 0
  br i1 %426, label %None, label %label_427
  ; Imprimir string "Maior de idade"
  %428 = getelementptr [17 x i8], [17 x i8]* @str_32, i32 0, i32 0
  call i32 @printf(i8* %428)
  br label %None
L2:
L1:
  ; idade < 13 -> t26
  %429 = icmp slt i64 %1, 13
  %132 = zext i1 %429 to i64
  ; Se t26 é falso, pular para None
  %430 = icmp eq i64 %132, 0
  br i1 %430, label %None, label %label_431
  ; Imprimir string "Criança"
  %432 = getelementptr [10 x i8], [10 x i8]* @str_33, i32 0, i32 0
  call i32 @printf(i8* %432)
  br label %None
L4:
  ; idade < 18 -> t27
  %433 = icmp slt i64 %1, 18
  %137 = zext i1 %433 to i64
  ; Se t27 é falso, pular para None
  %434 = icmp eq i64 %137, 0
  br i1 %434, label %None, label %label_435
  ; Imprimir string "Adolescente"
  %436 = getelementptr [14 x i8], [14 x i8]* @str_34, i32 0, i32 0
  call i32 @printf(i8* %436)
  br label %None
L5:
  ; idade < 60 -> t28
  %437 = icmp slt i64 %1, 60
  %142 = zext i1 %437 to i64
  ; Se t28 é falso, pular para None
  %438 = icmp eq i64 %142, 0
  br i1 %438, label %None, label %label_439
  ; Imprimir string "Adulto"
  %440 = getelementptr [9 x i8], [9 x i8]* @str_35, i32 0, i32 0
  call i32 @printf(i8* %440)
  br label %None
L6:
  ; Imprimir string "Idoso"
  %441 = getelementptr [8 x i8], [8 x i8]* @str_36, i32 0, i32 0
  call i32 @printf(i8* %441)
L3:
  ; ativo == True -> t29
  %442 = icmp eq i64 %4, %5
  %148 = zext i1 %442 to i64
  ; Se t29 é falso, pular para None
  %443 = icmp eq i64 %148, 0
  br i1 %443, label %None, label %label_444
  ; Imprimir string "Usuário ativo"
  %445 = getelementptr [16 x i8], [16 x i8]* @str_37, i32 0, i32 0
  call i32 @printf(i8* %445)
  ; aprovado == True -> t30
  %446 = icmp eq i64 %9, %5
  %153 = zext i1 %446 to i64
  ; Se t30 é falso, pular para None
  %447 = icmp eq i64 %153, 0
  br i1 %447, label %None, label %label_448
  ; Imprimir string "E está aprovado!"
  %449 = getelementptr [19 x i8], [19 x i8]* @str_38, i32 0, i32 0
  call i32 @printf(i8* %449)
  br label %None
L10:
  ; Imprimir string "Mas não está aprovado"
  %450 = getelementptr [24 x i8], [24 x i8]* @str_39, i32 0, i32 0
  call i32 @printf(i8* %450)
L9:
  br label %None
L8:
  ; Imprimir string "Usuário inativo"
  %451 = getelementptr [18 x i8], [18 x i8]* @str_40, i32 0, i32 0
  call i32 @printf(i8* %451)
L7:
  ; Imprimir string "=== LAÇOS FOR ==="
  %452 = getelementptr [20 x i8], [20 x i8]* @str_41, i32 0, i32 0
  call i32 @printf(i8* %452)
  ; Imprimir string "Contagem de 1 a 5:"
  %453 = getelementptr [21 x i8], [21 x i8]* @str_42, i32 0, i32 0
  call i32 @printf(i8* %453)
  %162 = add i64 0, 1
L11:
  ; i <= 5 -> t31
  %454 = icmp sle i64 %162, 5
  %163 = zext i1 %454 to i64
  ; Se t31 é falso, pular para None
  %455 = icmp eq i64 %163, 0
  br i1 %455, label %None, label %label_456
  ; Imprimir string "Número:"
  %457 = getelementptr [10 x i8], [10 x i8]* @str_43, i32 0, i32 0
  call i32 @printf(i8* %457)
  ; Imprimir número i
  %458 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %458, i64 %162)
  ; i + 1 -> t32
  %169 = add i64 %162, 1
  %162 = add i64 0, %169
  br label %None
L12:
  ; Imprimir string "Contagem regressiva:"
  %459 = getelementptr [23 x i8], [23 x i8]* @str_44, i32 0, i32 0
  call i32 @printf(i8* %459)
  %171 = add i64 0, 10
L13:
  ; j >= 7 -> t33
  %460 = icmp sge i64 %171, 7
  %172 = zext i1 %460 to i64
  ; Se t33 é falso, pular para None
  %461 = icmp eq i64 %172, 0
  br i1 %461, label %None, label %label_462
  ; Imprimir string "Contagem:"
  %463 = getelementptr [12 x i8], [12 x i8]* @str_45, i32 0, i32 0
  call i32 @printf(i8* %463)
  ; Imprimir número j
  %464 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %464, i64 %171)
  ; j - 1 -> t34
  %178 = sub i64 %171, 1
  %171 = add i64 0, %178
  br label %None
L14:
  %179 = add i64 0, 0
  %180 = add i64 0, 3
  ; Imprimir string "Range dinâmico:"
  %465 = getelementptr [18 x i8], [18 x i8]* @str_46, i32 0, i32 0
  call i32 @printf(i8* %465)
  %182 = add i64 0, %179
L15:
  ; k <= fim -> t35
  %466 = icmp sle i64 %182, %180
  %183 = zext i1 %466 to i64
  ; Se t35 é falso, pular para None
  %467 = icmp eq i64 %183, 0
  br i1 %467, label %None, label %label_468
  ; Imprimir string "Valor de k:"
  %469 = getelementptr [14 x i8], [14 x i8]* @str_47, i32 0, i32 0
  call i32 @printf(i8* %469)
  ; Imprimir número k
  %470 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %470, i64 %182)
  ; k * k -> t36
  %189 = mul i64 %182, %182
  %190 = add i64 0, %189
  ; Imprimir string "Quadrado:"
  %471 = getelementptr [12 x i8], [12 x i8]* @str_48, i32 0, i32 0
  call i32 @printf(i8* %471)
  ; Imprimir número quadrado
  %472 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %472, i64 %190)
  ; k + 1 -> t37
  %193 = add i64 %182, 1
  %182 = add i64 0, %193
  br label %None
L16:
  ; Imprimir string "=== LAÇOS WHILE ==="
  %473 = getelementptr [22 x i8], [22 x i8]* @str_49, i32 0, i32 0
  call i32 @printf(i8* %473)
  %195 = add i64 0, 0
  ; Imprimir string "Contagem while até 3:"
  %474 = getelementptr [24 x i8], [24 x i8]* @str_50, i32 0, i32 0
  call i32 @printf(i8* %474)
L17:
  ; cont < 3 -> t38
  %475 = icmp slt i64 %195, 3
  %197 = zext i1 %475 to i64
  ; Se t38 é falso, pular para None
  %476 = icmp eq i64 %197, 0
  br i1 %476, label %None, label %label_477
  ; Imprimir string "Contador:"
  %478 = getelementptr [12 x i8], [12 x i8]* @str_51, i32 0, i32 0
  call i32 @printf(i8* %478)
  ; Imprimir número cont
  %479 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %479, i64 %195)
  ; cont + 1 -> t39
  %203 = add i64 %195, 1
  %195 = add i64 0, %203
  br label %None
L18:
  %204 = add i64 0, 10
  %205 = add i64 0, 1
  ; Imprimir string "While com condição complexa:"
  %480 = getelementptr [31 x i8], [31 x i8]* @str_52, i32 0, i32 0
  call i32 @printf(i8* %480)
L19:
  ; x > y -> t40
  %481 = icmp sgt i64 %204, %205
  %207 = zext i1 %481 to i64
  ; y < 5 -> t41
  %482 = icmp slt i64 %205, 5
  %209 = zext i1 %482 to i64
  ; t40 && t41 -> t42
  %483 = icmp ne i64 %207, 0
  %484 = icmp ne i64 %209, 0
  %485 = and i1 %483, %484
  %211 = zext i1 %485 to i64
  ; Se t42 é falso, pular para None
  %486 = icmp eq i64 %211, 0
  br i1 %486, label %None, label %label_487
  ; Imprimir string "x ="
  %488 = getelementptr [6 x i8], [6 x i8]* @str_53, i32 0, i32 0
  call i32 @printf(i8* %488)
  ; Imprimir número x
  %489 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %489, i64 %204)
  ; Imprimir string "y ="
  %490 = getelementptr [6 x i8], [6 x i8]* @str_54, i32 0, i32 0
  call i32 @printf(i8* %490)
  ; Imprimir número y
  %491 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %491, i64 %205)
  ; x - 2 -> t43
  %221 = sub i64 %204, 2
  %204 = add i64 0, %221
  ; y + 1 -> t44
  %222 = add i64 %205, 1
  %205 = add i64 0, %222
  br label %None
L20:
  ; Imprimir string "=== CASOS AVANÇADOS ==="
  %492 = getelementptr [26 x i8], [26 x i8]* @str_55, i32 0, i32 0
  call i32 @printf(i8* %492)
  %224 = add i64 0, 15
  %225 = add i64 0, 4
  %226 = add i64 0, 1
  ; operacao == 1 -> t45
  %493 = icmp eq i64 %226, 1
  %227 = zext i1 %493 to i64
  ; Se t45 é falso, pular para None
  %494 = icmp eq i64 %227, 0
  br i1 %494, label %None, label %label_495
  ; num1 + num2 -> t46
  %231 = add i64 %224, %225
  %232 = add i64 0, %231
  ; Imprimir string "Soma:"
  %496 = getelementptr [8 x i8], [8 x i8]* @str_12, i32 0, i32 0
  call i32 @printf(i8* %496)
  ; Imprimir número num1
  %497 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %497, i64 %224)
  ; Imprimir string "+"
  %498 = getelementptr [4 x i8], [4 x i8]* @str_56, i32 0, i32 0
  call i32 @printf(i8* %498)
  ; Imprimir número num2
  %499 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %499, i64 %225)
  ; Imprimir string "="
  %500 = getelementptr [4 x i8], [4 x i8]* @str_57, i32 0, i32 0
  call i32 @printf(i8* %500)
  ; Imprimir número result
  %501 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %501, i64 %232)
  br label %None
L22:
  ; operacao == 2 -> t47
  %502 = icmp eq i64 %226, 2
  %239 = zext i1 %502 to i64
  ; Se t47 é falso, pular para None
  %503 = icmp eq i64 %239, 0
  br i1 %503, label %None, label %label_504
  ; num1 - num2 -> t48
  %243 = sub i64 %224, %225
  %232 = add i64 0, %243
  ; Imprimir string "Subtração:"
  %505 = getelementptr [13 x i8], [13 x i8]* @str_13, i32 0, i32 0
  call i32 @printf(i8* %505)
  ; Imprimir número num1
  %506 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %506, i64 %224)
  ; Imprimir string "-"
  %507 = getelementptr [4 x i8], [4 x i8]* @str_58, i32 0, i32 0
  call i32 @printf(i8* %507)
  ; Imprimir número num2
  %508 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %508, i64 %225)
  ; Imprimir string "="
  %509 = getelementptr [4 x i8], [4 x i8]* @str_57, i32 0, i32 0
  call i32 @printf(i8* %509)
  ; Imprimir número result
  %510 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %510, i64 %232)
  br label %None
L23:
  ; operacao == 3 -> t49
  %511 = icmp eq i64 %226, 3
  %250 = zext i1 %511 to i64
  ; Se t49 é falso, pular para None
  %512 = icmp eq i64 %250, 0
  br i1 %512, label %None, label %label_513
  ; num1 * num2 -> t50
  %254 = mul i64 %224, %225
  %232 = add i64 0, %254
  ; Imprimir string "Multiplicação:"
  %514 = getelementptr [17 x i8], [17 x i8]* @str_14, i32 0, i32 0
  call i32 @printf(i8* %514)
  ; Imprimir número num1
  %515 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %515, i64 %224)
  ; Imprimir string "*"
  %516 = getelementptr [4 x i8], [4 x i8]* @str_59, i32 0, i32 0
  call i32 @printf(i8* %516)
  ; Imprimir número num2
  %517 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %517, i64 %225)
  ; Imprimir string "="
  %518 = getelementptr [4 x i8], [4 x i8]* @str_57, i32 0, i32 0
  call i32 @printf(i8* %518)
  ; Imprimir número result
  %519 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %519, i64 %232)
  br label %None
L24:
  ; operacao == 4 -> t51
  %520 = icmp eq i64 %226, 4
  %261 = zext i1 %520 to i64
  ; Se t51 é falso, pular para None
  %521 = icmp eq i64 %261, 0
  br i1 %521, label %None, label %label_522
  ; num2 != 0 -> t52
  %523 = icmp ne i64 %225, 0
  %265 = zext i1 %523 to i64
  ; Se t52 é falso, pular para None
  %524 = icmp eq i64 %265, 0
  br i1 %524, label %None, label %label_525
  ; num1 / num2 -> t53
  %269 = sdiv i64 %224, %225
  %232 = add i64 0, %269
  ; Imprimir string "Divisão:"
  %526 = getelementptr [11 x i8], [11 x i8]* @str_15, i32 0, i32 0
  call i32 @printf(i8* %526)
  ; Imprimir número num1
  %527 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %527, i64 %224)
  ; Imprimir string "/"
  %528 = getelementptr [4 x i8], [4 x i8]* @str_60, i32 0, i32 0
  call i32 @printf(i8* %528)
  ; Imprimir número num2
  %529 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %529, i64 %225)
  ; Imprimir string "="
  %530 = getelementptr [4 x i8], [4 x i8]* @str_57, i32 0, i32 0
  call i32 @printf(i8* %530)
  ; Imprimir número result
  %531 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %531, i64 %232)
  br label %None
L27:
  ; Imprimir string "Erro: Divisão por zero!"
  %532 = getelementptr [26 x i8], [26 x i8]* @str_61, i32 0, i32 0
  call i32 @printf(i8* %532)
L26:
  br label %None
L25:
L21:
  %277 = add i64 0, 5
  %278 = add i64 0, 1
  ; Imprimir string "Calculando fatorial de"
  %533 = getelementptr [25 x i8], [25 x i8]* @str_62, i32 0, i32 0
  call i32 @printf(i8* %533)
  ; Imprimir número n
  %534 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %534, i64 %277)
  %281 = add i64 0, 1
L28:
  ; f <= n -> t54
  %535 = icmp sle i64 %281, %277
  %282 = zext i1 %535 to i64
  ; Se t54 é falso, pular para None
  %536 = icmp eq i64 %282, 0
  br i1 %536, label %None, label %label_537
  ; fatorial * f -> t55
  %286 = mul i64 %278, %281
  %278 = add i64 0, %286
  ; Imprimir string "Passo"
  %538 = getelementptr [8 x i8], [8 x i8]* @str_63, i32 0, i32 0
  call i32 @printf(i8* %538)
  ; Imprimir número f
  %539 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %539, i64 %281)
  ; Imprimir string ":"
  %540 = getelementptr [4 x i8], [4 x i8]* @str_64, i32 0, i32 0
  call i32 @printf(i8* %540)
  ; Imprimir número fatorial
  %541 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %541, i64 %278)
  ; f + 1 -> t56
  %291 = add i64 %281, 1
  %281 = add i64 0, %291
  br label %None
L29:
  ; Imprimir string "Fatorial final:"
  %542 = getelementptr [18 x i8], [18 x i8]* @str_65, i32 0, i32 0
  call i32 @printf(i8* %542)
  ; Imprimir número fatorial
  %543 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %543, i64 %278)
  %294 = add i64 0, 0
  %295 = add i64 0, 1
  %296 = add i64 0, 0
  ; Imprimir string "Sequência de Fibonacci:"
  %544 = getelementptr [26 x i8], [26 x i8]* @str_66, i32 0, i32 0
  call i32 @printf(i8* %544)
  ; Imprimir string "F(0) ="
  %545 = getelementptr [9 x i8], [9 x i8]* @str_67, i32 0, i32 0
  call i32 @printf(i8* %545)
  ; Imprimir número fib1
  %546 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %546, i64 %294)
  ; Imprimir string "F(1) ="
  %547 = getelementptr [9 x i8], [9 x i8]* @str_68, i32 0, i32 0
  call i32 @printf(i8* %547)
  ; Imprimir número fib2
  %548 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %548, i64 %295)
L30:
  ; fib_count < 8 -> t57
  %549 = icmp slt i64 %296, 8
  %302 = zext i1 %549 to i64
  ; Se t57 é falso, pular para None
  %550 = icmp eq i64 %302, 0
  br i1 %550, label %None, label %label_551
  ; fib1 + fib2 -> t58
  %306 = add i64 %294, %295
  %307 = add i64 0, %306
  ; fib_count + 1 -> t59
  %308 = add i64 %296, 1
  %296 = add i64 0, %308
  ; Imprimir string "F("
  %552 = getelementptr [5 x i8], [5 x i8]* @str_69, i32 0, i32 0
  call i32 @printf(i8* %552)
  ; fib_count + 1 -> t60
  %310 = add i64 %296, 1
  ; Imprimir número t60
  %553 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %553, i64 %310)
  ; Imprimir string ") ="
  %554 = getelementptr [6 x i8], [6 x i8]* @str_70, i32 0, i32 0
  call i32 @printf(i8* %554)
  ; Imprimir número proximo
  %555 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %555, i64 %307)
  %294 = add i64 0, %295
  %295 = add i64 0, %307
  br label %None
L31:
  %314 = add i64 0, 8
  %315 = add i64 0, 85
  ; Imprimir string "=== VALIDAÇÃO DE APROVAÇÃO ==="
  %556 = getelementptr [33 x i8], [33 x i8]* @str_71, i32 0, i32 0
  call i32 @printf(i8* %556)
  ; Imprimir string "Nota:"
  %557 = getelementptr [8 x i8], [8 x i8]* @str_72, i32 0, i32 0
  call i32 @printf(i8* %557)
  ; Imprimir número nota
  %558 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %558, i64 %314)
  ; Imprimir string "Frequência:"
  %559 = getelementptr [14 x i8], [14 x i8]* @str_73, i32 0, i32 0
  call i32 @printf(i8* %559)
  ; Imprimir número frequencia
  %560 = getelementptr [4 x i8], [4 x i8]* @.str_int, i32 0, i32 0
  call i32 @printf(i8* %560, i64 %315)
  ; nota >= 7 -> t61
  %561 = icmp sge i64 %314, 7
  %321 = zext i1 %561 to i64
  ; frequencia >= 75 -> t62
  %562 = icmp sge i64 %315, 75
  %323 = zext i1 %562 to i64
  ; t61 && t62 -> t63
  %563 = icmp ne i64 %321, 0
  %564 = icmp ne i64 %323, 0
  %565 = and i1 %563, %564
  %325 = zext i1 %565 to i64
  ; Se t63 é falso, pular para None
  %566 = icmp eq i64 %325, 0
  br i1 %566, label %None, label %label_567
  ; Imprimir string "APROVADO! ✓"
  %568 = getelementptr [14 x i8], [14 x i8]* @str_74, i32 0, i32 0
  call i32 @printf(i8* %568)
  br label %None
L33:
  ; nota >= 5 -> t64
  %569 = icmp sge i64 %314, 5
  %332 = zext i1 %569 to i64
  ; frequencia >= 75 -> t65
  %570 = icmp sge i64 %315, 75
  %334 = zext i1 %570 to i64
  ; t64 && t65 -> t66
  %571 = icmp ne i64 %332, 0
  %572 = icmp ne i64 %334, 0
  %573 = and i1 %571, %572
  %336 = zext i1 %573 to i64
  ; Se t66 é falso, pular para None
  %574 = icmp eq i64 %336, 0
  br i1 %574, label %None, label %label_575
  ; Imprimir string "RECUPERAÇÃO"
  %576 = getelementptr [14 x i8], [14 x i8]* @str_75, i32 0, i32 0
  call i32 @printf(i8* %576)
  br label %None
L34:
  ; Imprimir string "REPROVADO ✗"
  %577 = getelementptr [14 x i8], [14 x i8]* @str_76, i32 0, i32 0
  call i32 @printf(i8* %577)
L32:
  ; Imprimir string "=========================="
  %578 = getelementptr [29 x i8], [29 x i8]* @str_77, i32 0, i32 0
  call i32 @printf(i8* %578)
  ; Imprimir string "Demonstração finalizada!"
  %579 = getelementptr [27 x i8], [27 x i8]* @str_78, i32 0, i32 0
  call i32 @printf(i8* %579)
  ; Imprimir string "Todas as funcionalidades foram testadas:"
  %580 = getelementptr [43 x i8], [43 x i8]* @str_79, i32 0, i32 0
  call i32 @printf(i8* %580)
  ; Imprimir string "✓ Tipos: int, int, String, bool"
  %581 = getelementptr [34 x i8], [34 x i8]* @str_80, i32 0, i32 0
  call i32 @printf(i8* %581)
  ; Imprimir string "✓ Operadores: +, -, *, /, ==, !=, <, >, <=, >=, &&, ||"
  %582 = getelementptr [57 x i8], [57 x i8]* @str_81, i32 0, i32 0
  call i32 @printf(i8* %582)
  ; Imprimir string "✓ Estruturas: if/elseif/else, for, while"
  %583 = getelementptr [43 x i8], [43 x i8]* @str_82, i32 0, i32 0
  call i32 @printf(i8* %583)
  ; Imprimir string "✓ E/S: print, input"
  %584 = getelementptr [22 x i8], [22 x i8]* @str_83, i32 0, i32 0
  call i32 @printf(i8* %584)
  ; Imprimir string "✓ Expressões complexas e precedência"
  %585 = getelementptr [39 x i8], [39 x i8]* @str_84, i32 0, i32 0
  call i32 @printf(i8* %585)
  ; Imprimir string "=========================="
  %586 = getelementptr [29 x i8], [29 x i8]* @str_77, i32 0, i32 0
  call i32 @printf(i8* %586)
  ret i32 0
}