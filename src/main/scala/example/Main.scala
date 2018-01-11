package example

import Lists._

/**
  * Author gkarabut
  * since 1/10/18.
  */
object Main extends App{
//  println(sum(List(2,3,5)))

  var mymap = Map("a"->11, "b"->44)
  def checkMap(key: String, map: Map[String, Int]) = {
    mymap.get(key).map("Value found " + _).getOrElse("No values found")
  }

  println("Ready-steady")

  def caseFunc(s: String, mymap: Map[String, Int]) = {
    mymap get s match {
      case Some(nb) => "Value found: " + nb
      case None => "None found"
    }
  }
  println(caseFunc("a", mymap))

  println(checkMap("c", mymap))
}

