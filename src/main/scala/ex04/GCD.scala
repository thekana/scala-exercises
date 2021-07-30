package ex04

import scala.annotation.tailrec

object GCD {

  @tailrec
  def apply(a: Int, b: Int): Int = {
    (a, b) match {
      case (a, 0) => a
      case _ => GCD(b, a % b)
    }
  }
}