import ex01.StringQueueImpl
import org.scalatest.flatspec.AnyFlatSpec

class Ex01Spec extends AnyFlatSpec {
  val q = new StringQueueImpl
  it should "work as normal queue" in {
    q.put("hello")
    q.put("123")
    assert(q.get === "hello")
    assert(q.get === "123")
  }
  it should "throw exception if empty" in {
    assertThrows[NoSuchElementException] {
      q.get()
    }
  }
}
