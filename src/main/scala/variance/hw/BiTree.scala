package variance.hw

trait BiTree[+T] {
  val value: T
  def add[U/*Think about bound here*/](value: U)(implicit ord: ContrVOrdering[U]): BiTree[U]
}
