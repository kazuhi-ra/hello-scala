object Main extends App {
  val lst = List("A", "B", "C", "D", "E")

  lst match {
    case "A" :: b :: c :: _ =>
      println(b)
      println(c)
    case _ =>
      println("nothing")
  }
}
