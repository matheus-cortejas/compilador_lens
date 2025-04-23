from antlr4 import *
from generated.lensLexer import lensLexer
from generated.lensParser import lensParser
from ErrorHandler import CustomErrorListener
from ASTDotVisitor import ASTDotVisitor
import os

#java -Xmx500M -cp antlr-4.13.1-complete.jar org.antlr.v4.Tool -Dlanguage=Python3 -visitor -o generated lens.g4

def analisar_arquivo(caminho_arquivo):
    try:
        with open(caminho_arquivo, "r", encoding="utf-8") as f:
            codigo = f.read()

        print("📥 Código carregado:\n" + "-"*40)
        print(codigo)
        print("-"*40)

        input_stream = InputStream(codigo)
        lexer = lensLexer(input_stream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(CustomErrorListener())

        token_stream = CommonTokenStream(lexer)
        token_stream.fill()

        print("\n🔎 Tokens formatados:")
        for token in token_stream.tokens:
            if token.type != Token.EOF:
                nome = lexer.symbolicNames[token.type] if token.type < len(lexer.symbolicNames) and lexer.symbolicNames[token.type] else f"TOKEN_{token.type}"
                print(f"<{nome}, {token.text}, Linha {token.line}, Coluna {token.column}>;")

        parser = lensParser(token_stream)
        parser.removeErrorListeners()
        parser.addErrorListener(CustomErrorListener())

        arvore = parser.lens()  # Altere se a regra inicial tiver outro nome

        visitor = ASTDotVisitor()
        visitor.visit(arvore)

        with open("ast.dot", "w", encoding="utf-8") as f:
            f.write(visitor.get_dot())

        print("\n🌳 AST exportada para 'ast.dot'. Use `dot -Tpng ast.dot -o ast.png` para gerar a imagem.")
        #& "C:\Program Files\Graphviz\bin\dot.exe" -Tpng ast.dot -o ast.png 
        
    except Exception as e:
        print(f"❌ Erro durante a análise: {e}")

if __name__ == "__main__":
    caminho = "script.lens"
    analisar_arquivo(caminho)
