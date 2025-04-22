from analisador_lexico.scanner import scanner

with open("script.lens", "r", encoding="utf-8") as file:
    codigo = file.read()

tokens = scanner(codigo)
for t in tokens:
    print(t)