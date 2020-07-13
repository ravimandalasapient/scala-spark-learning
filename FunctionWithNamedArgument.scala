object FunctionWithNamedArgument {
  def main(args: Array[String]): Unit = {
    printNamedArguments(a=5,b=89)
  }
  def printNamedArguments(b: Int,a:Int): Unit =
  {
    println(a+" "+b)
  }
}
