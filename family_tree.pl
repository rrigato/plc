male(randy).
male(rudy).
male(wilson).
male(john).
male(jay).
male(ryan).
male(johnny).
male(max).
female(ashley).
female(dina).
female(heather).
female(alice).
female(leah).
female(annette).
female(jodene).
female(patricia).
female(krystal).
mother(annette, ryan).
mother(jodene, randy).
mother(patricia, annette).
mother(jodene, dina).
mother(jodene, chumlee).
mother(dina, krystal).
mother(dina, johnny).
mother(patrica, jay).
mother(alice, max).
mother(alice, leah).
mother(alice, heather).
father(jay, max).
father(jay, leah).
father(jay, heather).
father(wilson, jay).
father(john, johnny).
father(john, krystal).
father(rudy, dina).
father(rudy, chumlee).
father(wilson, annette).
father(randy, ryan).
father(rudy, randy).
%my great great grandparents
father(lorenzo, rudy).
father(lorenzo,giuseppe).
father(david,wilson).
mother(mary,wilson).
mother(francesca, rudy).
mother(francesca,giuseppe).
sibling(X,Y) :- parent(Z,X) , parent(Z,Y) , X\=Y.
parent(X,Y) :- mother(X,Y).
parent(X,Y) :- father(X,Y).
ancestor(X,X).
ancestor(X,Y) :- parent(X,Z), ancestor(Z,Y).
cousin(X,Y) :- grandparent(Z,X) , grandparent(Z,Y) , X\=Y.
%uncle(X,Y) :-  cousin(Y,Z) , parent(X,Z), male(X).
%aunt(X,Y) :- cousin(Y,Z) , parent(X,Z) , female(X).
descendant(X,Y) :- ancestor(Y,X).
common_ancestor(X,Y,Z) :-  ancestor(Z,Y), ancestor(Z,X).
one_generation_above(W,X,Y,Q) :- parent(W,X).
one_generation_above(W,X,Y,Q) :- parent(W,Y).
cousin_degree(X,Y,-1) :- common_ancestor(X,Y,X).
cousin_degree(X,Y,Z) :- common_ancestor(X,Y,W),
%counter(X,Y,Z):-sibling(X,Y), Z is 0, !.
%counter(X,Y,Z):- parent
%generation_gap(X,Y,Z) :- common_ancestor(X,Y,W), counter(X,W,C),




%int_log2 confirmed.
int_log2(1,0).
int_log2(X,Y) :- X1 is X div 2, int_log2(X1,W), Y is W + 1.


