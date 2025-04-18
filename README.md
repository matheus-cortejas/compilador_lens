# 📘 Documentação da Linguagem Lens

Este repositório apresenta a documentação da **Lens**, uma linguagem de programação fictícia com tipagem estática e abordagem minimalista. A Lens foi concebida com o objetivo de promover clareza sintática, segurança na tipagem e expressividade no desenvolvimento, sendo especialmente útil em estudos acadêmicos sobre design e construção de linguagens.

Aqui você encontrará especificações formais da sintaxe, exemplos práticos de código e orientações de uso para os principais recursos da linguagem.

---

## 📁 Conteúdo da Documentação

### Introdução
```lens
@start
    print:: "Hello, World!"
@end
```
Bloco básico para início de execução. `@start` e `@end` delimitam o corpo principal do programa.

---

### Declaração de Variáveis
```lens
let nome: String = "Augusto"
let idade: int = 19
let ativo: bool = true
```
Todas as variáveis devem ser declaradas utilizando `let`, seguidas do nome, tipo e valor inicial.

---

### Tipos de Dados Suportados
- `String`: sequência de caracteres (ex: "Olá")
- `int`: número inteiro (ex: 42)
- `float`: número decimal (ex: 3.14)
- `bool`: valor lógico, `true` ou `false`

---

### Estruturas Condicionais
```lens
let idade: int = 20

if idade >= 18 {
    print:: "Maior de idade"
} else {
    print:: "Menor de idade"
}
```
Permite controlar o fluxo do programa com base em expressões lógicas.

---

### Estruturas de Repetição

#### Laço For
```lens
let i: int
for i in 0..5 {
    print:: "Valor: " + i
}
```

#### Laço While
```lens
let contador: int = 0

while contador < 3 {
    print:: "Contando..."
    contador += 1
}
```
Os laços `for` e `while` permitem repetir blocos de código. No caso do `for`, a variável de controle precisa ser declarada previamente.

---

### Funções
```lens
func saudacao(nome: String) -> String {
    return "Olá, " + nome + "!"
}

print:: saudacao("Augusto")
```
Funções são definidas com `func`, incluindo o tipo de retorno explicitamente. Parâmetros também devem ter tipos declarados.

---

### Operadores Personalizados
```lens
op %% (a: int, b: int) -> int {
    return (a * b) + (a - b)
}

print:: 4 %% 2
```
A linguagem permite definir novos operadores infix com a palavra-chave `op`.

---

### Arrays
```lens
let frutas: [String] = ["maçã", "banana", "uva"]
print:: frutas[1]  // imprime "banana"

let i: int
for i in 0..frutas.length {
    print:: frutas[i]
}
```
Arrays armazenam coleções de dados do mesmo tipo e utilizam indexação iniciada em zero. O atributo `.length` retorna o tamanho do array.

---

### Módulos

#### Definição
```lens
// Arquivo: saudacoes.lens
export func ola(nome: String) -> String {
    return "Olá, " + nome
}
```

#### Importação
```lens
import saudacoes

print:: saudacoes.ola("Lens")
```
Funções podem ser modularizadas e exportadas de outros arquivos com `export`. O uso de `import` permite o acesso a módulos externos.

---

### Leitura de Entrada
```lens
print:: "Digite seu nome: "
let nome: String
input(nome)

print:: "Digite sua idade: "
let idade: int
input(idade)
```
A função `input()` realiza leitura de dados fornecidos pelo usuário. O valor é armazenado diretamente na variável informada.

---

### Operadores Lógicos
```lens
let idade: int = 22
let possui_doc: bool = true

if idade >= 18 && possui_doc {
    print:: "Pode entrar."
}

if idade < 18 || !possui_doc {
    print:: "Acesso negado."
}
```
- `&&`: conjunção lógica (E)
- `||`: disjunção lógica (OU)
- `!`: negação lógica (NÃO)

Esses operadores são utilizados em expressões condicionais com valores booleanos.

---

## 🚀 Como Utilizar

1. Leia atentamente os exemplos e descrições desta documentação
2. Utilize os trechos de código como base para projetos educacionais
3. Implemente um parser ou interpretador experimental para praticar os conceitos

---

## 🧠 Considerações Técnicas

- Toda variável deve ser declarada com `let` e tipo explícito
- A variável de controle do `for` precisa ser declarada antes do laço
- A linguagem **não é executável**, servindo como modelo conceitual para fins acadêmicos

---

## 💬 Contribuições

Você pode colaborar com:
- Novos exemplos de código e estruturas
- Propostas de extensões, como orientação a objetos
- Recursos adicionais como tratamento de erros e programação assíncrona

---

> Este material foi desenvolvido com propósitos educacionais, incentivando a prática e a reflexão sobre o design e a implementação de linguagens de programação.

