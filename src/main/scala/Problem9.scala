// PROBLEM 9
//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//a^2 + b^2 = c^2
//For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.


object Problem9 extends App {

  def pythagoreanTripletProduct(tripletSum: Int) = {
    val third = Math.round(tripletSum / 3)

    (1 to third).flatMap { a =>
      (a + 1 to tripletSum - third).map { b =>
        val c = tripletSum - a - b
        (a, b, c)
      }.filter { case (a, b, c) =>
        (a < b && b < c) && (a * a + b * b == c * c)
      }
    }.head
  }

  println(pythagoreanTripletProduct(1000))
}