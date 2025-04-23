from antlr4.error.ErrorListener import ErrorListener

class CustomErrorListener(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        if "token recognition error" in msg:  # Erro léxico
            simbolo = offendingSymbol.text if offendingSymbol else msg.split(":")[-1].strip().strip("'")
            print(f"\033[91mERRO LÉXICO [Linha {line}, Coluna {column}]: Símbolo '{simbolo}' inválido.\033[0m")
        else:  # Erro sintático
            esperado = ""
            encontrado = offendingSymbol.text if offendingSymbol else "EOF"

            if hasattr(e, "getExpectedTokens"):
                expected = list(e.getExpectedTokens())
                nomes = recognizer.literalNames
                esperado_tokens = [nomes[i].strip("'") for i in expected if i < len(nomes) and nomes[i] is not None]
                esperado = "', '".join(esperado_tokens) if esperado_tokens else "outro elemento válido"


            if esperado:
                print(f"\033[91mERRO SINTÁTICO [Linha {line}, Coluna {column}]: Esperado '{esperado}', encontrado '{encontrado}'.\033[0m")
            else:
                print(f"\033[91mERRO SINTÁTICO [Linha {line}, Coluna {column}]: Erro inesperado ao encontrar '{encontrado}'.\033[0m")


