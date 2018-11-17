package variance.hw

trait BiTree[+T] {
  def value: T
  def left: BiTree[T]
  def right: BiTree[T]
  def find(v: T): Option[T]
  def add[U/*Think about bound here*/](value: U)(implicit ord: ContrVOrdering[U]): BiTree[U]
}
