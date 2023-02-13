package LeetCode

object LC876 {
  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  def middleNode(head: ListNode): ListNode = {
    lazy val mid =
      if(nodesToEnd(head, 0)%2 ==0) nodesToEnd(head, 0)/2
      else nodesToEnd(head, 0)/2 + 1
    println("Mid = " + mid)
    def nodesToEnd(hd: ListNode, count: Int = 0): Int = hd.next match{
      case null => count
      case _ => nodesToEnd(hd.next, count + 1)
    }
    def getmiddleNode(ln: ListNode, middle: Int):ListNode = {
      val nodes_to_go = middle
      if(nodes_to_go == 0) ln
      else getmiddleNode(ln.next, middle-1)
    }
    getmiddleNode(head, mid)
  }

  def main(args: Array[String]): Unit = {
    val ln = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))
    println(middleNode(ln).x)
    val ln2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))
    println(middleNode(ln2).x)
  }


}
