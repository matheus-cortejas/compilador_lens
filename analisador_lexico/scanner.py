import re

TOKEN_REGEX_RAW = [
    # Palavras-chave e comandos
    ("START", r"@start"),
    ("END", r"@end"),
    ("PRINT", r"print"),
    ("INPUT", r"input"),
    ("LET", r"let"),
    ("IF", r"if"),
    ("ELSEIF", r"elseif"),
    ("ELSE", r"else"),
    ("RETURN", r"return"),
    ("FUNC", r"func"),
    ("FOR", r"for"),
    ("IN", r"in"),
    ("WHILE", r"while"),
    ("OBJ", r"obj"),
    ("OP", r"op"),

    # Tipos
    ("TYPE", r"int|bool|String|float"),

    # Booleanos
    ("BOOL", r"True|False"),

    # Operadores personalizados
    ("ANY", r"[#^&!?%~`]+"),

    # Identificadores
    ("VAR", r"[a-zA-Z_][a-zA-Z_0-9]*"),

    # Números
    ("FLOAT", r"-?[0-9]+\.[0-9]+"),
    ("INT", r"-?[0-9]+"),

    # Strings
    ("STRING", r'"[^"]*"'),

    # Operadores aritméticos
    ("PLUS", r"\+"),
    ("MINUS", r"-"),
    ("TIMES", r"\*"),
    ("DIVIDE", r"/"),

    # Operadores lógicos
    ("AND", r"&&"),
    ("OR", r"\|\|"),

    # Operadores relacionais
    ("EQ", r"=="),
    ("NEQ", r"!="),
    ("LTE", r"<="),
    ("GTE", r">="),
    ("LT", r"<"),
    ("GT", r">"),

    # Outros símbolos
    ("DUPONT", r"::"),
    ("ASSIGN", r"="),
    ("COLON", r":"),
    ("ARROW", r"->"),
    ("COMMA", r","),
    ("DOT", r"\."),
    ("LBRACKET", r"\["),
    ("RBRACKET", r"\]"),
    ("LPAREN", r"\("),
    ("RPAREN", r"\)"),
    ("LBRACE", r"\{"),
    ("RBRACE", r"\}"),
    ("RANGE", r"\.\."),  # para 'INT .. INT'

    # Espaços e comentários
    ("WS", r"[ \t\r\n]+"),
    ("COMMENT", r"//[^\r\n]*"),
]

class Token:
    def __init__(self, tipo, valor, linha, coluna):
        self.tipo = tipo
        self.valor = valor
        self.linha = linha
        self.coluna = coluna

    def __repr__(self):
        return f"Token({self.tipo}, {self.valor!r}, linha={self.linha}, coluna={self.coluna})"


def scanner(codigo):
    tokens = []
    i = 0
    linha = 1
    coluna_inicio_linha = 0

    TOKEN_REGEX = [(tipo, re.compile(padrao)) for tipo, padrao in TOKEN_REGEX_RAW]

    while i < len(codigo):
        for tipo, regex in TOKEN_REGEX:
            match = regex.match(codigo, i)
            if match:
                lexema = match.group()
                if tipo not in ("WS", "COMMENT"):
                    coluna = i - coluna_inicio_linha
                    tokens.append(Token(tipo, lexema, linha, coluna))
                
                # Atualiza linha e início de linha se achar \n
                linhas_novas = lexema.count("\n")
                if linhas_novas > 0:
                    linha += linhas_novas
                    ultima_queebra = lexema.rfind("\n")
                    coluna_inicio_linha = i + ultima_queebra + 1

                i = match.end()
                break
        else:
            raise Exception(f"Caractere inválido na linha {linha}, coluna {i - coluna_inicio_linha}: '{codigo[i]}'")

    return tokens

