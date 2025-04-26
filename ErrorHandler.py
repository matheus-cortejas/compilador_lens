from antlr4.error.ErrorListener import ErrorListener

class CustomErrorListener(ErrorListener):
    def __init__(self):
        super(CustomErrorListener, self).__init__()
        self.tem_erro = False

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.tem_erro = True
        if "token recognition error" in msg:  # Erro léxico
            simbolo = offendingSymbol.text if offendingSymbol else msg.split(":")[-1].strip().strip("'")
            print(f"\033[91mERRO LÉXICO [Linha {line}, Coluna {column}]: Símbolo '{simbolo}' inválido.\033[0m")
        else:  # Erro sintático
            esperado = "outro elemento válido"
            encontrado = offendingSymbol.text if offendingSymbol else "EOF"

            if hasattr(e, "getExpectedTokens"):
                expected = list(e.getExpectedTokens())
                nomes = recognizer.literalNames if hasattr(recognizer, "literalNames") else []
                esperado_tokens = []

                for i in expected:
                    if i < len(nomes) and nomes[i] is not None:
                        esperado_tokens.append(nomes[i].strip("'"))
                
                if esperado_tokens:
                    esperado = "', '".join(esperado_tokens)

            # Agora SEMPRE vai exibir o esperado
            print(f"\033[91mERRO SINTÁTICO [Linha {line}, Coluna {column}]: Esperado '{esperado}', encontrado '{encontrado}'.\033[0m")



