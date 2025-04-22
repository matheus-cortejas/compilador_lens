grammar lens;

lens
    : '@start' comando* '@end'
    ;

comando
    : imprime
    | atrsolta
    | dec
    | ler
    | condicao
    | lacofor
    | lacowhile
    | funcaoW
    | funcaoD
    | opper
    | arraysdec
    | setarray
    | objeto
    | atrobj
    ;

opper
    : 'op' ANY '('VAR ':' tipo (','VAR ':' tipo)*')' '->' tipo '{' comando* 'return' exp '}'
    ;

expop
    : expTemplate (ANY expTemplate)+
    ;

imprime
    : 'print' DUPONT concat
    ;

concat
    : rolav (',' rolav)*
    ;

ler
    : 'input' '(' VAR ')'
    ;

funcaoW
    : 'func' VAR '(' parametros? ')' '->' tipo '{' comando* ('return' concat)? '}'
    ;

parametros
    : VAR ':' tipo (',' VAR ':' tipo)*
    ;

funcaoD
    : VAR '(' exp? ')'
    ;

condicao
    : ifcond elifcond* elcond?
    ;

ifcond
    : 'if' expcond '{' comando* '}'
    ;

elifcond
    : 'elseif' expcond '{' comando* '}'
    ;

elcond
    : 'else' '{' comando* '}'
    ;

lacofor
    : 'for' VAR 'in' INT '..' (VAR | INT) '{' comando* '}'
    ;

lacowhile
    : 'while' VAR comparacao (VAR | INT) '{' comando* '}'
    ;

arit
    : valor (oparit valor)*
    ;

aritp
    : '(' arit ')'
    ;

oparit
    : '*' | '/' | '+' | '-'
    ;

opalogi
    : '&&' | '||'
    ;

comparacao
    : '!=' | '<' | '>' | '<=' | '>=' | '=='
    ;

expcomp
    : valor (comparacao valor)*
    ;

explogi
    : VAR (opalogi VAR)*
    ;

expTemplate
    : STRING | INT | VAR | BOOL | arit | explogi | expcomp | funcaoD
    ;

exp
    : expTemplate | expop
    ;

expcond
    : explogi | expcomp | expop
    ;

dec
    : letvar tipo
    | letvar tipo atr
    ;

tipo
    : 'int' | 'bool' | 'String' | 'float' | TIPO
    ;

atray
    : '=' '[' (valor | STRING) (',' (valor | STRING))* ']'
    ;

arraysdec
    : letvar '[' tipo ']' '[' INT ']' 
    | letvar '[' tipo ']' '[' INT ']' atray
    ;

letvar
    : 'let' VAR ':'
    ;

arraysolto
    : VAR '[' (INT | VAR) ']'
    ;

setarray
    : VAR '[' INT ']' '=' rolav
    ;

atrsolta
    : VAR '=' rolav
    | VAR oparit '=' rolav
    ;

atr
    : '=' rolav
    ;

rolav
    : exp | valor | obj
    ;

valor
    : VAR | BOOL | INT | FLOAT | aritp | arraysolto
    ;

objeto
    : 'obj' TIPO '{' (decobj | comando)* '}'
    ;

decobj
    : VAR ':' tipo
    ;

atrobj
    : obj ('=' rolav)?
    ;

obj
    : VAR '.' membro ('.' membro)*
    ;

membro
    : funcaoD | VAR
    ;

STRING
    : '"' (~["\\] | '\\' .)* '"'
    ;

INT
    : '-'? [0-9]+
    ;

FLOAT
    : '-'? [0-9]+ '.' [0-9]+
    ;

VAR
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

TIPO
    : [A-Z][a-zA-Z_0-9]*
    ;

DUPONT
    : '::'
    ;

BOOL
    : 'True' | 'False'
    ;

ANY
    : [#^&!?%~`]+
    ;

COMENTARIO
    : '//' ~[\r\n]* -> skip
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
