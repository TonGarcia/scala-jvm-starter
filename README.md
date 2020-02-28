# Scala Beginners - Pointers
Checkout other resources at: http://github.com/rockthejvm

1. PREFER VAL instead VAR because of the side effect in functional programming
1. "object" instead "class" private word means that is an instance of a object on runtime instead a class & extends "App" to have: "public static void main(String args[])" 
1. Use expressions instead loops, __AVOID__ loops are for imperative programming like Java & Python not for functional programming like Scala
1. WHEN YOU NEED LOOPS USE RECURSION INSTEAD LOOPS (look at Functions.scala how to do that)
1. Check how recursive really works (all first recursive step is called first before compute the next step, that is why it is better than LOOPS):
![How recursive calls work](https://github.com/TonGarcia/scala-jvm-starter/blob/master/imgs/how_recursive_works.png?raw=true)
1. IF MEMORY STACK OVERFLOW CHECK RECURSION.SCALA (TAIL RECURSIVE), use annotation @tailrec to check if the method is recursive


# Installation

1. [Install JDK 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
1. [Install Intellij](https://www.jetbrains.com/idea/download/)
    1. new project
        1. select __Scala__ (left)
        1. select __IDEA__ (right)
     
