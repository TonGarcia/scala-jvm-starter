package lectures.part2oop

import org.w3c.dom.css.Counter

object OOBasics extends App {

  val emptyPerson = new EmptyPerson
  println(emptyPerson)

  val person = new Person("John", 26)
  //println(person.name) // not field just param, wont compile
  println(person.age) // field
  println(person.x) // declared field
  person.greet("Daniel")
  person.greet

  val author = new Writer("Charles", "Dickens", 1812)
  val impostor = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(author)
  println(novel.author)
  println(novel.authorAge)
  println(s"is it author & novel author the same? ${novel.isWrittenBy(author)}")
  println(s"is it impostor the novel author? ${novel.isWrittenBy(impostor)}")

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print

}

class EmptyPerson

// class params are NOT FIELDS, to use it as FIELD (get/set) add val/var to it param
class Person(name: String, var age: Int) { //constructor
  // class's body

  // definitions, every declaration inside class is an accessible field
  val x = 2

  // expressions
  println(1+3) // will be called once the class is instantiate

  // method
  def greet(name: String): Unit = println(s"$this.name says: Hi, $name") //this means class field, no this it the func param

  // overloading (same name, but diff signature), if no param, no need "this"
  def greet():Unit = println(s"Hi, I am $name")

  // multiple constructors, it is just another construction, cant do anything else
  def this(name: String) = this(name, 0) // 0 = age
  def this() = this("John Doe")
}

/*
  Novel and a Writer
  Writer: first name, surname, year
    - method fullname
  Novel: name, year of release, author
    - authorAge
    - isWrittenBy(author)
    - copy (new year of release) = new instance of Novel
 */


class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, val author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

/*
  Counter class
  - receives an int val
  - method current count
  - method to increment/decrement => new Counter
  - overload inc/dec to receive an amount
 */

class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1) // returning new counter instead modify itself convert it in immutability
  }
  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n:Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }
  def dec(n:Int): Counter = {
    if(n <= 0) this
    else dec.dec(n-1)
  }

  def print = println(count)
}