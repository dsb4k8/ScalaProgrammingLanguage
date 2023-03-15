object Solution {
  def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {
    val traversed: Array[Int] = Array()

    def top(matrix: Array[Array[Int]]): List[Int] = {
      matrix(0).foreach(x => traversed:+x)
      matrix(0).filterNot(x => traversed.contains(x)).toList
    }

    def right(matrix: Array[Array[Int]]): List[Int] = {

      matrix.map(array => array.last).foreach(x => traversed:+x)
      matrix.map(array => array.last).filterNot(x => traversed.contains(x)).toList

    }
//    def bottom(matrix: Array[Array[Int]]): List[Int] = ???
//    def left(matrix: Array[Array[Int]]): List[Int] = ???

    top(matrix)
//    println(traversed(0))
    right(matrix)
  }
}

val spiral = Array(Array(1,2,3), Array(4,5,6), Array(7,8,9))

//val traversed = Array(1)
//val first = spiral(0).filterNot(x => traversed.contains(x))

Solution.spiralOrder(spiral)