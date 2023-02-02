
package object monadtypepackages {
  private type Thunk[A] = () => A
  type Description[A] = Thunk[A]

  //format: OFF
  private type RegularArrow[A, B] = A => B
  private type KleisliArray[A ,B , C[_]] = A => C[B]
  //format: ON


}
