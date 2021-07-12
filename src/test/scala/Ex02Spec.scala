import ex02.ReverseStringQueue
import org.scalatest.flatspec.AnyFlatSpec

class Ex02Spec extends AnyFlatSpec {
  val q = new ReverseStringQueue
  it should "work as reverse string queue" in {
    q.put("hello")
    q.put("123")
    assert(q.get === "olleh")
    assert(q.get === "321")
  }
  it should "throw exception if empty" in {
    assertThrows[NoSuchElementException] {
      q.get()
    }
  }
}
