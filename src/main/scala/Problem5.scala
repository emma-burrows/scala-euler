// PROBLEM 5
// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?


object Problem5 extends App {
  def findSmallestEvenlyDivisible() = {
    val multipleTo10 = 2520
    Stream.from(multipleTo10, multipleTo10).find(n => (11 to 20).map(n % _).sum == 0).getOrElse(0)
  }
}