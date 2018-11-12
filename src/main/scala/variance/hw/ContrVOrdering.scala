package variance.hw

trait ContrVOrdering[-T] {
  def compare(a: T, b: T): Int
}
