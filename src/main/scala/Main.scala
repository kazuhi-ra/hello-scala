object Main extends App {
  val lst = List(List("A"), List("B", "C"))

  lst match {
    case List(List("A"), List(x, y)) if x != "C" =>
      println(x)
    case _ =>
      println("nothing")
  }
}
