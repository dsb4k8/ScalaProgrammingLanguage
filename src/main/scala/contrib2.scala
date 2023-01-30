
object contrib2 {

  /* LazyLists
    - Recurrisive
    - Auto-memoizing
    - Infinite
    - Magic
   */
  object s{
    val fibo: LazyList[BigInt] = 0 #:: fibo.scan(1:BigInt)(_+_)
    val ll:LazyList[BigDecimal] = 0 #:: ll.scan(1:BigDecimal)(_+_/2)
//    val pascal: LazyList[BigInt] = 0 #:: pascal.scan(1: BigInt)()
    def pascal(c: BigInt, r: BigInt): BigInt = {
      if(c==r || c==1) 1
      else if(r<c || c<1) 0
      else pascal(c-1, r-1) + pascal(c, r-1)
    }

   

//    val betterPascal: LazyList[BigInt] = 0 #:: betterPascal.scan(1)
//      (c,r) => {
//        if(c==r || c==1)1
//        else if (r < c || c < 1) 0
//        else betterPascal(c - 1, r - 1) + betterPascal(c, r - 1)
//    })
  }




  def main(args: Array[String]): Unit = {
//    println(s.pascal(22,51))

//    println(s.ll(3))
//    println(s.calculateFL(3))

  }

}
