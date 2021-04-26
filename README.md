# Scala Build on Intellij
JDK: 1.8
Scala SDK: whatever scala installed
--> right click > run

# Scala Essentials

1. Herdar o método main para printar: ``` extends App ```
1. Definição de constante: ``` val x: Int = 42 ```
1. Definição de variável: ``` var aString = "a"; val bString = "b" ```
1. Expressões: 
   1. ``` !(1 == x) ``` 
   1. ``` val aConditionValue = if(aCondition) 5 else 3 ```
   1. Code blocks, are expressions and it VALUE is the last line expression VALUE
1. Functions:
   1. Definição:
        ```scala
            // Expression single line
            def aFunctionSingleLine(a: String, b: Int): String = a + " " + b
            // Expression as block
            def aFunction(a: String, b: Int): String = { // if remove it :String it compiler automatically knows what to return
            a + " " + b
            }
        ```
   1. Chamada de função:
        ```scala
          println(aFunction("Lídia", 29))
          println(aFunctionSingleLine("Ilton", 28))
        ```
   1. Funções recursivas apresentam um ícone de um espiral no intellij
   1. É possível definir uma função dentro da outra
   1.  

# Scala SBT - Build

1. O código fica em: src > scala > packages > arquivos (Scala Class/Object)
1. Sample Code Scala Object:
   ```scala
      package Demo
      
      object Demo {
         def main(args: Array[String]) {
            println("Hello world!")
         }
      }
   ```
1. Run Build: right mousE click > run object name 
1. IF scalac: Error: scala/reflect/internal/Trees - java.lang.NoClassDefFoundError: scala/reflect/internal/Trees
   ```   
      Make sure the following jar's are included in the library  used by the IDEA compiler (fsc/ordinary):
   
      scala-compiler.jar
      scala-library.jar
      scala-reflect.jar
      
      I was missing the scala-reflect.jar (apparently needed since the big reflection refactoring in scala_2.10.0-M4)
      
      For other newbies :)
      - File > Project Structure > Libraries
      - Click the scala library that Intellij uses to compile scala, ie scala-2.10.0-M5
      - Click "+" in the bottom of the rigth window to "Attach Files or Directories" and locate "scala-reflect.jar" in your file system (mine was here: /Users/marcgrue/.sbt/boot/scala-2.10.0-M5/lib/scala-reflect.jar)
      - Click Ok. Now Build > Rebuild Project should work
   ```

# Scala Beginners - Pointers
Checkout other resources at: http://github.com/rockthejvm

1. PREFER VAL instead VAR because of the side effect in functional programming
1. "object" instead "class" private word means that is an instance of a object on runtime instead a class & extends "App" to have: "public static void main(String args[])" 
1. Use expressions instead loops, __AVOID__ loops are for imperative programming like Java & Python not for functional programming like Scala
1. WHEN YOU NEED LOOPS USE RECURSION INSTEAD LOOPS (look at Functions.scala how to do that)
1. Check how recursive really works (all first recursive step is called first before compute the next step, that is why it is better than LOOPS):
![How recursive calls work](https://github.com/TonGarcia/scala-jvm-starter/blob/master/imgs/how_recursive_works.png?raw=true)
1. IF MEMORY STACK OVERFLOW CHECK RECURSION.SCALA (TAIL RECURSIVE), use annotation @tailrec to check if the method is recursive
1. Scala class = Class in any language, but changing class to object = SINGLETON INSTANCE
1. Every Model Class might be "case":
    ```scala
       class Person(name: String, age: Int)
       case class CasePerson(name: String, age: Int)
   
       p1 = new Person("John", 34)
       p2 = new Person("John", 34)
   
       cp1 = CasePerson("John", 34)
       cp2 = CasePerson("John", 34)
   
       p1ep2 = p1 == p2 //false
       cp1ecp2 = cp1 == cp2 //true
    ```
1. Object can override class methods:
    ```
         // Object instantiation can override methods
         val jim = new Person("Jim") {
           override def sayHi: Unit = println(s"Hi, my name is Jim, how can I be of service?")
         }
    ```
1. Generics Variance:
    1. List[+A] = yes (covariant)
    1. List[A] = no (invariant) - default
    1. List[-A] = hell no! (contravariant)
    1. BOUNDED TYPES (subclass superclass)
        1. Garage[T <: Car](car: T)
        1. Garage[T >: Car](car: T)
    1. While using Generics, passing a generic like T, A, B.... might use "=>" to say it generic type, like: ``` def filter(predicate: A => Boolean): MyList[A] ```
1. 


# Installation

1. [Install JDK 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
1. [Install Intellij](https://www.jetbrains.com/idea/download/)
    1. new project
        1. select __Scala__ (left)
        1. select __IDEA__ (right)
     
