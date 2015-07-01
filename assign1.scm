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
