package contrib3
object Interpreter {
/*This is the end of the world (of our contrib3 program)
  Basically, contrib3 defines a `Thunk` (i.e a type alias which takes an A and returns a function of A),
  then assigns that Thunk to a type called Description.
  Then the run method of contrib3 (createDescription) is wrapped in a description type
  finally, the interpreter (here) loads this description, invokes the apply() function and returns the result.
 */

  def main(args: Array[String]): Unit = {
//    contrib3.run(args)
    print(Console.RED)
    val description: Description[Unit] = PointFreeContrib3.createDescription(args)
    def interpret[A](description: Description[A]): A = description.apply()
    print(Console.GREEN)
    interpret(description)
  }
}