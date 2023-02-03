
package object monadtypepackages {
  private type Thunk[A] = () => A
  type Description[A] = Thunk[A]

  //format: OFF
  private type RegularArrow[A, B] = A => B
  private type KleisliArray[A ,B , C[_]] = A => C[B]
  //format: ON

  implicit final class InfixNotationForPointFree[A,B](private val ab: A => B) extends AnyVal {
    def `;` [C](bc: B => C): A => C = PointFreeHelper.compose(ab, bc)
  }


}
