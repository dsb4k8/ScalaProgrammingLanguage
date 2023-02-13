
val v = List(1,3,2,4,5)
val isSorted = v.equals(v.sorted)













val f = (i:Int) => List(i-1, i, i+1)
val fibostep = (i: Int) => List(i-2, i-1)
val sum = (i:Int) => fibostep(i)(0) + fibostep(i)(1)
val average = (i:Int) => (fibostep(i)(0) + fibostep(i)(1))/2
val fswithsum = (i: Int) => List(average(i))



val list = (0 to 10).toList
list.flatMap(fswithsum)
//val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//List(0, 1, 2, 1, 2, 3, 2, 3, 4, 3, 4, 5, 4, 5, 6, 5, 6, 7, 6, 7, 8, 7, 8, 9, 8, 9, 10, 9, 10, 11)



