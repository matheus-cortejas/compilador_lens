from antlr4.error.ErrorListener import ErrorListener

class CustomErrorListener(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        if "token recognition error" in msg:  # Erro léxico
            simbolo = msg.split(":")[-1].strip().strip("'")
            print(f"\033[91mERRO LÉXICO [Linha {line}, Coluna {column}]: Símbolo '{simbolo}' inválido.\033[0m")
        else:  # Erro sintático
            esperado = ""
            encontrado = offendingSymbol.text

            if hasattr(e, "getExpectedTokens"):
                expected = e.getExpectedTokens().toList()
                nomes = recognizer.literalNames
                esperado = [nomes[i] for i in expected if i < len(nomes) and nomes[i] is not None]
                esperado = ", ".join(esperado)

            print(f"ERRO SINTÁTICO [Linha {line}, Coluna {column}]: Esperado {esperado}, encontrado '{encontrado}' .")
