import org.scalatest.{FlatSpec, Matchers}

class Problem1Test extends FlatSpec with Matchers {
  it should "be correct" in {
    Problem1.run() shouldBe 234168
  }
}
