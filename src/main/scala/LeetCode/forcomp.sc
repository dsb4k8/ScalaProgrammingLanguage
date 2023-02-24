/*I recently got the following interview question
* Given N sorted(Asc) arrays of same length,
* take exactly 1 element from each N collections,
* return the collection of N elements which has smallest range of values
 */
val a = Array(2, 4, 6, 9, 16)
val b = Array(13, 14, 16, 18, 19)
val c = Array(4, 5, 14, 17, 19)

val v = for{
  x <- a
  y <- b
  z <- c
  mx = Array(x,y,z).max
  mn = Array(x,y,z).min
} yield(mx-mn, (x,y,z))

v.min._2

val m = "a"
val n = "good"
val s = "alice is a good girl she is a good student".split(" ").indexOfSlice(Seq(m,n))
"alice is a good girl she is a good student".split(" ")(s+2)
"alice is a good girl she is a good student".split(" ").takeRight(s+3)
2+:Array(1)
def findOcurrences(text: String, first: String, second: String): Array[String] = {
  def loop(t: String, f: String, s: String): Array[String] = {
    val ids = t.indexOfSlice(Seq(f,s))
    t.split(" ").toList.length match{
      case 0 => Array("")
      case 1 => Array("")
      case 2 => Array("")
      case _ => t.split(" ")(ids+2) +: loop(t.takeRight(ids+3), f, s)

    }
  }
  loop(text, first, second)
}

findOcurrences("alice is a good girl she is a good student", "a", "good")
