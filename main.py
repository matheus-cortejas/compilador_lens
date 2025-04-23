from antlr4 import *
from generated.lensLexer import lensLexer
from generated.lensParser import lensParser
from ErrorHandler import CustomErrorListener
import os

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

        # Exibição final formatada
        print("\n🔎 Tokens formatados:")
        for token in token_stream.tokens:
            if token.type != Token.EOF:
                nome = lexer.symbolicNames[token.type] if token.type < len(lexer.symbolicNames) and lexer.symbolicNames[token.type] else f"TOKEN_{token.type}"
                print(f"<{nome}, {token.text}, Linha {token.line}, Coluna {token.column}>;")

    except Exception as e:
        print(f"❌ Erro durante a análise: {e}")

# Execução
if __name__ == "__main__":
    caminho = "script.lens"
    analisar_arquivo(caminho)
