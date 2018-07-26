import org.scalatest.{FlatSpec, FunSuite, Matchers}

class Problem2Test extends FlatSpec with Matchers {

  it should "be correct" in {
    Problem2.run() shouldBe 4613732
  }
}
