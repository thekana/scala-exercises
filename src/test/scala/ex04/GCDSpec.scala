package ex04

import org.scalatest.flatspec.AnyFlatSpec

class GCDSpec extends AnyFlatSpec {
  it should "work" in {
    assert(GCD(48, 18) === 6)
    assert(GCD(8, 12) === 4)
    assert(GCD(18, 48) === 6)
  }
}
