object RegularExp {
  def main(args: Array[String]): Unit = {
    var patter="scala".r;
    val str = "scala is Scalable and cool"
     println(patter findFirstIn(str) )
  }

}
