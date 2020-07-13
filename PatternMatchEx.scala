object PatternMatchEx {
  def main(args: Array[String]): Unit = {
    println(printMessage(1))
    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(1))
  }
  def printMessage(i: Int):String=i match{
    case 1=>"one"
    case 2=>"two"
    case _=>"Many"

  }
  def matchTest(i: Any): Any=i match{
    case 1=>"one"
    case "two"=>1
    case "test"=>"not scala data type"
  }
}
