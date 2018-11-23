import utils._
/*
object Appl{

  def readFile(fileName: String): Option[Array[String]] = 
    try {
    val inFile = scala.io.Source.fromFile(fileName)
      try {
        Some(inFile.getLines.toArray)
      } finally {
        inFile.close
      }
    } catch {
      case ex: java.io.FileNotFoundException => {println(ex.getMessage); None}
      case ex: Throwable => {println("Default exception handler: "+ ex.getMessage); None}
    }
  
  def writeFile(filename: String, text: Array[String]){
    val outFile = new java.io.PrintWriter(filename)
    for (login <- text) {
      val passwd = PasswdGen.nextPasswd(10)
      outFile.println(login + ":" + passwd) // przykładowa linia jkowal:D4_xdf5$gR
    }
    outFile.close
  }

  def main(args: Array[String]): Unit = {
    val lines = readFile("logins.txt") match {
              case None => Array.empty[String]
              case Some(a) => a 
            }
    writeFile("login-passwds.txt", lines)
  }
    
}*/