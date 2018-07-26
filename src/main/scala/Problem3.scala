// PROBLEM 3
//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?

object Problem3 extends App {

  def primeFactors(n: Long) = {
    val sqrt: Long = Math.sqrt(n).toLong

    // This applies the "Fundamental Theorem of Arithmetic" which states:
    // Any integer greater than 1 is either a prime number, or can be written as a unique product of prime numbers (ignoring the order).
    // See https://www.mathblog.dk/project-euler-problem-3/
    //
    // Starting from 2, keep dividing n, keeping track of the largest factor we've found so far
    lazy val candidates: (Long, Long) = (2L to sqrt).toStream
      .foldLeft((n, 0L)) {
        (input: (Long, Long), candidate) => {
          // get the remaining number to divide and the largest prime factor so far
          val (numberRemaining, largestSoFar) = input

          val (newNumberRemaining, largest) =
            if (numberRemaining % candidate == 0) {
              // candidate is a factor, reduce numberRemaining to find next factor
              (numberRemaining / candidate, candidate)
            } else {
              // not a factor, keep the same number and largest
              (numberRemaining, largestSoFar)
            }

          // If the number remaining is larger than the largest, set it as the new largest
          (newNumberRemaining, if (newNumberRemaining > largest) newNumberRemaining else largest)
        }
      }

    candidates._2
  }

}