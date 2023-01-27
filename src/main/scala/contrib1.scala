object contrib1 extends App {
  /*Notes
 1) Why [+A] in MyLazyList Trait?
    This makes the parameter will be covaraient with type A,
    thus making it more usable/ flexible
    as all subtypes of A can be accepted
  e.g.:
        Loan-----------
        |             |
        CreditCard,   DebitCard
  Liscov Substitution: if CreditCard and DebitCards are subtypes of Loan,
                       Credit/DebitCard can be used wherever a Loan can be used
  */

  sealed trait MyLazyList[+A] {
    def head: A
    def tail: MyLazyList[A]
    def isEmpty: Boolean

    /* Map can potentially change the type of each element
    Thus the result will be of type B even if B==A
     */
    def map[B](f: A => B): MyLazyList[B] = {
      if (isEmpty) MyLazyList.empty
      else MyLazyList.cons(f(head), tail.map(f))
    }
  }

  object MyLazyList{
    val empty = new MyLazyList[Nothing]{
      def head = throw new NoSuchElementException("Empty Lists are headless...")
      def tail = throw new UnsupportedOperationException("Empty Lists are tailless...")
      val isEmpty = true
    }

    def cons[A](h: => A, tl: => MyLazyList[A]) = new MyLazyList[A] {
      lazy val head = h
      lazy val tail = tl
      val isEmpty = false
    }

  }

  val lazylist = MyLazyList.cons(
    1,MyLazyList.cons(2,
      MyLazyList.cons(3,
        MyLazyList.cons(4,
          MyLazyList.empty)
      ))).map(
      a => {
        println(s"currentElement: $a")
        a+10
      }
  )
        println(lazylist.head)
        println(lazylist.head )
        println(lazylist.tail.head )
        println(lazylist.tail.head )




}
