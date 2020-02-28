package lectures.part2oop

object InheritanceAndTraits extends App {

  sealed class Animal {
    val creatureType = "wild"
    private def roar = println("grrrr")
    protected def eat = println("nomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat //access protected method
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  // Constructor
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0) //baby
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  //overriding
  class Dog(override val creatureType: String) extends Animal {
//    override val creatureType = "domestic"
    // overriding making protected to public method
    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }

  /* overriding by param, not at constructor, constructor directly is les "verbose"
  class Dog(dogType: String) extends Animal {
    override val creatureType: String = dogType
  }
   */

  val dog = new Dog("domestic")
  dog.eat
  println(dog.creatureType)

  // type substitution
  val unknownAnimal = new Dog("K9")
  unknownAnimal.eat

  // overRIDING vs overLOADING polymorphism

  // super

  // preventing overrides
  // 1- use keyword final at the member (attr definition)
  // 2- use keyword final at class definition (final whole class)
  // 3- sealed the class = extends classes in THIS FILE, preventing extension in other files
}
