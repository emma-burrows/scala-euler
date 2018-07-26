import org.scalatest.{FlatSpec, Matchers}

class Problem4Test extends FlatSpec with Matchers {

  it should "be correct" in {
    Problem4.run() shouldBe 4613732
  }
}
