object Scala_List_Ex {
  def main(args: Array[String]): Unit = {
    val myList:List[String]=List("Apple","Banana","Grape")
    val numList:List[Int]=List(67,67,89)
    val emptyList:List[Nothing]=List()
    val dimList:List[List[Int]]=List(List(0,3,4),List(8,1,3))
    println(myList.head)
    println(emptyList.isEmpty)
    //concat List
    println(List.concat(myList,numList))
  }
}
