object Main extends App {
  val x = "A"

  x match {
    case "a" | "A" =>
      println(x)
    case _ =>
      println("nothing")
  }
}
