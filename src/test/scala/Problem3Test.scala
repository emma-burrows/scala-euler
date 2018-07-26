import org.scalatest.{FlatSpec, Matchers}

class Problem3Test extends FlatSpec with Matchers {

  it should "be correct" in {
    Problem3.primeFactors(600851475143L) shouldBe 6857
  }
}
