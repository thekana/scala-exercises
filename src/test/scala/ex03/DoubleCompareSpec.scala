package ex03

import org.scalatest.flatspec.AnyFlatSpec


class DoubleCompareSpec extends AnyFlatSpec {

  import ex03.DoubleCompare._

  it should "be true if within default precision" in {
    assert(12.5 ~= 12.53)
  }

  it should "be false if more than default precision" in {
    assertResult(12.5 ~= 12.7)(false)
  }

  it should "be true if within set precision" in {
    implicit val newPrecision: Double = 0.01
    assert(12.5 ~= 12.51)
  }

  it should "be false if more than set precision" in {
    implicit val newPrecision: Double = 0.001
    assertResult(12.5 ~= 12.53)(false)
  }
}
