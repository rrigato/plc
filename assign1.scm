(define(make-random-sequence size min-value max-value)
    if (= size 0) 
    (if (>= (random max-value) min-value) (make-random-sequence (-size 1) min-value max-value) )
    
    
    
    (define (lmr xs)
  (if (empty? (cdr xs)) (list '() (car xs) '()) 
      (let* ((c (lmr (tail xs)))
            (l (car c))
            (m (cadr c))
            (r (caddr c)))
        (if (< (car xs) m)
            (list '() (car xs) (cdr xs))
            (list (cons (car xs) l) m r))))) 

(define (selection-sort xs)
  (if (empty? xs) xs
      (let ((temp (lmr xs)))
        (append (car(cdr(temp))) selection-sort(cdr(xs))))))
(selection-sort '(a b c))



;(define(make-random-sequence size min-value max-value)
 ; (let temp([ inexact->exact  (floor (* (random)  (+ max-value 1)))])
  ;     (if (< size 1) '()
   ; (list temp (make-random-sequence (- size 1) min-value max-value)))))
    


;(make-random-sequence 3 0 10)


(define (make-random-sequence2 size min-value max-value)
  (let([temp (inexact->exact  (floor (* (random)  (+ max-value 1))))])
    (cond((< size 1) temp)
         
     (else (cons temp (make-random-sequence2 (- size 1) min-value max-value)  )))))
(make-random-sequence2 5 5 10)


( define (power f n )
   
   (if (= n 0) (f)
       (lambda (x)
    ( (power f (- n 1)) (f x) ))))




(define (g x)  ((power list 3) x))

(g 'a)
