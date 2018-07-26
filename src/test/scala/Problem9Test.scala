import org.scalatest.{FlatSpec, Matchers}

class Problem9Test extends FlatSpec with Matchers {

  it should "be correct for a = 3, b = 4, c = 5" in {
    Problem9.pythagoreanTripletProduct(12) shouldBe (3, 4, 5)
  }

  it should "be correct for sum = 1000" in {
    Problem9.pythagoreanTripletProduct(1000) shouldBe (200,375,425)
  }
}
