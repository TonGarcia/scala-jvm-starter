package lectures.part1basics

import java.util.concurrent.atomic.DoubleAccumulator

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n<=0) 1
    else {
      println(s"Computing Factorial of $n - I first need factorial of ${n-1}")
      val result = n*factorial(n-1)
      println(s"Computed factorial of $n")

      result
    }

  println(factorial(10))
  //StackOverflowError (memory limitation) -> java.lang.StackOverflowError
  //println(factorial(5000))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    // it inside helper does the trick (why prev doenst work and it does), the prev return it self everytime, thisone returns a new instance and than perform the main instance
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x-1, x*accumulator) // TAIL RECURSION = use recursive call as the LAST expression, because it performs before
    }

    factHelper(n, 1)
  }

  /*
    anotherFactorial(10) = factHelper(10, 1)
    = factHelper(9, 10*1)
    = factHelper(8, 9*10*1)
    = factHelper(7, 8*9*10*1)
    = ...
    = factHelper(2, 3*4*...*10*1)
    = factHelper(1, 2*3*4*...*10*1)
   */

  println(anotherFactorial(5000)) // return 0 if anotherFactorial is Int, to print it correctly it might return BigInt

  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION.

  /*
    1. Concatenate a string n times
    2. IsPrime function tail recursive
    3. Fibonacci function, tail recursive
   */

  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String =
    if(n <= 0) accumulator
    else concatenateTailrec(aString, n-1, aString + accumulator)

  println(concatenateTailrec("hello", 3, ""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t-1, n%t != 0 && isStillPrime)

    isPrimeTailrec(n/2, true)
  }

  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n: Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if(i >= n) last
      else fiboTailrec(i+1, last+nextToLast, last)

    if(n<=2) 1
    else fiboTailrec(2,1,1)
  }

  println(fibonacci(8))

}
