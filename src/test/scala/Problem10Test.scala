import org.scalatest.{FlatSpec, Matchers}

class Problem10Test extends FlatSpec with Matchers {

  it should "be correct" in {
    Problem10.sumPrimes(10) shouldBe 17
  }

  it should "be correct for 2m" in {
    Problem10.sumPrimes(2000000) shouldBe 142913828922L
  }
}
