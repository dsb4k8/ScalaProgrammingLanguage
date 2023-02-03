package monadtypepackages
object PointFreeHelper {
  def compose[A, B, C](ab: A=>B, bc: B=>C): A => C = {
    //Produce a C from an a
    a => {
      val b = ab(a)
      val c = bc(b)
      c
    }
  }
}
