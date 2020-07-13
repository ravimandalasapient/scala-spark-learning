class Demo(val typeOfAnimal: String,val name:String) {
    var xc:String=typeOfAnimal
    var xc1:String=name

  def printAnimalDetails(dx:String,dy:String)
  {
    println("Type:::"+xc)
    println("Type:::"+xc1)
  }
}
object Animal{
  def main(args: Array[String]){
    //(new Demo).printAnimalDetails("Soft","Lion")
  }
}