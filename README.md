# 📘 Documentação da Linguagem Lens (Versão Expandida - Baseada na Gramática)

A linguagem **Lens** é uma linguagem de programação fictícia, estaticamente tipada e com foco em clareza e simplicidade. Esta versão da documentação foi atualizada de acordo com a gramática formal mais recente, incluindo suporte a arrays e operadores personalizados.

---

## 🧱 Estrutura Geral do Programa

Todo programa deve iniciar com `@start` e finalizar com `@end`:

```lens
@start
    print:: "Hello, World!"
@end
```

---

## 📥 Entrada e 📤 Saída

### Impressão
```lens
print:: "Olá, ", nome, 2024
```

### Leitura de Entrada
```lens
input(nome)
```

---

## 🔢 Declaração e Atribuição de Variáveis

```lens
let idade: int
let nome: String = "Lucas"
idade = 25
idade += 1
```

---

## 🧮 Tipos de Dados

- `int`: Números inteiros
- `float`: Números decimais
- `String`: Texto entre aspas
- `bool`: `True` ou `False`

---

## 🔁 Estruturas de Repetição

### For
```lens
let i: int
for i in 0..5 {
    print:: i
}
```

### While
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
if idade > 17 {
    print:: "Maior de idade"
} elseif idade == 17 {
    print:: "Quase lá"
} else {
    print:: "Menor de idade"
}
```

Operadores válidos: `==`, `!=`, `<`, `>`, `<=`, `>=`, `&&`, `||`

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

---

## 📦 Arrays

### Declaração
```lens
let notas: [int][3]
let nomes: [String][2] = ["Ana", "João"]
```

### Atribuição de Elementos
```lens
notas[0] = 10
nomes[1] = "Carlos"
```

### Acesso
```lens
print:: nomes[1]
```

---

## 🔧 Expressões e Aritmética

```lens
let resultado: int = (10 + 5) * 2
```
Suporte aos operadores: `+`, `-`, `*`, `/`

---

## 🧪 Exemplo Completo

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

## 📚 Observações

- Toda variável deve ser declarada com `let` e tipo explícito.
- A variável de controle do `for` deve ser previamente declarada.
- A linguagem não é executável, sendo voltada ao estudo de construção de linguagens.

---

> Esta versão da documentação foi atualizada para refletir as últimas definições da gramática Lens, incluindo operadores, arrays e sintaxe geral.

