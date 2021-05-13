grammar First;

/* Parser Rules */
statement  : operation';' +
           | operation (OPERATOR operation)* ;

operation  : '('NUMBER OPERATOR NUMBER')'
           ;

OPERATOR   : '+'|'-'|'*'|'/';

/* Lexer Rules */
NUMBER     : [0-9]+ ;
WHITESPACE : [ |\n|\t] -> skip ;