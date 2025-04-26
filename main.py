from antlr4 import *
from generated.lensLexer import lensLexer
from generated.lensParser import lensParser
from ErrorHandler import CustomErrorListener
from ASTDotVisitor import ASTDotVisitor
import subprocess

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

        error_listener_lexer = CustomErrorListener()
        lexer.removeErrorListeners()
        lexer.addErrorListener(error_listener_lexer)

        token_stream = CommonTokenStream(lexer)
        token_stream.fill()

        if error_listener_lexer.tem_erro:
            print("❌ Erros léxicos encontrados. Encerrando análise.")
            return  # Para imediatamente

        parser = lensParser(token_stream)

        error_listener_parser = CustomErrorListener()
        parser.removeErrorListeners()
        parser.addErrorListener(error_listener_parser)

        arvore = parser.lens()  # Primeiro faz o parsing

        if error_listener_parser.tem_erro:
            print("❌ Erros sintáticos encontrados. Encerrando análise.")
            return  # Se deu erro, para antes de imprimir tokens

        # Só agora que a análise sintática passou é que mostramos os tokens
        print("\n🔎 Tokens formatados:")
        for token in token_stream.tokens:
            if token.type != Token.EOF:
                nome = lexer.symbolicNames[token.type] if token.type < len(lexer.symbolicNames) and lexer.symbolicNames[token.type] else f"TOKEN_{token.type}"
                print(f"<{nome}, {token.text}, Linha {token.line}, Coluna {token.column}>;")

        # Continua o processamento normal
        visitor = ASTDotVisitor()
        visitor.visit(arvore)

        with open("ast.dot", "w", encoding="utf-8") as f:
            f.write(visitor.get_dot())

        dot_path = r"C:\Program Files\Graphviz\bin\dot.exe"

        try:
            subprocess.run([dot_path, "-Tpng", "ast.dot", "-o", "ast.png"], check=True)
            print("🖼️ AST gerada com sucesso em 'ast.png'.")
        except FileNotFoundError:
            print("❌ Erro: 'dot.exe' não encontrado. Verifique se o Graphviz está instalado e no caminho correto.")
        except subprocess.CalledProcessError:
            print("❌ Erro ao executar o comando 'dot'. Verifique a sintaxe do arquivo 'ast.dot'.")

    except Exception as e:
        print(f"❌ Erro durante a análise: {e}")




if __name__ == "__main__":

    #caminho = str(input("Digite o nome do arquivo Lens: "))
    caminho = "script"
    analisar_arquivo(f'{caminho}.lens')
