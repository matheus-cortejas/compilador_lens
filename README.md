# Lens — Lightweight Efficient Neutral Syntax

> Uma linguagem de programação leve, eficiente, neutra e de sintaxe simples.

---

## ✨ Sobre a Lens

**Lens** é uma linguagem de programação fictícia, criada com o objetivo de ser:

- **Lightweight** — Estrutura minimalista e rápida de entender
- **Efficient** — Operações básicas feitas de forma direta e objetiva
- **Neutral** — Sem impor estilos de programação complexos ou paradigmas específicos
- **Syntax** — Focada em uma sintaxe intuitiva e limpa

Com **tipagem estática** e sem suporte a funções ou objetos nesta versão, a Lens é perfeita para **fins didáticos**: desde o ensino de lógica de programação até a criação de parsers e analisadores sintáticos.

---

## 📦 Estrutura do Programa

Todo código Lens começa com `@start` e termina com `@end`:

```lens
@start
    print:: "Olá, mundo!"
@end
```

---

## 📥 Entrada e 📤 Saída

### Saída (print)

```lens
print:: "Nome:", nome, idade
```
- Imprime múltiplos valores separados por vírgula.

### Entrada (input)

```lens
input(nome)
```
- Lê o valor digitado e armazena em uma variável previamente declarada.

---

## 🧮 Variáveis

### Declaração

```lens
let idade: int
let nome: String = "João"
```
- Sempre exige tipo explícito (`int`, `float`, `String`, `bool`).

### Atribuição e Operações

```lens
idade = 20
idade += 5
```
- Operadores suportados: `+`, `-`, `*`, `/`

---

## 🔁 Estruturas de Repetição

### Laço `for`

```lens
let i: int
for i in 0..5 {
    print:: i
}
```
- Itera de 0 até 4.

### Laço `while`

```lens
let i: int = 0
while i < 3 {
    print:: i
    i += 1
}
```

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

- Operadores lógicos: `&&`, `||`
- Operadores de comparação: `==`, `!=`, `<`, `>`, `<=`, `>=`

---

## 📚 Exemplo Completo

```lens
@start
    let nome: String
    let idade: int

    input(nome)
    input(idade)

    if idade >= 18 {
        print:: "Bem-vindo(a)", nome
    } else {
        print:: nome, "não pode acessar."
    }
@end
```

---

## 📌 Características da Lens

- Tipagem **explícita e obrigatória** nas variáveis
- Estrutura de programa fixa com `@start` e `@end`
- **Sem** funções, procedimentos ou objetos nesta versão
- Projeto ideal para **estudo de lógica**, **criação de parsers** e **análise sintática**
- Foco total na **simplicidade** e **clareza**

---

> 🚀 Lens é mais do que uma linguagem: é uma porta de entrada para o estudo de como linguagens são construídas!
