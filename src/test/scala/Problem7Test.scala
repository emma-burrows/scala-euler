import org.scalatest.{FlatSpec, Matchers}

class Problem7Test extends FlatSpec with Matchers {

  it should "be correct for the first prime" in {
    Problem7.run(1) shouldBe 2
  }

  it should "be correct for the sixth prime" in {
    Problem7.run(6) shouldBe 13
  }

  it should "be correct for the 10,001st prime" in {
    Problem7.run(10001) shouldBe 104743
  }
}
