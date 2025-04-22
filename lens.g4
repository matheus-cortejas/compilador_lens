grammar lens;

//---------------------------------
// 1. PROGRAM ROOT
//---------------------------------
lens
    : START bloco* END
    ;

bloco
    : stmt
    | objeto
    ;

//---------------------------------
// 2. STATEMENTS (stmts)
//---------------------------------
stmt
    : declaracao                   #stmtDeclaracao
    | atribuicao                   #stmtAtribuicao
    | imprime                      #stmtImprime
    | leitura                      #stmtLeitura
    | condicao                     #stmtCondicao
    | lacofor                      #stmtLacofor
    | lacowhile                    #stmtLacowhile
    | funcDef                      #stmtFuncDef
    | chamadaFuncao                #stmtCall
    | opperDef                     #stmtOpper
    | arrayDecl                    #stmtArrayDecl
    | setarray                     #stmtSetarray
    | retorno                      #stmtRetorno
    ;

retorno
    : RETURN expr
    ;

//---------------------------------
// 3. DECLARATIONS
//---------------------------------
declaracao
    : LET VAR COLON tipo (ASSIGN expr)?
    ;

tipo
    : INT_T
    | BOOL_T
    | STRING_T
    | FLOAT_T
    | VAR              // User‑defined class
    ;

//---------------------------------
// 4. ASSIGNMENTS
//---------------------------------
atribuicao
    : VAR ASSIGN expr                        #simpleAssign
    | VAR opArit ASSIGN expr                 #opAssign
    | setarray                                    #arrayAssign
    | atrobj                                      #objAssign
    ;

setarray
    : VAR LBRACK INT RBRACK ASSIGN expr 
    ;

//---------------------------------
// 5. ARRAY DECLARATION
//---------------------------------
arrayDecl
    : LET VAR COLON LBRACK tipo RBRACK LBRACK INT RBRACK (ASSIGN arrayLiteral)?
    ;

arrayLiteral
    : LBRACK expr (COMMA expr)* RBRACK
    ;

//---------------------------------
// 6. OBJECTS
//---------------------------------
objeto
    : OBJ VAR LBRACE (objMember)* RBRACE
    ;

objMember
    : declaracao
    | funcDef
    ;

objAccess
    : VAR (DOT membro)+
    ;

membro
    : chamadaFuncao
    | VAR
    | arrayAccess
    ;

atrobj
    : objAccess ASSIGN expr
    ;

//---------------------------------
// 7. FUNCTIONS & OPERATORS
//---------------------------------
funcDef
    : FUNC VAR LPAREN parametros? RPAREN ARROW tipo LBRACE stmt* retorno? RBRACE
    ;

opperDef
    : OP ANY LPAREN parametros? RPAREN ARROW tipo LBRACE stmt* retorno RBRACE
    ;

parametros
    : VAR COLON tipo (COMMA VAR COLON tipo)*
    ;

// Function call usable in expressions or as statement
chamadaFuncao
    : VAR LPAREN argList? RPAREN
    ;

argList
    : expr (COMMA expr)*
    ;

//---------------------------------
// 8. I/O
//---------------------------------
imprime
    : PRINT DUPONT concat
    ;

concat
    : expr (COMMA expr)*
    ;

leitura
    : INPUT LPAREN VAR RPAREN
    ;

//---------------------------------
// 9. CONTROL FLOW
//---------------------------------
condicao
    : IF exprCond blocoBraces (ELSEIF exprCond blocoBraces)* (ELSE blocoBraces)?
    ;

blocoBraces
    : LBRACE stmt* RBRACE
    ;

lacofor
    : FOR VAR IN INT RANGE INT blocoBraces
    ;

lacowhile
    : WHILE exprCond blocoBraces
    ;

//---------------------------------
// 10. EXPRESSIONS (with precedence)
//---------------------------------
expr
    : logicExpr
    ;

logicExpr
    : compExpr (opalogi compExpr)*
    ;

compExpr
    : arithExpr ((comparacao) arithExpr)?
    ;

arithExpr
    : term ((ADD | SUB) term)*
    ;

term
    : factor ((MUL | DIV) factor)*
    ;

factor
    : LPAREN expr RPAREN
    | chamadaFuncao
    | arrayAccess
    | objAccess
    | literal
    | VAR
    ;

arrayAccess
    : VAR LBRACK expr RBRACK
    ;

literal
    : STRING
    | INT
    | FLOAT
    | BOOL
    ;

exprCond
    : logicExpr
    ;

//---------------------------------
// 11. OPERATORS TOKEN RULES
//---------------------------------
opArit  : ADD | SUB | MUL | DIV ;   // used for +=, etc.
opalogic: AND | OR ;
comparacao: NEQ | EQ | LT | GT | LTE | GTE ;
opalogi   : AND | OR ;

//---------------------------------
// 12. LEXER RULES
//---------------------------------
STRING : '"' (~["\\] | '\\' .)* '"';
INT    : '-'? [0-9]+;
FLOAT  : '-'? [0-9]+ '.' [0-9]+;
BOOL   : 'true' | 'false';
VAR    : [a-z][a-zA-Z_0-9]*;

// Keywords
START : '@start';   END : '@end';
LET : 'let';        PRINT : 'print';     INPUT : 'input';
FUNC : 'func';      OP : 'op';           OBJ : 'obj';
RETURN : 'return';  IF : 'if';           ELSEIF : 'elseif';
ELSE : 'else';      FOR : 'for';         IN : 'in';
RANGE : '..';       WHILE : 'while';

// Types
INT_T : 'int';   BOOL_T : 'bool';   STRING_T : 'String';   FLOAT_T : 'float';

// Symbols & Operators
ARROW : '->'; DUPONT : '::'; AND : '&&'; OR : '||';
NEQ : '!='; EQ  : '=='; LT  : '<'; GT  : '>'; LTE : '<='; GTE : '>=';
ASSIGN : '=';  COMMA : ','; COLON : ':';
LPAREN : '(';  RPAREN : ')';
LBRACE : '{';  RBRACE : '}';
LBRACK : '[';  RBRACK : ']';
DOT    : '.';  MUL : '*'; DIV : '/'; ADD : '+'; SUB : '-';
ANY    : [#^&!?%~`]+;  // keep last in list

// Ignored
LINE_COMMENT: '//' ~[\r\n]* -> skip;
WS           : [ \t\r\n]+  -> skip;
