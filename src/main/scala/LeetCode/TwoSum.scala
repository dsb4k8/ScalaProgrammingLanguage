package LeetCode

object TwoSum {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    //map original array elements to counterpart (target - element)
    //then Array wrap index original values index with counterpart index
//    val secondTargets = nums.sorted.reverse.map(original => target-original)
//    val res = secondTargets.map(neededValues => nums.indexOf(neededValues)).zipWithIndex.take(1)
//    Array(res(0)._1, res(0)._2).foreach(println(_))
//    Array(res(0)._1, res(0)._2)
    val first = nums.map(orig => nums.indexOf(target-orig)).zipWithIndex.filterNot(x => x._1==x._2).filterNot(elem => elem._1 == -1)
    first.foreach(x => println(x._1,x._2))
    Array(first(0)._1,first(0)._2)

  }
  def main(args: Array[String]): Unit = {
    twoSum(Array(3,2,3), 6)

  }
}
