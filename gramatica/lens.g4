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
    ;

//DIFERENCIAL
//Operadores personalizados
opper
    : 'op' ANY '('VAR ':' class (','VAR':' class)*')''->'class '{'comando* 'return' exp'}'
    ;
    
expop
    : expTemplate (ANY expTemplate)+
    ;

imprime
    : 'print' DUPONT  concat  
    ;
    
concat //Concatencao
    : exp (',' exp)*
    ;
    
ler
    : 'input' '(' VAR ')'
    ;
    
funcaoW
    :'func' VAR'('(VAR':' class)? (','VAR':' class)*')' '->' class '{'comando* ('return' concat)?'}'
    ;
    
funcaoD
    : VAR '('exp')'
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

aritp
    : '(' arit ')'
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

expTemplate
    : STRING
    | INT
    | VAR
    | BOOL
    | arit
    | explogi
    | expcomp
    | funcaoD
    ;
    
exp
    : expTemplate
    | expop
    ;
    
expcond
    : explogi
    | expcomp
    | expop
    ;
    
dec
    : 'let' VAR':' class 
    | 'let' VAR':' class atr
    ;
    
class
    : 'int'
    | 'bool'
    | 'String'
    | 'float'
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
    | FLOAT
    | aritp
    ;

STRING
    : '"' (~["\\] | '\\' .)* '"'
    ;

INT
    : '-'?[0-9]+
    ;

FLOAT
    : '-'?[0-9]+ '.' [0-9]+
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
    
ANY :  [#^&!?%~`]+ ;


WS
    : [ \t\r\n]+ -> skip
    ;
