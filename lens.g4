grammar lens;
// Palavras-chave (ordem importa!)
START       : '@start';
END         : '@end';
LET         : 'let';
PRINT       : 'print';
INPUT       : 'input';
IF          : 'if';
ELSEIF      : 'elseif';
ELSE        : 'else';
FOR         : 'for';
WHILE       : 'while';
IN          : 'in';

// Tipos primitivos
INT_TYPE    : 'int';
FLOAT_TYPE  : 'float';
STRING_TYPE : 'String';
BOOL_TYPE   : 'bool';

// Símbolos
DUPONT      : '::';
POINT2      : ':';
DOT2        : '..';
VIRG        : ',';
EQUALS      : '=';
P_N         : '(';
P_I         : ')';
C_N         : '{';
C_I         : '}';
ADD         : '+';
SUB         : '-';
MUL         : '*';
DIV         : '/';
EQ          : '==';
NEQ         : '!=';
LT          : '<';
GT          : '>';
LTE         : '<=';
GTE         : '>=';
AND         : '&&';
OR          : '||';

// Literais e identificadores (sempre por último!)
BOOL        : 'True' | 'False';
STRING      : '"' (~["\\] | '\\' .)* '"';
FLOAT       : '-'?[0-9]+ '.' [0-9]+;
INT         : '-'?[0-9]+;
VAR         : [a-zA-Z_][a-zA-Z_0-9]*;

// Ignorados
COMENTARIO  : '//' ~[\r\n]* -> skip;
WS          : [ \t\r\n]+ -> skip;



lens
    : START comando* END 
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
    : PRINT DUPONT  concat  
    ;
    
concat //Concatencao
    : rolav (VIRG rolav)*
    ;
    
ler
    : INPUT P_N VAR P_I //P_Paranteses nomral/invertido
    ;
    
condicao
    : ifcond elifcond* elcond?
    ;
    
ifcond
    : IF expcond C_N comando* C_I //C_Chaves nomral/invertido
    ;
    
elifcond
    : ELSEIF expcond C_N comando* C_I
    ;
    
elcond
    : ELSE C_N comando* C_I
    ;
    
lacofor
    : FOR VAR IN INT DOT2 (VAR|INT) C_N comando* C_I
    ;

lacowhile
    : WHILE VAR comparacao (VAR|INT) C_N comando* C_I
    ;

arit
    : valor (oparit valor)*
    ;

aritp
    : P_N arit P_I
    ;

oparit
    : MUL
    | DIV
    | ADD
    | SUB
    ;


opalogi
    : AND
    | OR
    ;
    
comparacao
    : NEQ
    | LT
    | GT
    | LTE 
    | GTE
    | EQ
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
    ;
    
exp
    : expTemplate
    ;
    
expcond
    : explogi
    | expcomp
    ;
    
dec
    : letvar class 
    | letvar class atr
    ;
    
class
    : INT_TYPE
    | BOOL_TYPE
    | STRING_TYPE
    | FLOAT_TYPE
    | VAR //Nome de um objeto
    ;

letvar: LET VAR POINT2 ;

atrsolta
    : VAR EQUALS rolav
    | VAR oparit EQUALS rolav
    ;
    
atr
    : EQUALS rolav 
    ;
    
rolav
    : exp
    | valor
    ;

valor
    : VAR
    | BOOL
    | INT
    | FLOAT
    | aritp
    ;

