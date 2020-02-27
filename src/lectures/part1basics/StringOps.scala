package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I'm learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // Scala-specific: String interpolators

  // S-interpolator
  val name = "David"
  val age = 12
  //the s before the string allows interpolation, without the s the str will be literally
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I am $age years old and I'm tuning ${age+1} years old"
  println(greeting)
  println(anotherGreeting)

  //F-interpolator
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  val myth2 = f"$name%s can eat $speed%2.2f burgers per minute"
  val mythInt = f"$name%s can eat ${speed.toInt}%3d burgers per minute" //d for int and 3 num of spaces
  println(myth)
  println(myth2)
  println(mythInt)

  //raw-interpolator
  println(raw"This is \n newline")
  val escaped = "This is \n newline"
  println(raw"$escaped")

}
