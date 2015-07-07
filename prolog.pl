sibling(X,Y) :-  parent(Z,X), parent(Z,Y), X\=Y.


mother(isabel, tristan).
mother(isabel, max).
mother(isabel, frej).
father(mike, sophie).
father(mike, aiden).
female(isabel).
male(mike).


parent(X,Y) :- mother(X,Y). %equilvalent of the or by doing two rules.
parent(X,Y) :- father(X,Y).
