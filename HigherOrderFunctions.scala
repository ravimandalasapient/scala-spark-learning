object HigherOrderFunctions {
  def main(args: Array[String]): Unit = {
    findExample(20,multiplyby2)
  }
  def findExample(a:Int,f: Int=>AnyVal):Unit={
    println(multiplyby2(a))
  }
  def multiplyby2(a: Int): Int={
    a*2
  }
}
