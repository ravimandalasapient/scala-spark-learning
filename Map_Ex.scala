import scala.collection.mutable.Map
object Map_Ex {
  def main(args: Array[String]): Unit = {
    var myMap:Map[String,Int]=Map()
      myMap  = myMap+("ravi"-> 8)+("Krish"->67)
    println(myMap.get("Krish"))

  }
}
