# Lens — Lightweight Efficient Neutral Syntax

> Uma linguagem de programação leve, eficiente, neutra e de sintaxe simples.

---

## ✨ Sobre a Lens

**Lens** é uma linguagem de programação fictícia, criada com o objetivo de ser:

* **Lightweight** — Estrutura minimalista e rápida de entender
* **Efficient** — Operações básicas feitas de forma direta e objetiva
* **Neutral** — Sem impor estilos de programação complexos ou paradigmas específicos
* **Syntax** — Focada em uma sintaxe intuitiva e limpa

A Lens possui **tipagem estática obrigatória**, e não possui funções ou objetos nesta versão. É ideal para fins **didáticos**, como ensino de lógica, criação de compiladores e exploradores de gramáticas com ANTLR.

---

## ⚙️ Analisador Semântico

Este repositório implementa um **Analisador Semântico** completo para programas Lens, com base no parser gerado pelo ANTLR4.

Ele realiza as seguintes validações:

| Verificação semântica                          | Suporte |
| ---------------------------------------------- | ------- |
| Uso de variáveis sem declaração                | ✔️      |
| Uso de variáveis antes de atribuição           | ✔️      |
| Declaração duplicada de variáveis              | ✔️      |
| Tipos incompatíveis em atribuições             | ✔️      |
| Operações aritméticas entre tipos inválidos    | ✔️      |
| Operações lógicas com não-booleanos            | ✔️      |
| Divisão por zero                               | ✔️      |
| Coerção implícita entre `int` e `float`        | ✔️      |
| Escopo correto em `if`, `else`, `for`, `while` | ✔️      |

---

## 📦 Estrutura de Arquivos

```
project/
├── main.py                  # Executa o analisador
├── SemanticAnalyzer.py      # Lógica do analisador semântico
├── ErrorHandler.py          # Tratamento de erros léxicos/sintáticos
├── lens.g4                  # Gramática ANTLR da linguagem Lens
├── generated/               # Arquivos gerados pelo ANTLR
│   ├── lensLexer.py
│   ├── lensParser.py
│   ├── lensVisitor.py
├── script.lens              # Código de teste
├── analisador.log           # Log da análise semântica
└── ast.png                  # Visualização da AST (opcional)
```

---

## 📅 Entrada e 📄 Saída na Lens

### 📄 print

```lens
print:: "Nome:", nome, idade
```

### 📅 input

```lens
input(nome)
```

---

## 🧬 Variáveis na Lens

### Declaração

```lens
let idade: int
let nome: String = "João"
```

### Atribuição e Operações

```lens
idade = 20
idade = idade + 5
```

---

## 🔁 Laços

### `for`

```lens
for i in 0..5 {
    print:: i
}
```

### `while`

```lens
while i < 10 {
    print:: i
}
```

---

## 🔀 Condicionais

```lens
if ativo && idade >= 18 {
    print:: "Maior de idade"
} elseif idade == 17 {
    print:: "Quase lá"
} else {
    print:: "Menor de idade"
}
```

---

## ✅ Exemplo de Análise semântica com erro

```lens
@start
    let nome: String
    print:: nome, idade
@end
```

Saída esperada:

```bash
[Erro Semântico] Linha 3: Variável 'idade' usada sem declaração.
```

---

## 🛠️ Como usar

1. Gere os arquivos do ANTLR:

```bash
antlr4 -Dlanguage=Python3 -visitor lens.g4 -o generated
```

2. Execute o analisador:

```bash
python main.py
```

3. Veja o log gerado:

* Terminal colorido com `colorama`
* Log salvo em `analisador.log`
* AST gerada com Graphviz (opcional)

---

## 📌 Requisitos

* Python 3.10+
* `colorama` (para mensagens coloridas)

```bash
pip install colorama
```

* ANTLR 4.13+
* (Opcional) Graphviz para visualização da AST

---

## 💡 Contribuições e Licença

Este projeto tem fins educacionais. Sinta-se livre para explorar, adaptar e estender para estudos de compiladores.

---

> 🚀 Lens é mais do que uma linguagem: é uma porta de entrada para o estudo de como linguagens são construídas!
