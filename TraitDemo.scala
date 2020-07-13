trait Equal
{
  def isEqual(x:Any):Boolean
  def isNotEqual(x:Any):Boolean = !isEqual(x)
}
class Point(xc:Int,yc:Int) extends  Equal {
  var x: Int = xc
  var y: Int = yc

  override def isEqual(obj: Any): Boolean = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == obj.asInstanceOf[Point].y
}
  object TraitDemo{
    def main(args: Array[String]): Unit = {
      var p1=new Point(4,34)
      var p2=new Point(34,34)
      println(p1.isNotEqual(p2))

    }
  }

