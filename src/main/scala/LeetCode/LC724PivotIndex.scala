package LeetCode

object LC724PivotIndex {

  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[(Int,Int)] = {
    val quantities1 = nums1.map(x => (x,nums1.count(_==x)))
    val quantities2 = nums2.map(x => (x,nums2.count(_==x)))
//    short_long_pair._1.filter(element => short_long_pair._2.contains(element)).map(x => )
    println(quantities2)
    quantities1.filter(x => nums2.contains(x._1)).map(y => quantities2.filter(y => nums2.contains(y._1))).max(x._2,y._2)
  }

  def main(args: Array[String]): Unit = {
    intersect(Array(1,2,2,1), Array(2)).foreach(println(_))
  }

}
