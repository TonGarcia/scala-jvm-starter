package lectures.part1basics

object ValuesVariablesTypes extends App {

  // Mentioning the type force it type to be static
  val x: Int = 42
  println(x)
  // VALS ARE IMMUTABLE (like const)
  //x = 2

  // Types are optional, compiler can infer types
  val y = 31
  println(y)

  // Types are not dynamic, if it is a
  // ; is used only for multiple commands at the same line, but the recommend is to avoid to use it
  var aString = "a"; val bString = "b"
  //  aString = 1
  println(aString)

  val aChar: Char = 'a'
  val aShort: Short = 4613
  // the L at the end of the number means Long, if missing it will throws an error
  val aLong: Long = 4325182391723123123L
  // the f at the end of the number means float, if missing it the compiler will interpreter as Double
  val aFloat: Float = 4.23f
  val aDouble: Double = 4.23

  // variables
  var bool: Boolean = false
  bool = true // side effect (functional programming) can be danger, so PREFER VAL instead VAR
  println(bool)

}
