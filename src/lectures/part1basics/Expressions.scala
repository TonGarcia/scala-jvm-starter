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



}
