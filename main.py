import logging
from antlr4 import *
from generated.lensLexer import lensLexer
from generated.lensParser import lensParser
from ErrorHandler import CustomErrorListener
from ASTDotVisitor import ASTDotVisitor
import subprocess

# Configuração do logging
logging.basicConfig(
    filename='analisador.log',  # Arquivo onde os logs serão salvos
    filemode='w',               # Modo de abertura do arquivo: 'w' para sobrescrever, 'a' para anexar
    encoding='utf-8',               
    level=logging.INFO,         # Gravar INFO e superiores
    format='%(asctime)s - %(levelname)s - %(message)s'
)

def analisar_arquivo(caminho_arquivo):
    try:
        logging.info(f"Iniciando análise do arquivo: {caminho_arquivo}")

        with open(caminho_arquivo, "r", encoding="utf-8") as f:
            codigo = f.read()

        logging.info("Código carregado com sucesso.")
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
            logging.warning("Erro léxico detectado. Encerrando análise.")
            print("❌ Erros léxicos encontrados. Encerrando análise.")
            return

        parser = lensParser(token_stream)

        error_listener_parser = CustomErrorListener()
        parser.removeErrorListeners()
        parser.addErrorListener(error_listener_parser)

        arvore = parser.lens()

        if error_listener_parser.tem_erro:
            logging.warning("Erro sintático detectado. Encerrando análise.")
            print("❌ Erros sintáticos encontrados. Encerrando análise.")
            return

        logging.info("Tokens analisados com sucesso. Imprimindo tokens:")
        print("\n🔎 Tokens formatados:")
        for token in token_stream.tokens:
            if token.type != Token.EOF:
                nome = lexer.symbolicNames[token.type] if token.type < len(lexer.symbolicNames) and lexer.symbolicNames[token.type] else f"TOKEN_{token.type}"
                print(f"<{nome}, {token.text}, Linha {token.line}, Coluna {token.column}>;")
                logging.debug(f"Token: <{nome}, {token.text}, Linha {token.line}, Coluna {token.column}>")

        visitor = ASTDotVisitor()
        visitor.visit(arvore)
        logging.info("AST gerada com sucesso.")

        with open("ast.dot", "w", encoding="utf-8") as f:
            f.write(visitor.get_dot())
        logging.info("Arquivo 'ast.dot' salvo com sucesso.")

        dot_path = r"C:\Program Files\Graphviz\bin\dot.exe"

        try:
            subprocess.run([dot_path, "-Tpng", "ast.dot", "-o", "ast.png"], check=True)
            logging.info("Imagem 'ast.png' gerada com sucesso.")
            print("🖼️ AST gerada com sucesso em 'ast.png'.")
        except FileNotFoundError:
            logging.error("Erro: 'dot.exe' não encontrado. Verifique se o Graphviz está instalado.")
            print("❌ Erro: 'dot.exe' não encontrado. Verifique se o Graphviz está instalado e no caminho correto.")
        except subprocess.CalledProcessError:
            logging.error("Erro ao executar o comando 'dot'. Verifique o arquivo 'ast.dot'.")
            print("❌ Erro ao executar o comando 'dot'. Verifique a sintaxe do arquivo 'ast.dot'.")

    except Exception as e:
        logging.exception(f"Erro durante a análise: {e}")
        print(f"❌ Erro durante a análise: {e}")

if __name__ == "__main__":
    # caminho = str(input("Digite o nome do arquivo Lens: "))
    caminho = "script"
    analisar_arquivo(f'{caminho}.lens')
