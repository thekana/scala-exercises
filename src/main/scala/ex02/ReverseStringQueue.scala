package ex02

import ex01.{GenericQueue, StringQueueImpl}

trait ReverseQueue extends GenericQueue {
  abstract override def put(elem: String): Unit = {
    super.put(elem.reverse)
  }
}

class ReverseStringQueue extends StringQueueImpl with ReverseQueue {

}
