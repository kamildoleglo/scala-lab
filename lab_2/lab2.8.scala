
trait Fraction {
  val num: Int
  val denom: Int
  def +(other: Fraction): Fraction
  def -(other: Fraction): Fraction
  def *(other: Fraction): Fraction
  def /(other: Fraction): Fraction
  
}
  
trait Loggable {
  def log(timeStamp: Long, msg: String) = println("[" + timeStamp.toString + "]: " + msg)
}
  
object Fraction {
  // one of the "creational patterns/idioms"
  def apply(num: Int, denom: Int, loggable: Boolean = false): Fraction =
    if (loggable) new LoggableImpl(num, denom) else new DefaultImpl(num, denom) 
  
  private class DefaultImpl(val num: Int, val denom: Int) extends Fraction {
    override def *(other: Fraction): Fraction =
      Fraction(this.num * other.num, this.denom * other.denom)
    override def +(other: Fraction): Fraction =
      Fraction(this.num * other.denom + other.num * this.denom, this.denom * other.denom, true)
    override def -(other: Fraction): Fraction =
      Fraction(this.num * other.denom - other.num * this.denom, this.denom * other.denom, true)
    override def /(other: Fraction): Fraction =
      Fraction(this.num * other.denom, this.denom * other.num)
    override def toString() = num.toString + "/" + denom.toString
  }
   
  private class LoggableImpl(num: Int, denom: Int) extends DefaultImpl(num, denom) with Loggable {
    def timeStamp = System.nanoTime // to keep the example short...
    override def *(other: Fraction): Fraction = {
      log(timeStamp, "multiplying " + this.toString + " by " + other.toString)
      Fraction(this.num * other.num, this.denom * other.denom, true) // super.*(other) is not loggable  
    }
    override def +(other: Fraction): Fraction = {
      log(timeStamp, "adding " + this.toString + " to " + other.toString)
      Fraction(this.num * other.denom + other.num * this.denom, this.denom * other.denom, true) // super.+(other) is not loggable  
    }
    override def -(other: Fraction): Fraction = {
      log(timeStamp, "subtracting " + other.toString + " from " + this.toString)
      Fraction(this.num * other.denom - other.num * this.denom, this.denom * other.denom, true) // super.-(other) is not loggable  
    }
    override def /(other: Fraction): Fraction = {
      log(timeStamp, "dividing " + this.toString + " by " + other.toString)
      Fraction(this.num * other.denom, this.denom * other.num, true) // super./(other) is not loggable  
    }
  }
}
  
object Appl {
  def main(agrs: Array[String]) {
    val f1 = Fraction(3, 7)
    val f2 = Fraction(4, 9)
    val f3 = Fraction(1, 19, true)
    val f1f2 = f1 * f2
    val f1af2 = f1 + f2
    val f1sf2 = f1 - f2
    val f2df3 = f2 / f3
    
    println(f1.toString + " * " + f2.toString + " = " + f1f2)
    println(f3.toString + " * " + f2.toString + " * " + f1.toString + " = " + f3 * f2 * f1)
    println(f1.toString + " + " + f2.toString + " = " + f1af2)
    println(f1.toString + " - " + f2.toString + " = " + f1sf2)
    println(f2.toString + " / " + f1.toString + " = " + f2df3)
        
  }
}