object FunctionVarArgs {
  def main(args: Array[String]): Unit = {
    println(printString("Java","Scala","Android"))
  }
  def printString(strArr: String*): Unit =
  {   var i:Int=0;
        for (arg <- strArr)
          {
            println(arg+i)
            i=i+1;
          }

  }
}
