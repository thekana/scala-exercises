package ex03

object DoubleCompare {
  implicit class DoubleCompare(v: Double) {
    def ~=(other: Double)(implicit precision: Double = 0.1): Boolean = {
      math.abs(v - other) <= precision
    }
  }
}

