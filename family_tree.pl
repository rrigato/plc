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
grandparent(X,Y) :- parent(Z,Y), parent(X,Z).
ancestor(X,Y) :- parent(X,Z), ancestor(Z,Y).
cousin(X,Y) :- grandparent(Z,X) , grandparent(Z,Y) , X\=Y.
%uncle(X,Y) :-  cousin(Y,Z) , parent(X,Z), male(X).
%aunt(X,Y) :- cousin(Y,Z) , parent(X,Z) , female(X).
descendant(X,Y) :- ancestor(Y,X).
common_ancestor(X,Y,Z) :-  ancestor(Z,Y), ancestor(Z,X).
remove(X,Y) :- int_log2(X,Y),X >0.
remove(X,Y) :- X is X * -1.

removedness(X,Y,Z) :- generation_gap(X,Y,W), Z >0.
removedness(X,Y,Z) :- generation_gap(X,Y,W), Z is Z * -1.
%0 if your an ancestor
%then W is Xs parents, calls counter again,
%will increment until someone is there own ancestor
%generation_gap has the cut which prevents it from redoing what it did.
%the counter gets a value for X and Y from nca and subtracts them.
counter(Y,Y,0).
counter(X,Y,Z) :- parent(W,X),counter(W,Y,U), Z is U + 1.
generation_gap(X,Y,Z):- common_ancestor(X,Y,W), !, counter(X,W,B), counter(Y,W,G), Z is G - B.



same_gen(X,Y) :- grandparent(Z,X), grandparent(Z,Y).
%generation_gap(X,Y,Z) :- same_gen(X,Y), Z is 0.
%generation_gap(X,Y,Z) :-  common_ancestor(X,Y,W),
% generation_gap(X,Y,Z) :- common_ancestor(X,Y,W), counter(X,W,U),
% counter(Y,W,I), Z is U - I.
one_generation_above(W,X,Y,Q) :- parent(W,X).
one_generation_above(W,X,Y,Q) :- parent(W,Y).
cousin_degree(X,Y,-1) :- common_ancestor(X,Y,X).
%cousin_degree(X,Y,Z) :- common_ancestor(X,Y,W),common_ancestor
%counter(X,Y,Z):-sibling(X,Y), Z is 0, !.
%counter(X,Y,Z):- parent
%generation_gap(X,Y,Z) :- common_ancestor(X,Y,W), counter(X,W,C),
%int_log2 confirmed
int_log2(1,0).
int_log2(X,Y) :- X1 is X div 2, int_log2(X1,W), Y is W + 1.







