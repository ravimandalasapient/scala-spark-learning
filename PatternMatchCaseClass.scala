object PatternMatchCaseClass {
  def main(args: Array[String]): Unit = {
    var alice = new Person("alice", 12)
    var ravi = new Person("ravi", 34)
    var other = new Person("krish", 78)
    for (obj <- List(alice, ravi, other)) {
          obj match{
      case Person("alice", 12) => println(obj.name + obj.age)
     // case Person("ravi", 34) => println(obj.name + obj.age)
      case Person(name, age) => println(obj.name + obj.age)
    }

  }
}
  case class Person(name:String,age:Int)
}
