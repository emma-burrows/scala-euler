object Problem1 extends App {
//  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//  Find the sum of all the multiples of 3 or 5 below 1000.
  def run() = {
    def isMultiple(num: Int): Boolean = num % 3 == 0 || num % 5 == 0

    (1 to 1000).toList.filter(isMultiple).sum
  }

  println(run())
}
