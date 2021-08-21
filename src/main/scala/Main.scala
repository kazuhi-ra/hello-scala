import java.util.Locale

object Main extends App {
  def fizzbuzz(i: Int) = (i % 3 == 0, i % 5 == 0) match {
    case (true, true)   => "fizzbuzz"
    case (true, false)  => "fizz"
    case (false, true)  => "buzz"
    case (false, false) => i
  }

  println((1 to 30).map(i => fizzbuzz(i)))
}
