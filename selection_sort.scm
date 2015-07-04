#lang racket


(define (head x)
  (car x))
(define (tail x)
  (cdr x))

(define (lmr xs)
  (if (empty? (cdr xs)) (list '() (car xs) '()) 
      (let* ((c (lmr (tail xs)))
            (l (car c))
            (m (cadr c))
            (r (caddr c)))
        (if (< (car xs) m)
            (list '() (car xs) (cdr xs))
            (list (cons (car xs) l) m r)))))



;correct selection sort
(define (selection-sort xs)
  (if (empty? xs) xs
      (let ((temp (lmr xs)))
        ( cons (cadr temp) ( append (selection-sort (car temp))(selection-sort(caddr temp)))))))
;correct selection sort


(selection-sort '( 1 2 4 3))


(selection-sort '( 8 6 4 2 84 41 2 58))


(lmr '( 5 4 3 2))
(caddr( lmr '( 5 4 3 2)))


; (define (selection-sort xs)
;   (if (empty? xs) xs
;       (let ((temp (lmr xs)))
;         ( cons (cadr temp) ( append (selection-sort (car temp))(selection-sort(caddr temp)))))))
; (selection-sort '( 1 2 4 3))



; (define (selection-sort xs)
;   (if (empty? xs) xs
;       (let ((temp (lmr xs)))
;         ( cons (cadr temp) ( append (selection-sort (car temp))(selection-sort(cddr temp)))))))
; (selection-sort '( 1 2 4 3))
; 



; (define (selection-sort xs)
;   (if (empty? xs) xs
;       (let ((temp (lmr xs)))
;         ( append (caddr xs) (selection-sort(cadr xs))))))
