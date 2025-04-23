# 📘 Documentação da Linguagem Lens (Versão Simples - Baseada na Nova Gramática)

**Lens** é uma linguagem de programação fictícia, com tipagem estática e sintaxe simplificada, ideal para fins didáticos e acadêmicos. Esta versão da documentação foi gerada a partir da gramática atualizada, incluindo apenas as funcionalidades básicas da linguagem.

---

## 🧱 Estrutura do Programa

Um programa Lens inicia com `@start` e finaliza com `@end`:

```lens
@start
    print:: "Olá, mundo!"
@end
```

---

## 📥 Entrada e 📤 Saída

### Impressão
```lens
print:: "Nome:", nome, idade
```
Concatena múltiplos valores com vírgulas.

### Leitura
```lens
input(nome)
```
Lê um valor digitado pelo usuário e armazena em uma variável previamente declarada.

---

## 🔢 Declaração e Atribuição de Variáveis

### Declaração
```lens
let idade: int
let nome: String = "João"
```
É obrigatório declarar o tipo da variável (`int`, `float`, `String`, `bool`).

### Atribuição
```lens
idade = 20
idade += 5
```
Variáveis podem receber valores diretos ou expressões aritméticas.

---

## 🧮 Tipos Suportados

- `int` → Números inteiros
- `float` → Números decimais
- `String` → Texto entre aspas
- `bool` → `True` ou `False`

---

## 🔁 Estruturas de Repetição

### Laço For
```lens
let i: int
for i in 0..5 {
    print:: i
}
```
Percorre valores de 0 até 4.

### Laço While
```lens
let i: int = 0
while i < 3 {
    print:: i
    i += 1
}
```
Executa enquanto a condição for verdadeira.

---

## 🔀 Estruturas Condicionais

```lens
if idade >= 18 {
    print:: "Maior de idade"
} elseif idade == 17 {
    print:: "Quase lá"
} else {
    print:: "Menor de idade"
}
```

### Operadores Lógicos e de Comparação
- `==`, `!=`, `<`, `>`, `<=`, `>=`
- `&&`, `||`

---

## 🧮 Expressões Aritméticas

```lens
let resultado: int = (10 + 2) * 3
```
Operadores suportados: `+`, `-`, `*`, `/`

---

## 📚 Exemplo Completo

```lens
@start
    let nome: String
    let idade: int

    input(nome)
    input(idade)

    if idade >= 18 {
        print:: "Bem-vindo(a),", nome
    } else {
        print:: nome, "não pode acessar."
    }
@end
```

---

## 📌 Considerações

- Toda variável deve ser declarada com `let` e tipo explícito
- O programa sempre deve começar com `@start` e terminar com `@end`
- Não há suporte a objetos ou funções nesta versão da linguagem
- A linguagem é ideal para testes de lógica e experimentação com parsers

---

> Documentação baseada na gramática simplificada da linguagem Lens para fins didáticos.

