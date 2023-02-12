package LeetCode

object LC1598 {
def eval(logs: Array[String]): Int = {
  logs.toList match {
    case Nil => 0
    case x :: Nil =>
      if (x.takeRight(3) == "../") -1 else if (x.takeRight(2) == "./") 0 else 1
    case x :: xs => minOperations(Array(x)) + minOperations(xs.toArray)
  }
}

  def minOperations(logs: Array[String]): Int = {
    def eval(logs: Array[String]): Int = {
      logs.toList match {
        case Nil => 0
        case x :: Nil =>
          if (x.takeRight(3) == "../") -1 else if (x.takeRight(2) == "./") 0 else 1
        case x :: xs => eval(Array(x)) + eval(xs.toArray)
      }
    }

      val evaluationResult = eval(logs)

     evaluationResult == Math.abs(evaluationResult) match {
      case true => evaluationResult + 1
      case false => 0
    }

  }

  def main(args: Array[String]): Unit = {
    println(minOperations(Array("d1/","d2/","../","d21/","./")))
    println(minOperations(Array("./","wz4/","../","mj2/","../","../","ik0/","il7/")))
  }


}
