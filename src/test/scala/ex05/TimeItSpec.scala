package ex05

import org.scalatest.flatspec.AnyFlatSpec

import java.io.ByteArrayOutputStream

class TimeItSpec extends AnyFlatSpec {
  it should "measure something" in {
    val stream = new ByteArrayOutputStream()
    Console.withOut(stream) {
      TimeIt {
        Thread.sleep(200)
      }
    }
    assert(stream.toString >= "200")
  }
}
