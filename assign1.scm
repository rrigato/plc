(define(make-random-sequence size min-value max-value)
    if (= size 0) 
    (if (>= (random max-value) min-value) (make-random-sequence (-size 1) min-value max-value) )
