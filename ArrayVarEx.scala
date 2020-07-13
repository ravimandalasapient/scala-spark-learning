import Array._
object ArrayVarEx {
  def main(args: Array[String]): Unit = {
    var arr=new Array[String](3)
    var numArr= Array(23,12,45.5)
    var numArr1= Array(98,78.89)
    var total:Double=0.0
    arr(0)="ravi"
    arr(1)="Ram"
    arr(2)="krish"
    for(x<-arr)
      println(x)
    for (i<-0 to (numArr.length-1))
      total=total+numArr(i)
    println(total)

    //concat of 2 arrays
    var newArr=concat(numArr1,numArr)
    println(newArr(0))

    //creating arrays with ranges
    var arrRange1=range(10,20,3)
    var arrRange2=range(10,20)
    for (x<-arrRange1)
      println(x)
    for(x<-arrRange2)
      println(x)
  }
}
