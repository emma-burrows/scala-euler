// PROBLEM 4
//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.


object Problem4 extends App {

  def run() = {
    def isPalindrome(n: Int) = n.toString == n.toString.reverse

    def allProducts = for {
      n <- 999 to 100
      m <- 999 to 100
    } yield n * m

    allProducts.find(isPalindrome)
  }

  println(run())
}