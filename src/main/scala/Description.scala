package monadtypepackages

object Description {
  def create[A](a: => A): Description[A] = () => a

}
