package lectures.part2oop

// import playground.Cinderella
import playground._ //obs.: use _ only if really need, it import every class from the file
import playground.{PrinceCharming, Cinderella => Princess}

import java.util.Date
import java.sql.{Date => SqlDate}

object PackagingAndImports extends App {

  // same package members are accessible by their simple name
  val writer = new Writer("Daniel", "RockTheJVM", 2018)

  // import the package
  val princess = new Princess  // playground.Cinderella = fully qualified name

  // packages are in hierarchy
  // matching folder structure.

  // package object (right click package folder at hierarchy) and click new > package object (its only one per package)
  sayHello
  println(SPEED_OF_LIGHT)

  // imports
  val prince = new PrinceCharming

  // 1. use FQ names
  val date = new Date
  val sqlDate = new SqlDate(2018, 5, 4)
  // 2. use aliasing

  // default imports
  // java.lang - String, Object, Exception
  // scala - Int, Nothing, Function
  // scala.Predef - println, ??? (expression)

}
