// PROBLEM 7
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?


object Problem7 extends App {

  def run(n: Int) = {
    def isPrime(n: Int) = (n == 2) || !(3 to Math.sqrt(n).toInt by 2).exists(n % _ == 0)
    lazy val primes = 2 #:: Stream.from(3, 2).filter(isPrime)
    primes.lift(n - 1).getOrElse(0)
  }
}