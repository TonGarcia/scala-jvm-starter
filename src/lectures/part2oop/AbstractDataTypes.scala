package lectures.part2oop

object AbstractDataTypes extends App {

  // abstract
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

//  val animal = new Animal -> error if class not implemented, because Animal is abstract

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat: Unit = println("crunch crunch")
  }

  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal = "fresh meat"
  }

  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "Croc"
    def eat: Unit = "nomnom"
    def eat(animal: Animal): Unit = println(s"I'm a ${this.creatureType} and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // traits vs abstracts classes: abstract can have abstract and non-abstract members
  // 1- traits do not have constructor parameter
  // 2- multiple traits may be inherited by same class
  // 3- traits = behavior, abstract class (like Java interface with steroids)

}
