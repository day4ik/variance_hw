# variance_hw

Just for understanding variance in scala


**Tasks:**
* implement all needed _case class_ and _case object_ for proposed _traits_ 
    ```scala 
    trait ContrVOrdering[-T] {
      def compare(a: T, b: T): Int
    }
    ```
    and
    ```scala
    trait BiTree[+T] {
      val value: T
      def add[U/*Think about bound here*/](value: U)(implicit ord: ContrVOrdering[U]): BiTree[U]
    }
    ```
* write tests using `scalatest`
* write tests using `scalacheck`


___NOTE___: *Feel free to extend / change any interface if needed.*