#lang racket
(* 5 (+ 6 7  ))
(cons 7 '( ) )
(cons 6 (cons 7 ' ( )  ) )
(cons + (cons 6 (cons 7 ' ( )  ) ) )
;(cons '() (cons + (cons 6 (cons 7 ' ( )  ) ) )

;this is the same as (* 5 (+ 6 7  ))
(define s (cons'* (cons 5 (cons (cons '+ (cons '6 ( cons '7 '()))) ' ()))))


(define n (+ 5 6))

; defining a function
(define (squareIt x)
  (* x x))

(squareIt 3)
(squareIt 23)

(define (sum_of_squares x y)
  ( + (squareIt x) (squareIt y))
  )
(sum_of_squares 3 4)


;anonymous function
(define squareIt2
  (lambda (x)
    ( * x x)))
(squareIt2 5)


;currying a function
(define sum_of_squares2
   (lambda(x)
     (lambda(y)
       ( + (squareIt2 x) (squareIt2 y )))))

( (sum_of_squares2 3)4)


;not a list
(cons 'a 'b)

;lists
(cons 'a (cons 'b '()))


(define mylist ( cons 3 ( cons 4 '())))

; car is like head, cdr is like tail
(car mylist)
(cdr mylist)

(define mylist2 '(5 6) )
mylist2
(define mylist3 ( cons mylist mylist2))
mylist3

(cdr (cdr ( cdr mylist3)))
(car(cdr mylist3))


(define (insert-helper u left right)

  (cond

    ((or (empty? right)(>= (head right) u))  (append left (cons u right)))

    (else

     (insert-helper u ( append left (list(head right))) (tail right)  ))  ))
