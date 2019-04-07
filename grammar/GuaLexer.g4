lexer grammar GuaLexer;

//SEPARATOR
LPAREN                  :       '('        ;
RPAREN                  :       ')'        ;
DOT                     :       '.'        ;
ARROW                   :       '=>'       ;
SINGLEQUOTE             :       '\''       ;
VEC_PAREN               :       '#('       ;
MAP_PAREN               :       '#hash('   ;


//KEYWORD
QUOTE                   :       'quote'                ;
DEFINE                  :       'define'               ;
LAMBDA                  :       'lambda'               ;
SET                     :       'set!'                 ;
BEGIN                   :       'begin'                ;
LET                     :       'let'                  ;
LETSTAR                 :       'let*'                 ;
LETREC                  :       'letrec'               ;
COND                    :       'cond'                 ;
IF                      :       'if'                   ;
CASE                    :       'case'                 ;
ELSE                    :       'else'                 ;
AND                     :       'and'                  ;
OR                      :       'or'                   ;
DO                      :       'do'                   ;
DELAY                   :       'delay'                ;

//TYPE
Boolean
    : '#t'
    | '#f'
    ;

Character
    : '#\\' CHARACTER_NAME
    | '#\\' CHARACTER_ANY
    | '#\\' UNICODE
    ;

fragment CHARACTER_ANY
    : .
    ;

fragment CHARACTER_NAME
    : 'nul'
    | 'null'
    | 'backspace'
    | 'tab'
    | 'newline'
    | 'linefeed'
    | 'vtab'
    | 'page'
    | 'return'
    | 'space'
    | 'rubout'
    ;

String
    : '"' ( ~[\"\r\n] | ESC  )* '"'
    ;

fragment ESC
    : '\\' [btnfr"'\\]
    | '\\' UNICODE
    ;

fragment UNICODE
    : 'u' HEX HEX HEX HEX
    ;

fragment HEX
    : [0-9a-fA-F]
    ;

Number
    : '#d'? [+-]? DIGITS ('.' DIGIT+)? EXP?
    ;

fragment DIGITS
    : '0' 
    | [1-9] [0-9]*
    ;

fragment EXP
    : [Ee] [+-]? DIGIT+
    ;

//IDENTIFIER
Identifier
    : INIT TAIL*
    | '+' | '-' | '...'
    ;

fragment INIT
    : LETTER
    | SPECIAL
    ;

fragment TAIL
    : INIT
    | DIGIT
    | '+' | '-' | '.' | '@'
    ;

fragment SPECIAL
    : '!' | '$' | '%' | '&' | '*' | '/' | ':' | '<' | '=' | '>' | '?' | '^' | '_' | '~'
    ;

fragment DIGIT
    : [0-9]
    ;

fragment LETTER
    : [a-zA-Z]
    ;

Whitespace 
    : [ \t\n\r]+   -> skip
    ;

Comment    
    : ';' ~[\r\n]* -> skip
    ;
