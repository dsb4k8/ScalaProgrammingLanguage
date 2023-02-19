val fibo: LazyList[BigInt] = BigInt(0)#::BigInt(1)#::fibo.scan(BigInt(0))(_+_)

fibo(200)

val list = LazyList(BigInt(1),BigInt(2),BigInt(3),BigInt(4))
list.scan(BigInt(0))(_ + _).foreach(println(_))

def runningSum(l: List[BigInt]): List[BigInt] = {
  // returning x if l = List(x)
  // otherwise x + tail
  def loop(list: List[BigInt], traversed: List[BigInt]):List[BigInt] = list match{
    case Nil => traversed
    case x::xs => loop(xs,traversed.sum+x::traversed )
  }
  loop(l, List())
}

runningSum((1 to 1000).toList).reverse
