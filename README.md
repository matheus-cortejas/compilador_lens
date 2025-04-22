# 📘 Documentação da Linguagem Lens (Com Suporte a Objetos)

**Lens** é uma linguagem de programação fictícia, estaticamente tipada e projetada com foco em clareza, simplicidade e flexibilidade. Agora com suporte a orientação a objetos, a linguagem permite a definição de estruturas semelhantes a classes, encapsulando dados e comportamentos.

Esta documentação reflete a versão mais atual da gramática Lens, incluindo recursos como arrays, funções, operadores personalizados e objetos.

---

## 🧱 Estrutura Geral do Programa

Todo programa Lens deve estar contido entre `@start` e `@end`:

```lens
@start
    print:: "Hello, World!"
@end
```

---

## 📥 Entrada e 📤 Saída

### Impressão:

```lens
print:: "Nome:", nome, idade
```

### Leitura de Entrada:

```lens
input(variavel)
```

---

## 🔢 Declaração e Atribuição

```lens
let idade: int
let nome: String = "Lucas"
idade = 18
idade += 2
```

---

## 🎲 Tipos de Dados

- `int`: números inteiros
- `float`: números decimais
- `String`: cadeias de caracteres
- `bool`: valores lógicos `True` ou `False`

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
if idade >= 18 {
    print:: "Maior de idade"
} elseif idade == 17 {
    print:: "Quase lá"
} else {
    print:: "Menor de idade"
}
```

### Operadores Lógicos e de Comparação

- Comparação: `==`, `!=`, `<`, `>`, `<=`, `>=`
- Lógicos: `&&`, `||`

---

## 🧮 Expressões Aritméticas

```lens
let resultado: int = (10 + 2) * 3
```

Operadores: `+`, `-`, `*`, `/`

---

## 🧰 Funções

### Definindo Função

```lens
func saudacao(nome: String) -> String {
    return "Olá, ", nome
}
```

### Chamando Função

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

### Acesso e Atribuição

```lens
notas[0] = 10
print:: nomes[1]
```

---

## 🧱 Orientação a Objetos

### Definição de Objeto

```lens
obj Pessoa {
    nome: String
    idade: int
}
```

### Atribuição e Acesso

```lens
let p: Pessoa
p.nome = "Carlos"
p.idade = 22
print:: p.nome, p.idade
Pessoa = obj
Pessoa.nome = "Carlos"
Pessoa.idade = 22
print:: Pessoa.nome, Pessoa.idade
```

### Métodos em Objetos

A linguagem Lens oferece suporte a funções declaradas dentro de objetos. Essas funções são acessadas a partir de instâncias criadas com `let`. Abaixo está um exemplo de objeto com método:

```lens
@start
obj Pessoa {
    nome: String
    idade: int

    func apresentar() -> String {
        return "Olá, sou ", nome
    }
}

let p1: Pessoa
p1.nome = "Lucas"
print:: p1.apresentar()
@end
```

---

## 🔧 Exemplo Completo

```lens
@start
    obj Pessoa {
    nome: String
    idade: int

    func apresentar() -> String {
        return "Olá, sou ", nome
    }
}

let p: Pessoa
p.nome = "Luna"
p.idade = 21

    if Pessoa.idade >= 18 {
        print:: p.apresentar(), " e é maior de idade."
    }
@end
```

---

## 📚 Considerações Finais

- Toda variável ou objeto deve ser declarado com `let` ou `obj`
- A variável de controle no `for` deve ser declarada previamente
- A linguagem Lens é didática e não possui interpretador oficial

---

> Documentação atualizada com base na gramática mais recente da linguagem Lens, incluindo suporte a objetos e sintaxe modular.

