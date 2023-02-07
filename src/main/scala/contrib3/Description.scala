package contrib3

object Description {
  def create[A](a: => A): Description[A] = () => a

}
