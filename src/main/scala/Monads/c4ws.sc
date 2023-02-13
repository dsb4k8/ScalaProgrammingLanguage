
//Definition for a binary tree node.
class TreeeNode(_value: Int = 0, _left: TreeeNode = null, _right: TreeeNode = null) {
  var value: Int = _value
  var left: TreeeNode = _left
  var right: TreeeNode = _right
}


//  print current node
//  if left node not null, run method for left tree
//  else run method for right tree
object Solution{
//  def tree2str(root: TreeeNode): String =  {
//    def step(tn: TreeeNode): String = {
////      if (tn.value!=null) s"${tn.value}(${})"
//    }
//  }
}



val v = new TreeeNode(1)
v.value
v.left = new TreeeNode(2, new TreeeNode(4, new TreeeNode(4), null), null)
v.right = new TreeeNode(3)
v.left.left.value
v.right.value
//
//val isSorted = v.equals(v.sorted)













val f = (i:Int) => List(i-1, i, i+1)
val fibostep = (i: Int) => List(i-2, i-1)
val sum = (i:Int) => fibostep(i)(0) + fibostep(i)(1)
val average = (i:Int) => (fibostep(i)(0) + fibostep(i)(1))/2
val fswithsum = (i: Int) => List(average(i))



val list = (0 to 10).toList
list.flatMap(fswithsum)
//val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//List(0, 1, 2, 1, 2, 3, 2, 3, 4, 3, 4, 5, 4, 5, 6, 5, 6, 7, 6, 7, 8, 7, 8, 9, 8, 9, 10, 9, 10, 11)



