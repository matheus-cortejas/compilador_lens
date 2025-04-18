# 📘 Documentação da Linguagem Lens (Baseada na Gramática)

Este documento apresenta a especificação da linguagem fictícia **Lens**, construída com base na gramática formal fornecida. A Lens é uma linguagem minimalista, estaticamente tipada, com suporte a funções, operadores personalizados, controle de fluxo e entrada/saída padrão.

---

## 🧱 Estrutura Básica de um Programa
Todo programa Lens inicia com `@start` e termina com `@end`.

```lens
@start
    print:: "Hello, World!"
@end
```

---

## 📥 Entrada e 📤 Saída

### Impressão:
```lens
print:: "Texto", variavel, 10
```
Permite concatenar múltiplas expressões com vírgulas.

### Leitura de Entrada:
```lens
input(nome)
```
Lê um valor do usuário e armazena em `nome`.

---

## 🧾 Declaração de Variáveis

```lens
let idade: int
let nome: String = "João"
let ativo: bool = True
```
- É obrigatória a declaração de tipo: `int`, `float`, `String`, `bool`
- Atribuições podem ser feitas diretamente na declaração ou em comandos separados:
```lens
idade = 20
idade += 5
```

---

## 🔄 Estruturas de Repetição

### For:
```lens
let i: int
for i in 1..5 {
    print:: i
}
```

### While:
```lens
let contador: int = 0
while contador < 3 {
    print:: contador
    contador += 1
}
```

---

## 🧠 Condicionais

```lens
if idade >= 18 {
    print:: "Maior de idade"
} elseif idade == 17 {
    print:: "Quase lá"
} else {
    print:: "Menor de idade"
}
```

Expressões lógicas e comparativas são permitidas:
- `&&`, `||`, `!`
- `==`, `!=`, `>`, `<`, `>=`, `<=`

---

## 🧮 Expressões Aritméticas

```lens
let resultado: int = (10 + 2) * 3
```
Operadores suportados: `+`, `-`, `*`, `/`

---

## 🧰 Funções

### Definição:
```lens
func saudacao(nome: String) -> String {
    return "Olá, ", nome
}
```

### Chamada:
```lens
saudacao("Ana")
```

---

## 🧩 Operadores Personalizados

```lens
op %% (a: int, b: int) -> int {
    return (a * b) + (a - b)
}

print:: 4 %% 2
```
- O símbolo do operador deve ser um ou mais caracteres especiais não reservados.

---

## 📚 Tipos de Dados

- `int`: números inteiros
- `float`: números com ponto flutuante
- `String`: sequência de caracteres
- `bool`: `True` ou `False`

---

## 🚀 Boas Práticas

- Declare sempre o tipo da variável com `let`.
- Use blocos `{}` para estruturas condicionais e de repetição.
- Mantenha nomes de variáveis e funções descritivos.
- Funções devem ter tipo de retorno explícito.

---

## 🔧 Exemplos Combinados
```lens
@start
    let nome: String
    let idade: int
    input(nome)
    input(idade)

    if idade >= 18 {
        print:: "Bem-vindo(a), ", nome
    } else {
        print:: nome, " ainda não tem idade suficiente."
    }
@end
```

---

> Esta documentação foi gerada com base na gramática formal da linguagem Lens, com o objetivo de auxiliar estudantes e entusiastas no estudo de construção de linguagens formais.

