package ex05

object TimeIt {
  def apply[A](f: => A): A = {
    val start = System.currentTimeMillis()
    val result = f
    val stop = System.currentTimeMillis()
    println(stop - start)
    result
  }
}
