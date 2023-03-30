import scala.collection.mutable

val hm: mutable.HashMap[String, Int] = new mutable.HashMap[String, Int]
hm.update("123", 10)
hm.keys
hm.contains("123")

def isHappy(n: Int): Boolean = {
//  val hm: Array[Int] = Array()
//  hm.appended(n.toString.map(x => x.toInt*x.toInt))
//  println(n.toString.map(x => x.toInt*x.toInt))
//  println(n.toString.map(x => s"${x.toString.toInt}*${x.toString.toInt}"))
//
//  println(n.toString)
//  true
  def loop(n: Int, hm: Array[Int]): Boolean = {
    val target = n.toString.map(ch => ch.toString.toInt*ch.toString.toInt).sum
    if(target == 1) true
    else {
      if(hm.contains(n)) false
      else{
        hm.appended(target)
        loop(target, hm.appended(n))
      }
    }
  }
  loop(n, Array() )
}
isHappy(19)