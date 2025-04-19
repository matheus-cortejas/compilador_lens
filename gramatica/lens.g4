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
    | atrobj //atribuicao de objetos
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
    : rolav (',' rolav)*
    ;
    
ler
    : 'input' '(' VAR ')'
    ;
    
funcaoW
    :'func' VAR'('(VAR':' class)? (','VAR':' class)*')' '->' class '{'comando* ('return' concat)?'}'
    ;
    
funcaoD
    : VAR '('exp?')'
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
    : letvar class 
    | letvar class atr
    ;
    
class
    : 'int'
    | 'bool'
    | 'String'
    | 'float'
    | VAR //Nome de um objeto
    ;
    
atray
    : '=' '['(valor|STRING) (','(valor|STRING))*']'
    ;

arraysdec
    : letvar '['class']''['INT']' 
    | letvar '['class']''['INT']' atray
    ;

letvar: 'let' VAR':';

arraysolto
    :VAR'['(INT|VAR)']'
    ;

setarray
    :VAR'['INT']' '=' rolav
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
    |obj
    ;
    
valor
    : VAR
    | BOOL
    | INT
    | FLOAT
    | aritp
    | arraysolto
    ;
    
//POO
objeto
    : 'obj' VAR '{' (decobj|comando)* '}'
    ;

decobj
    : VAR':'class
    ;

atrobj
    : obj ('=' rolav)?
    ;
    
obj
    :VAR'.'(funcaoD|VAR)+
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

COMENTARIO: '//' ~[\r\n]* -> skip;


WS
    : [ \t\r\n]+ -> skip
    ;
