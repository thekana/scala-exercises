package ex01

trait GenericQueue {
  def put(elem: String)

  def get(): String
}

class StringQueueImpl extends GenericQueue {

  private var queue = new Array[String](0)

  override def put(elem: String): Unit = {
    queue = queue :+ elem
  }

  override def get(): String = {
    val result = queue.head
    queue = queue.tail
    result
  }
}