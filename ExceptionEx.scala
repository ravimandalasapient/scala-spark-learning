import java.io.{FileNotFoundException, FileReader, IOException}

object ExceptionEx {
  def main(args: Array[String]): Unit = {
    try{
      val f=new FileReader("C:\\input.tx")
    }
    catch {
      case ex:FileNotFoundException=>{
          println("file is missing")
      }
      case ex: IOException=>{
        println("IO Excption")
      }

    }
    finally {
      println("finall")

    }
  }
}
