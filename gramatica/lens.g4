grammar lens;

lens
    : '@start' comando* '@end' EOF
    ;

comando
    : imprime
    | atrsolta
    | dec
    | ler
    | condicao
    | lacofor
    | lacowhile
    ;

imprime
    : 'print' DUPONT  exp  
    ;
    
concat//Concatencao
    : STRING ('+' (STRING|VAR))*
    ;
    
ler
    : 'input' '(' VAR ')'
    ;
    
condicao
    : ifcond elifcond* elcond?
    ;
    
ifcond
    : 'if' expcond '{' comando* '}'
    ;
    
elifcond
    :'elseif' expcond '{' comando* '}'
    ;
    
elcond
    :'else' '{' comando* '}'
    ;
    
lacofor
    : 'for' VAR 'in' INT '..' (VAR|INT) '{'comando*'}'
    ;
lacowhile
    : 'while' VAR comparacao (VAR|INT) '{' comando* '}'
    ;

arit
    : valor (oparit valor)*
    ;

oparit
    : '*'
    | '/'
    | '+'
    | '-'
    ;

opalogi
    : '&&'
    | '||'
    ;
    
comparacao
    : '!='
    | '<'
    | '>'
    | '<='
    | '>='
    | '=='
    ;

expcomp
    : valor (comparacao valor)*
    ;    
    
explogi
    : VAR (opalogi VAR)*
    ;

exp
    : STRING
    | INT
    | VAR
    | BOOL
    | arit
    | explogi
    | expcomp
    | concat
    ;
    
expcond
    : explogi
    | expcomp
    ;
    
dec
    : 'let' VAR':' class 
    | 'let' VAR':' class atr
    ;
    
class
    : 'int'
    | 'bool'
    | 'String'
    ;

atrsolta
    : VAR '=' rolav
    | VAR oparit '=' rolav
    ;
    
atr
    : '=' rolav 
    ;
    

rolav
    :exp
    |valor
    ;
    
valor
    : VAR
    | BOOL
    | INT
    ;

STRING
    : '"' (~["\\] | '\\' .)* '"'
    ;

INT
    : [0-9]+
    ;

VAR
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

DUPONT
    : '::'
    ;

BOOL
    :'True'
    | 'False'
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
