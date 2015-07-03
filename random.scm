#lang racket
(define (make-random-sequence size min-value max-value)
  ( if (< size 1) '()
  (cons(inexact->exact  (floor (+(* (random) (+ (- max-value min-value ) 1)) min-value)))
       (make-random-sequence (- size 1) min-value max-value))))

(make-random-sequence 3 1 10)
