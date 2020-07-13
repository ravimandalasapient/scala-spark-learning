object Tuple_Ex {
  def main(args: Array[String]): Unit = {
      var myTuple=(1,"ravi")
    val t = new Tuple3(1, "hello", "Console")

    //accessing elements
    //println(t._2)
    t.productIterator.foreach{ i=>println(i)

    }
  }
}
