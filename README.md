# Gua (Lisp Dialect)
Scheme Interpreter (支持部分[R5RS](https://docs.racket-lang.org/r5rs/r5rs-std/r5rs.html))
推荐书籍[The Little Schemer](http://uternet.github.io/TLS/)
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
2. Literal
3. Conditon
4. Local Bind
5. Assignment
6. Sequence
7. Iteration
8. Delay
9. Lambda
10. Procedure Call
11. Definition

## 3. Getting Started
1. Installing Gua
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
