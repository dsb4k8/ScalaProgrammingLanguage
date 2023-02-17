package FunctionalProgScala

object FP extends App {

  class Triangle(name: String){
    def apply(sideLength: Int) = println(s"Triangle '${this.name}' was created with paremeter: ${sideLength*3}")
  }
  val shortTriangle = new Triangle("shorty")
  shortTriangle(1)

  /*
  Scala runs on the JVM
  Functional Programming:
   - compose functions
   - pass functions as args
   - return functions as results

   How do we do it:  FunctionX = Function1, Function2, ... , Function22
   ... the trick is to have methods extend the functionx trait
   :)
   1) */
  val incrementer = new Function1[Int, Int] {
    override def apply(arg: Int): Int = arg + 1
    //Defined A function
  }
  incrementer(41)

  /*
  Lets do it for a contatination: This will be a Function2 which takes 2 strings and reutrns a string
  2) */
  val concatinator = new Function2[String, String, String]{
    override def apply(arg1: String, arg2:String): String = arg1+arg2
  }
  println(concatinator("This Plus", "That"))

  //syntax sugar
  val doubler: (Int) => Int = (x: Int) => 2*x
  println(doubler(4))

  val productor: (Int, Int) => Int = (x: Int, y: Int) => x*y

  println(productor(10, 15))


  //Higher Order Functions: Take functions as args or return them as results
  val nSquared: (Int) => Int =  x => x*x
  val nCubed: (Int) => Int = x => x*x*x
  val aMappedList = List(1,2,3).map(nCubed)//HOF
  println(aMappedList)

  val alist = List(0,1,1,0)

  println(alist)
  (1 to 100).toList.filter(x => x <=3).foreach(println(_))


  //create all pairs between 1,2,3 and a,b,c

  val allpairs = (1 to 3).toList.flatMap(number => List('a', 'b', 'c').map(letter => (number,letter)))
//  println(allpairs.combinations(2).toList)


  implicit class ListExtension(list: List[Int]){
    val zipWithAlpha = for {
      number <- list
      letter <- (1 to list.length).map(num => ("a".head + num-22).toChar.toString)
    }yield (number,letter)
  }

  val listOfInts = List(1,2,3)
  println(listOfInts.zipWithAlpha)



}
