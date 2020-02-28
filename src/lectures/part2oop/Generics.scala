package lectures.part2oop

object Generics extends App {

  class MyList[+A] {
    // use the type A
    def add[B >: A](element: B): MyList[B] = ???
    /*
      A = Cat
      B = Dog
     */
  }

  class MyMap[Key, Value] // generic Map, not a KeyMapping obj

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  // generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfInteger = MyList.empty[Int]

  // Variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes List[Cat] extends List[A] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  //animalList.add(new Dog) ??? HARD QUESTION = we return a list of animals

  // 2. NO = INVARIANCE
  class InvarianceList[A]
  //val invariantAnimalList: InvarianceList[Animal] = new InvarianceList[Cat] => ERROR, just accept exactly received class
  val invariantAnimalList: InvarianceList[Animal] = new InvarianceList[Animal]

  // 3. Hell, no! CONTRAVARIANCE
  /*
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]
  */
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal] //if I train Cat, can train any Animal

  // bounded types (only super class or only subclass of specific)
  class Cage[A <: Animal](animal: A) //Accepts only SUB types of Animal, if invert < to > would be accepts only SUPER types of Animal
  val cage = new Cage(new Dog)

  class Car
//  val newCage = new Cage(new Car)

  // expand MyList to be generic


}
