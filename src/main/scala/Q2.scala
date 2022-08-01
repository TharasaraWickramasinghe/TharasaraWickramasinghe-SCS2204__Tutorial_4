import scala.io.StdIn.readInt
object Q2 {

  def INputNum(num: Int): Unit = num match {
    case n if n == 0 => println("Zero.")
    case n if n < 0 => println(n+" is a Negative number.")
    case n if n % 2 == 0 => println(n+" is an Even number.")
    case n => println(n+" is an Odd number.")
  }
  def main(args: Array[String]): Unit ={
    print("Enter a number: ")
    val num = readInt()
    INputNum(num)
  }
}
