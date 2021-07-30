package ex07

import org.scalatest.flatspec.AnyFlatSpec

class ListStringConvSpec extends AnyFlatSpec {
  it should "convert a list of strings to a list of all the characters in all the strings" in {
    assert(ListStringConv(List("hello")) === List('h', 'e', 'l', 'l', 'o'))
  }
}
