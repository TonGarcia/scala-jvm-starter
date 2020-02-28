package lectures.part1basics

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


}
