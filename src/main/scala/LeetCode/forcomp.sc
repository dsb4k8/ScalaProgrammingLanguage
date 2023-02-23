/*I recently got the following interview question
* Given N sorted(Asc) arrays of same length,
* take exactly 1 element from each N collections,
* return the collection of N elements which has smallest range of values
 */
val a = Array(2, 4, 6, 9, 16)
val b = Array(13, 14, 16, 18, 19)
val c = Array(4, 5, 14, 17, 19)

val v = for{
  x <- a
  y <- b
  z <- c
  mx = Array(x,y,z).max
  mn = Array(x,y,z).min
} yield(mx-mn, (x,y,z))

v.min._2
