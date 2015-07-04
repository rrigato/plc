#lang racket

; completed power definition
( define (power f n )
   (lambda (x)
   (if (<= n 1) (f x) 
    ( (power f (- n 1)) (f x) ))))




(define (g x)  ((power list 5) x))

(g 'a)



; 
; 
; (list (list 'a))
; 
;   (define (getn xs n)   
; 
;   (car ((power cdr n) xs)))
; 
;    ((power list 0) 'a)


       ; (define (power2 f)
;   (lambda (x)
;   (f ( f x) )))
; ((power2 list) 'a)
; (list(list 'a))
