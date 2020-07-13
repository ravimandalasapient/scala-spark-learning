object StringExample {
  def main(args: Array[String]): Unit = {
    var greeting:String="Hello"
    var len:Int=greeting.length()

    println(len)
    println(greeting.concat(" ").concat("world!"))

    //Interpolation
  println(s"Ravi $greeting")
    println(s"${7+7}")

  }
}
