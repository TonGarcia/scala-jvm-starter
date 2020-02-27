package lectures.part1basics

object CBNvsCBV extends App {

  def callByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  // useful for lazy programming
  def callByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  //System.nanoTime() means current timestamp

  // exec the function and pass it value
  callByValue(System.nanoTime())
  // pass it function and it is executed every time it is called as "var" at the function body -> FUNCTIONAL PROGRAMMING
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infinite(), 34) -> overflow error
  printFirst(34, infinite()) // as y is never called at printFirst(), so infinite() is not evaluate (never execute)

}
