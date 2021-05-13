grammar DSL2;

/* Parser Rules - start with lowercase character */

dsl: (command';')+;

command : get_token | invoke_service | math | expression;

get_token : get_token_command | get_token_and_delegate;
get_token_command: GET AUTH TOKEN;
get_token_and_delegate: GET KRB TOKEN AND DELEGATE CREDENTIALS;

invoke_service: invoke_service_command | invoke_service_impersonate_command;
invoke_service_command: (INVOKE SERVICE URL WITH CLIENT VARIABLE);
invoke_service_impersonate_command: (INVOKE SERVICE URL WITH CLIENT VARIABLE AND IMPERONATE USER VARIABLE);

math: assignment | comparison;
assignment: VAR VARIABLE EQ NUMBER;
comparison: (NUMBER|VARIABLE) COMPARE_OP (NUMBER|VARIABLE);

expression: baseExpr (OPERATOR baseExpr)* EOF; // this EOF is necessary due to bug- https://github.com/antlr/antlr4/issues/118
baseExpr : NUMBER OPERATOR NUMBER;

/** Lexer rules - Start with Uppercase character */
OPERATOR: '+'|'-'|'*'|'/';
VAR : 'var';
EQ  : '=';
AND : 'and';
INVOKE: 'invoke';
SERVICE: 'service';
GET: 'get';
TOKEN: 'token';
DELEGATE:'delegate';
CREDENTIALS: 'credentials';
WITH : 'with';
CLIENT: 'client';
IMPERONATE:'impersonate';
USER: 'user';

KRB  : 'kerberos';
AUTH : 'ntlm' | 'adfs';

NUMBER  : [0-9]+;

VARIABLE: ID+;

COMPARE_OP: '>'|'<'|'>='|'<='|'==';

URL : PROTOCOL '://' URI;
URI     : (VARIABLE'.'*)+('/'*(VARIABLE))*;

PROTOCOL: 'http'|'https';

ID      : ([a-z]|[0-9]);
WS      : [ \t\r\n]+ -> channel(HIDDEN);
