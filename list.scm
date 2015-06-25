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
