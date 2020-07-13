object Iterator_Ex {
  def main(args: Array[String]): Unit = {

    var list: List[Int] = List(78, 23)
    var it = Iterator(9,56)
    //println(it.max)
   // println(it.min)
    while (it.hasNext) {
      println(it.next())
    }

  }
}
