import scala.annotation.tailrec

object pre_monad_ified_contrib3 {
  /*This is a copy of contrib3 which describes the motivation behind monads. This is only here for the sake of later comparison.

* Monads are a mechanism that make auto-composition of special functions possible
* it also makes manual composition of certain objects affordable
*  - in normal functions, they take an A and produce a B
*  - in other words, B is the effect the functon has on the program
*  -  - In this case, B is considered a `pure` effect
*  -  - Any other things which happen are considered `side` effects - e.g querying a database, writing to console, etc
* MOTIVATION
*  - Programs which produce side-effects are useless to functional programmers
*  - Instead a `special` kind of function is added which assigns additional information to the output B
*  - Thus the the would-be `side-effect` is not interperated as a `pure` effect
* RECAP, a regular function takes some A and produces some B
* A Monad however takes some A and returns a B wrapped into some additional information
* example:
* type Regular[A,B,C]  = A => B
* type Monadic[A,B,C[_]]= A => C[B]
*
*
* Prompt: The government is changing the currency and everyone is mad.
*         To quell anger, we need to build an ATM service which accepts any currency and rounds it up to the nearest $100
*         e.g. $130 deposits as $200
* */

  def run(args: Array[String]): Unit = {
    display(hyphens)
    display(question)

    val input: String = prompt()
    val integerAmount: Int = ConvertStringToInt(input)
    val positiveAmount: Int = ensureAmountIsPositive(integerAmount)
    val balance: Int = round(positiveAmount)
    val message: String = createMessage(balance)

    display(message)
    display(hyphens)
  }

  private val hyphens: String = "\u2500" * 50
  private val question: String = "How much money would you like to deposit?"

  //the side-effect causing behavior(e.g console writing)
  private def display(anyInput: Any): Unit = println(anyInput)

  //the side-effect causing behavior(e.g console reading)
  private def prompt(): String = scala.io.StdIn.readLine

  private def ConvertStringToInt(amt: String): Int = amt.toInt

  private def ensureAmountIsPositive(i: Int): Int = if (i < 0) 1 else i

  @tailrec
  private def round(amt: Int): Int = if (isDivisibleBy100(amt)) amt else round(amt + 1)

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
