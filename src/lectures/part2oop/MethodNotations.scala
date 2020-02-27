package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, val favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_! : String = s"$name, what the heck?!"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Tom", "Inception")
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom) // it concat String is a definition for + operation, like it is in Ruby
  println(mary.+(tom))

  println(1+2)
  println(1.+(2)) // it show that + is a method so object.method+(param) = num.+(numParam)

  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?

  // prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !, 1.unary_- is same as -1, mary.unary_+ is the same to say +mary

  println(!mary)
  print(mary.unary_!) // it is default function like overload toString in Java

  // postfix notation
  println(mary.isAlive)
  println(mary.isAlive)

  // apply
  println(mary.apply())
  println(mary()) // equivalent, so object() will call the implemented apply method

  /*
    Exercises
    1. Overload the + operator
       mary + "the rockstar" => new person "Mary (the rockstar)"

    2. Add an age to the Person class
       add a unary + operator => new person with the age + 1
       +mary => mary with the age incrementer

    3. Add a "learns" method in the Person class => "Mary learns Scala"
       add a learnScala method, calls learns method with "Scala".
       use it in postfix notation

    4. Overload the apply method
       mary.apply(2) => "Mary watched Inception 2 times"
   */

  println((mary + "the Rockstar")()) //same as (mary + "the Rockstar").apply()
  println(+mary.age) // 0
  println((+mary).age) // 1

}
