import scala.collection.mutable


def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {
//  val traversed:List[Int] = List()
  if(matrix(0).length==1) matrix.map(x => x(0)).toList else {
    val matrix_size = matrix.length * matrix(0).length

    def step_thru(matrix: List[List[Int]], traversed: List[Int]): List[Int] = {

      if (traversed.length <= matrix_size) {
        def top: List[Int] = matrix(0).filterNot(el => traversed.contains(el)).toList

        def right: List[Int] = matrix.map(array => array.last).filterNot(el => traversed.contains(el)).drop(1).toList

        def bottom: List[Int] = matrix(matrix.length - 1).reverse.filterNot(el => traversed.contains(el)).drop(1).dropRight(1).toList

        def left: List[Int] = matrix.map(array => array(0)).reverse.filterNot(el => traversed.contains(el)).dropRight(1).toList

        def next: List[List[Int]] = matrix.drop(1).dropRight(1).map(remaining => remaining.drop(1).dropRight(1))

        println(next)

        println(top, right, bottom, left)
        if (next.isEmpty) traversed ::: top
        else step_thru(next, traversed ::: top ::: right ::: bottom ::: left)
      }
      else traversed
    }

    step_thru(matrix.map(x => x.toList).toList, List())
  }
}
/*
* 1 2 3
* 4 5 6
* 7 8 9
*/
val nest_matrix = Array(Array(1,2,3),Array(4,5,6),Array(7,8,9))
val nest_matrix2 = Array(Array(1),Array(2))

spiralOrder(nest_matrix2)


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