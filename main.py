from antlr4 import *
from lensLexer import lensLexer
from lensParser import lensParser
from ErrorHandler import CustomErrorListener
import os

def analisar_arquivo(caminho_arquivo):
    try:
        with open(caminho_arquivo, "r", encoding="utf-8") as f:
            codigo = f.read()

        input_stream = InputStream(codigo)
        lexer = lensLexer(input_stream)

        # Aplica listener personalizado ao scanner do ANTLR
        lexer.removeErrorListeners()
        lexer.addErrorListener(CustomErrorListener())

        token_stream = CommonTokenStream(lexer)
        token_stream.fill()

        print("\n🔎 Tokens reconhecidos:")
        for token in token_stream.tokens:
            if token.type != Token.EOF:
                tipo = lexer.symbolicNames[token.type]
                print(f"<{tipo}, {token.text}, Linha {token.line}, Coluna {token.column}>;")

    except Exception as e:
        print(str(e))

# Execução
if __name__ == "__main__":
    caminho = input("Digite o caminho do arquivo .lens a ser analisado: ").strip()
    analisar_arquivo(caminho)

