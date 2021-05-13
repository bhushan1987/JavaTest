grammar DSL3;

/* Parser Rules - start with lowercase character */
script  : code_line+;

code_line: define_var | call_fun;

define_var: VAR ID EQ
            (
                    (NUMBER | STRING) SEMI_COLON
                    | call_fun
            );

call_fun : CALL FUNCTION
                OPEN_BRACKET
                    (STRING | ID) (COMMA (STRING | ID))*
                CLOSE_BRACKET
           SEMI_COLON;

/** Lexer rules - Start with Uppercase character */

// symbols
SEMI_COLON: ';';
COMMA   : ',';
EQ      : '=';
OPEN_BRACKET: '(';
CLOSE_BRACKET: ')';
QUOTE   : '"';

// literals
VAR     : 'var';
CALL    : 'call';
FUNCTION: 'function';

// atomic
NUMBER  : [0-9]+;

ID      : ([a-z]|[A-Z]|[0-9])+;
STRING  : QUOTE ID QUOTE;
WS      : [ \t\r\n]+ -> channel(HIDDEN);