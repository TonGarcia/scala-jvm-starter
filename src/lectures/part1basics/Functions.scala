package lectures.part1basics

object Functions extends App {

  // Expression single line
  def aFunctionSingleLine(a: String, b: Int): String = a + " " + b
  // Expression as block
  def aFunction(a: String, b: Int): String = { // if remove it :String it compiler automatically knows what to return
    a + " " + b
  }
  println(aFunctionSingleLine("Ilton", 28))
  println(aFunction("Lídia", 29))

  def sum(a: Int, b: Float): Float = {
    a+b
  }
  println(sum(1,2))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction) //without () it works because of literal value

  def aRepeatedFunction(aString: String, n: Int): String = { // if remove it :String it compiler won't knows what to return
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  // WHEN YOU NEED LOOPS USE RECURSION INSTEAD LOOPS

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  // Function inside another Function
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a+b
    aSmallerFunction(n, n-1)
  }

  /*
    1. A greeting function (name, age) => "Hi, my name is $name and I am $age year old
    2. Factorial function 1 * 2 * 3 * ... * n
    3. A fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n-1) + f(n-2)
    4. tests if number is prime
   */

  def greetingForKids(name: String, age: Int): String = "Hi, my name is " + name + " and I am " + age + " years old."
  println(greetingForKids("David", 12))

  def factorial(n: Int): Int =
    if (n<=0) 1
    else n*factorial(n-1)
  println(factorial(5))

  def fibonacci(n: Int): Int =
    if(n<=2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  // 1 1 2 3 5 8 13 21
  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if(t<=1) true
      else n%t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }

  var primeNumTest = 5
  println(s"is it $primeNumTest a Prime? " + isPrime(primeNumTest))
  primeNumTest = 2003
  println(s"is it $primeNumTest a Prime? " + isPrime(primeNumTest))
  primeNumTest = 37*17
  println(s"is it $primeNumTest a Prime? " + isPrime(primeNumTest))

}
