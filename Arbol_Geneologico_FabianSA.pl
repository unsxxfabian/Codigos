% This buffer is for notes you don't want to save.
% If you want to create a file, visit that file with C-x C-f,
% then enter the text in that file's own buffer.

padre_de(francisco,demetrio).
padre_de(francisco,genaro).
padre_de(francisco,eugenia).
padre_de(francisco,gregoria).
padre_de(francisco,benedicta).

padre_de(demetrio,fabian).
padre_de(demetrio,grover).
padre_de(demetrio,melania).
padre_de(demetrio,angel).
padre_de(demetrio,jhosselyn).

padre_de(genaro,alex).

hijo_de(X,Y):-padre_de(Y,X).
abuelo_de(Y,Z):-padre_de(Y,X),padre_de(X,Z).
nieto_de(Z,Y):-abuelo_de(Y,Z).

hermano_de(Y,Z):-padre_de(X,Y),padre_de(X,Z),not(Y=Z).

% X es sobrino de Z
sobrino_de(X,Z):-hijo_de(X,P),hermano_de(P,Z).

tio_de(X,Y):-sobrino_de(Y,X).


