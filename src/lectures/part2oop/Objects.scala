package lectures.part2oop

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY (there is no "static")
  object Person { //type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method (building persons)
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  class Person(val name: String) {
    // instance-level functionality
    // Scala is more OO than Java
  }
  // COMPANIONS (same scope same name)

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala class = Class in any language
  // Scala object = SINGLETON INSTANCE
  val p1 = Person
  val p2 = Person
  println(s"p1 == p2? ${p1 == p2}")

  val peter = new Person("Peter")
  val lydia = new Person("Lydia")
  println(s"peter == lydia? ${peter == lydia}")

  val bobbie = Person(lydia,peter) //apply method call

  /*
    if instead extends App, we can run main function definition as:
    def main(args: Array[String]): Unit
   */

}
