package ex06

import ex05.TimeIt
import org.scalatest.flatspec.AnyFlatSpec

class StringUtilSpec extends AnyFlatSpec {
  it should "get longest word" in {
    assert(StringUtil.longestWord("hello it's me") === "hello")
  }

  it should "get most common word" in {
    assert(StringUtil.mostCommonWord("hello it's me hello") === "hello")
  }

  it should "get most common letter" in {
    assert(StringUtil.mostCommonLetter("hello eeeeeee") === 'e')
  }

  it should "convert to map correctly" in {

    val expected = Map(
      'h' -> Seq("hi", "there"),
      'i' -> Seq("hi"),
      't' -> Seq("there"),
      'e' -> Seq("there"),
      'r' -> Seq("there")
    )

    assert(StringUtil.toLetterWordMap("hi there there") === expected)
    assert(StringUtil.betterToLetterWordMap("hi there there") === expected)
  }
}
