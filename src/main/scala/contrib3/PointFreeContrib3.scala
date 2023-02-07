package contrib3


import scala.annotation.tailrec


object PointFreeContrib3 {
  /*
  To convert from contrib3 to Point-free, remove any functions which require input

  example => Get rid of input and inline it into integerAmount. Simply use substitution.

   */
  def createDescription(args: Array[String]): Description[Unit] =
    Description.create(
    display(
      hyphens(
        display(
          createMessage(
            round(
              ensureAmountIsPositive(
                ConvertStringToInt(
                  prompt(
                    display(
                      question(
                        display(
                          hyphens(args)
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
  )

  private def hyphens(input: Any): String = "\u2500" * 50

  private def question(input: Any): String = "How much money would you like to deposit?"
  //the side-effect causing behavior(e.g console writing)
  private def display(anyInput: Any): Unit = println(anyInput)
  //the side-effect causing behavior(e.g console reading)
  private def prompt(input: Any): String = scala.io.StdIn.readLine()
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
