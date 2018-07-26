import org.scalatest.{FlatSpec, Matchers}

class Problem6Test extends FlatSpec with Matchers {

  it should "be correct fo 10" in {
    Problem6.difference(10) shouldBe 2640
  }

  it should "be correct for 100" in {
    Problem6.difference(100) shouldBe 25164150
  }
}
