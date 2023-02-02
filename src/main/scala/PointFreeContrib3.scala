
import scala.annotation.tailrec
import monadtypepackages._


object PointFreeContrib3 {
  /*
      -A Function which takes a Unit and returns the result is called a `Thunk`
      1) Create a type alias which takes an A and returns a function which returns A
      2) The `description` of our run program A is simply a Thunk of A
      */

  //  private type Thunk[A] = () => A
  //  type Description[A] = Thunk[A]

  /* Instead of Unit, we can return a Description of Unit, thus transforming it from a side-effect to a pure effect*/
  def createDescription(args: Array[String]): Description[Unit] = Description.create {
    display(hyphens)
    display(question)

    val input: String = prompt()
    val integerAmount: Int = ConvertStringToInt(input)
    val positiveAmount:Int = ensureAmountIsPositive(integerAmount)
    val balance: Int = round(positiveAmount)
    val message: String = createMessage(balance)

    display(message)
    display(hyphens)
  }

  private val hyphens: String = "\u2500" * 50
  private val question:String = "How much money would you like to deposit?"
  //the side-effect causing behavior(e.g console writing)
  private def display(anyInput: Any): Unit = println(anyInput)
  //the side-effect causing behavior(e.g console reading)
  private def prompt(): String = scala.io.StdIn.readLine
  private def ConvertStringToInt(amt: String): Int = amt.toInt
  private def ensureAmountIsPositive(i: Int): Int = if(i<0) 1 else i
  @tailrec
  private def round(amt:Int): Int = if(isDivisibleBy100(amt)) amt else round(amt+1)
  private def isDivisibleBy100(n: Int): Boolean = n % 100 == 0
  private def createMessage(balance: Int): String = s"Congratulations, you now have USD ${balance} available in your account!"





  //  object s{
  //    val l1 = List(1,2,3,4,5)
  //    val l2 = List(6,7,8,9,10)
  //    def z = l1.flatMap(list1 =>l2.map(list2 => list1+list2))
  //  }
  //
  def main(args: Array[String]): Unit = {

  }

}
