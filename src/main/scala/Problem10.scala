// PROBLEM 10
//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//Find the sum of all the primes below two million.


object Problem10 extends App {

  def sumPrimes(max: Long) = {
    def isPrime(n: Long) = (n == 2) || !(3 to Math.sqrt(n).toInt by 2).exists(n % _ == 0)
    lazy val primes = (2L #:: (3L until max by 2L).toStream).filter(isPrime)
    primes.sum
  }

  println(sumPrimes(2000000))
}