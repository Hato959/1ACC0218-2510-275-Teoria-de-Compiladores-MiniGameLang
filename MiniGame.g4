grammar MiniGame;

program       : 'game' STRING NEWLINE statement* EOF ;

statement
    : spriteDecl
    | eventHandler
    | collisionStmt
    | showStmt
    | stopStmt
    ;

spriteDecl    : 'sprite' ID 'at' '(' INT ',' INT ')' 'image' STRING NEWLINE ;

eventHandler  : 'on' 'key' STRING 'do' action NEWLINE ;

action        : 'move' ID 'by' '(' INT ',' INT ')' ;

collisionStmt : 'if' 'collision' '(' ID ',' ID ')' 'then' NEWLINE statement* 'end' ;

showStmt      : 'show' STRING NEWLINE ;

stopStmt      : 'stop' NEWLINE ;

ID            : [a-zA-Z_][a-zA-Z_0-9]* ;
STRING        : '"' (~["\r\n])* '"' ;
INT           : [0-9]+ ;

NEWLINE       : ('\r'? '\n')+ ;
WS            : [ \t]+ -> skip ;
