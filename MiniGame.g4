grammar MiniGame;

program       : 'juego' CADENA NL instruccion* EOF ;

instruccion
    : crearSprite
    | eventoTecla
    | colision
    | mostrarTexto
    | detener
    ;

crearSprite    : 'sprite' ID 'en' '(' NUM ',' NUM ')' 'imagen' CADENA NL ;

eventoTecla    : 'al' 'presionar' CADENA 'hacer' accion NL ;

accion         : 'mover' ID 'por' '(' NUM ',' NUM ')' ;

colision       : 'si' 'colisionan' '(' ID ',' ID ')' 'entonces' NL instruccion* 'fin' ;

mostrarTexto   : 'mostrar' CADENA NL ;

detener        : 'detener' NL ;

ID             : [a-zA-Z_][a-zA-Z_0-9]* ;
CADENA         : '"' (~["\r\n])* '"' ;
NUM            : [0-9]+ ;

NL             : ('\r'? '\n')+ ;
ESPACIOS       : [ \t]+ -> skip ;