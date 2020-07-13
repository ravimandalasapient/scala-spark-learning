import java.io.{File, PrintWriter}

object Fileoperation {
  def main(args: Array[String]): Unit = {
    var line=Console.readLine()
    var writer=new PrintWriter(new File("C:\\input.txt"))
    writer.write(line)
    writer.close()
  }
}
