# Gua
Scheme Interpreter
## Built-in Datatypes
1. Boolean
2. Number
3. Character(Unicode)
4. String(Unicode)
5. Symbol
6. Pair and List
7. Map
8. Void and Undefine

## Example
1. 阶乘
  ```
  (define fact (lambda (n)
    (if (= n 1) 
        1
        (* n (fact (- n 1))))))
  ```
2. 斐波那契数列
  ```
    (define fib (lambda (n)
    (cond ((= n 1) 1)
          ((= n 2) 1)
          (else (+ (fib (- n 1)) 
                   (fib (- n 2)))))))
  ```
