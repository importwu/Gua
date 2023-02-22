# Gua (Scheme Dialect)



## 1. Built-in Datatypes
1. Boolean
2. Number
3. Character(Unicode)
4. String(Unicode)
5. Symbol
6. Pair and List
7. Vector
8. Map
9. Void and Undefine

## 2. Expression and Definition
1. Variable
```
(define a 10)
a  -->  10

(define plus (lambda (a b) (+ a b)))
(plus 1 2)  --> 3
```
2. Literal
```
#t   -->   #t
#\a  -->   #\a
'(+ 1 2) -->   (+ 1 2)
'#hash((1 . 2) (3 . 4))  --> #hash((1 . 2) (3 . 4))
```
3. Conditon
```
(if #t 1 2)   -->  1

(cond (> 1 2)
      (< 10 1)
      (else 3))  -->  3
(and (= 2 2) (< 0 1))  --> #t

(or (< 10 5) (> 3 2))  --> #t
```
4. Local Bind
```
(let ((1 2) (b 2)) (+ a b))  -->  3
```
5. Assignment
```
(define a 2)
(set! a 10)
(+ a 1)   -->  11
```
6. Sequence
```
(begin (+ 1 2) (* 3 4))  --> 12
```
7. Iteration
```
(do ((a 0 (+ a 1))) 
((= i 5))
(print "Hello"))   -->  HelloHelloHelloHelloHello
```
8. Delay
```
(define a (delay 10))
(force a)   -->   10
```
9. Lambda
```
((lambda (a b) (+ a b)) 1 2)   -->  3
```
10. Procedure Call
```
(+ 1 2)   -->  3
(> 2 1)   -->  #t
```
11. Definition
```
(define a  10)   //define variable
(define (add10 x) (+ x 10))  //define procedure
```

## 3. Getting Started
1. Download Gua REPL
```
  git clone git@github.com:GuaIsPi/Gua.git
```
2. Use Gua (Linux)
```
  > cd Gua/bin
  > java -jar gua.jar
  Welcome to Gua v0.0.1.
  > (+ 1 2)
  > 3
```
## 4. Example
1. 阶乘
  ```
  (define fact (lambda (n)
    (if (= n 1) 
        1
        (* n (fact (- n 1))))))
  ```
  output:
  ```
  > (fact 5)
  > 120
  ```
2. 斐波那契数列
  ```
    (define fib (lambda (n)
    (cond ((= n 1) 1)
          ((= n 2) 1)
          (else (+ (fib (- n 1)) 
                   (fib (- n 2)))))))
  ```
  output:
  ```
  > (fib 10)
  > 55
  ```
