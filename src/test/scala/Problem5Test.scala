import org.scalatest.{FlatSpec, Matchers}

class Problem5Test extends FlatSpec with Matchers {

  it should "be correct for numbers up to 20" in {
    Problem5.findSmallestEvenlyDivisible() shouldBe 232792560
  }
}
