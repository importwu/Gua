# Gua (Lisp Dialect)

 + 在学习编译原理后开发的第一门编程语言。实现方式很幼稚，几乎就是个实验性玩具。  
      语法结构继承于Scheme(一种Lisp方言)，参考语言标准[R5RS](https://schemers.org/Documents/Standards/R5RS/HTML/)，求值模型一般分为call by value(传值调用),   
      call by reference(传引用调用)，call by name(传名调用)，我选了最为普通的call by value。Gua由宿主语言  
      Java实现，这样就不用再另外实现GC(垃圾收集器)了，因为是对于学习编译原理的一个总结，所以尽量保持  
      核心简洁。  
      Gua是一门依赖于JVM平台的动态强类型脚本语言，运行方式通过解释AST，以下我选择Closure(闭包)来讲解  
      运行时的一些机制。下图是一个典型的运行时所需的环境(栈数据结构)，简称Env。每一行格子代表栈帧(存储  
      变量和函数)。
```
         --------------                    --------------                     --------------
         -   +  foo   -  <-- global        -   +   foo  -    global           -   +   foo  -  <-- global
         --------------                    --------------                     --------------
     (1) -            -                (2) -   a   bar  -  <-- foo        (3) -            -
         --------------                    --------------                     --------------
         -            -                    -            -                     -            -
         --------------                    --------------                     --------------


                                           --------------                     --------------
                                           -   +   foo  -  <-- global         -   +   foo  -   global
                                           --------------                     --------------
                                       (5) -            -                 (4) -   a    bar -   foo
                                           --------------                     --------------
                                           -            -                     -      b     -  <-- bar
                                           --------------                     --------------
    ```
    在讲解Closure机制前，先简单熟悉以下两条基本的规则(和正式文法有差距，但对于了解Closure机制足够了)。  
    ```
    definition : (define (varname formals*) definition* expression+)   //函数定义
               | (define varname expression)                           //变量定义

    procedureCall : (expression expression*)                           //函数调用
    ```
    以下列子是用来讲解Closure机制所需要的基本条件。
    ```
     (define (foo a)
        (define (bar b) 
            (+ a b)
        )
        bar
     )
     ```
     有了上面的概念我们就能正式讲解Closure机制了。  
     假设下面表达是在REPL中执行。在运行下面表达是之前，如图(1)中，当前栈帧中存在 '+' (该求和函数有标准库提供)，  
     'foo'两个函数('<--'代表当前栈帧位置)。
    
     ```
     > ((foo 2) 3)
     > 5                              
     ```
     通过以下伪指令来解释上图运行时环境的变化(注意:省略了'+'函数的调用，不影响最终结果)。
     1. push(A, B)代表在环境A中压入存储了变量或函数的栈帧B，最后当前栈帧指向B。
     2. pop(A)代表从环境中弹出当前栈帧。
     3. (A, B, C, ...)代表求值序列，以最后一个表达式为返回结果。
     4. --> 代表求值顺序。
     5. setEnv(A, B)代表用环境B来替换环境A。
     ```
     图(1): push(Env, [+, foo])  
     图(2): (foo 2)  --> push(Env, [a = 2, bar])  --> return (setEnv(bar.Env, Env), <#closure bar>)   
     图(3): pop(Env)    
     图(4): (<#closure bar> 3) --> (tmp = Env, setEnv(Env, bar.Env)) --> push(Env, [b = 3]) --> return 5  
     图(5): setEnv(Env, tmp)
     ```
    最终闭包的运行时机制已分析完毕，但是Gua语言有很多缺陷，比如没有模块划分，运行时发生的错误信息基本无法阅读等等。

    + 开发环境
        1. IDE工具 [Intellij IDEA](https://www.jetbrains.com/idea/)
        2. JDK版本 [1.8.0](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
        3. Parser Generator [Antlr4](https://www.antlr.org/)
        4. 构建工具 [Gradle](https://gradle.org/)
        5. 版本控制 [Git](https://git-scm.com/)

    + 相关链接
        1. [语言介绍](https://github.com/GuaIsPi/Gua)
        1. [命令行REPL](https://github.com/GuaIsPi/Gua/tree/master/bin)
        2. [词法和语法](https://github.com/GuaIsPi/Gua/tree/master/grammar)
        3. [解释器源码](https://github.com/GuaIsPi/Gua/tree/master/src/main/java/wuz/gua)

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
