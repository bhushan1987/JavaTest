grammar DSL;

/* Parser Rules */

script  : (
            AUTHENTICATE USER ON AUTHENTICATION
                ( AND DELEGATE CREDENTIALS
                    (AND GET TGS FOR SERVICE URL)?
                )?

        ';') +;

AUTHENTICATE: 'AUTHENTICATE';
USER        : 'USER';
ON          : 'ON';

AUTHENTICATION: NTLM | KERBEROS;

NTLM    : 'NTLM';
KERBEROS: 'KERBEROS';
AND     : 'AND';
DELEGATE: 'DELEGATE';
CREDENTIALS: 'CREDENTIALS';
GET     : 'GET';
TGS     : 'TGS';
FOR     : 'FOR';
SERVICE : 'SERVICE';

URL : PROTOCOL '://' URI;
URI     : (([a-z]|[0-9])+'.'*)+('/'*(([a-z]|[0-9])+))*;
PROTOCOL: 'http'|'https';

WS      : (' '|'\n'|'\t'|'\r')+ -> channel(HIDDEN);

/*
LOGIN WITH CLIENT <client_name> AND INVOKE SERVICE <service_path>;
LOGIN WITH CLIENT <client_name> AND IMPERSONATE USER <username> AND INVOKE SERVICE <service_path>

STATEMENT2  : 'LOGIN' 'WITH' 'CLIENT' IDENTIFIER;
IDENTIFIER  : NUMBER | TEXT;

INPUT   returns [double value]:{Dou}
NUMBER  : [0-9]+(\.[0-9]+)?;
TEXT    : ([a-z]|[0-9])+
*/