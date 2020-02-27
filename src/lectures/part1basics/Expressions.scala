package lectures.part1basics

object Expressions extends App {

  val x = 1+2 //EXPRESSION
  println(x)

  println(2+3*4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 //also works with -= *= /= ...... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 // IF EXPRESSION (works only for expression)
  println(aConditionValue)
  println(if(aCondition) 5 else 3)
  println(1+3)

  var i = 0
  // Loops are Expressions that returns void (Units)
  var aWhile = while (i<10) {
    println(i)
    i+=1
  } // NEVER WRITE THIS AGAIN (AVOID LOOP)

  // Everything in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue) // () = Unit

  // side effects: println(), whiles, reassigning, return Units

  // Code blocks, are expressions and it VALUE is the last line expression VALUE, in the example aCodeBlocks = "Goodbye"
  val aCodeBlocks = {
    val y = 2
    val z = y+1
    if(z>2) "Hello" else "Goodbye"
  }
//  val anotherV = z +1 ---> Z won't be visible because z was defined inside the

  /*
    * 1. Diff between "Hello World"(is a String value) and println("Hello World")(is an Expression with SideEffect, it is an Unit)
    * 2.
   */

  val someVal = {
    2 < 3
  } //someVal will be boolean
  println(someVal)

  val someOtherVal = {
    if(someVal) 239 else 986
    42
  } //someOtherVal is int
  println(someOtherVal)

}
