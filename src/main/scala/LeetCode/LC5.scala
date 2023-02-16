package LeetCode

object LC5 {
  implicit class StringOps(s: String) {
    def isPalendrome = s.take(s.length / 2).equals(s.takeRight(s.length / 2).reverse)
    def getPotentialPalendromes= s.substring(s.indexOf(s"${s.head}"), s.indexOf(s"${s.head}", s.indexOf(s"${s.head}")+1)+1)
  }

  def longestPalendrome(s: String): String = ""



  def main(args: Array[String]): Unit = {
    //Longest Palendromic substring
    println("boob".take("boob".length/2), "boob".takeRight("boob".length/2))
    println("wolow".take("wolow".length/2), "wolow".takeRight("wolow".length/2))
    //return list of potential palendrones

    println("wintergreen".indexOf("n"))
    println("wintergreen".indexOf("n", "wintergreen".indexOf("n")+1))
    println("wintergreen".substring("wintergreen".indexOf("n"), "wintergreen".indexOf("n", "wintergreen".indexOf("n")+1)+1))




    println("llob".getPalendromes)
    def rec(s: String): String = {
      def loop(sn: String, largest: List[String]): String = s.getPotentialPalendrome.isPalendrome match{
        case false =>
        case x::xs => if(sn.getPalendromes.isPalendrome) loop( xs.toString, largest.appended(sn.getPalendromes)) else loop(xs.toString(), largest)
      }
      loop(s, List("")).sorted.foreach(x => println(x))

    }
//    println("bolllob".isPalendrome)



//    val isPalendrome
    println(rec("bobobobob"))

  }

}
