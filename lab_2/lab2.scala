import scala.beans.BeanProperty
class Person(val givenName: String, @BeanProperty var surname: String, private val id: String) {
  def getName: String  = { givenName + " " + surname; }
}

/*
object Appl extends App{
    val p = new Person("Jan", "Kowalski", "1234567890")
    println(p.getName)
}
*/
/*


object Int2DVec {
  def apply(x: Int, y: Int) = new Int2DVec(x, y)
  def apply() = new Int2DVec(0, 0)
  def apply(prototype: Int2DVec) = new Int2DVec(prototype.x, prototype.y) 
  def unitVectorOf(vector: Int2DVec) = new Int2DVec((vector.x/vector.length).toInt, (vector.y/vector.length).toInt)
}

class Int2DVec (val x: Int, val y: Int) {
  def +(other: Int2DVec) = new Int2DVec(x + other.x, y + other.y)
  def unary_- = new Int2DVec(-x, -y)
  override def toString() = "(" + x.toString + "," + y.toString + ")"
  def -(other: Int2DVec) = new Int2DVec(x - other.x, y - other.y)
  def *(other: Int2DVec) = x*other.x + y*other.y
  def length = Math.sqrt(x*x + y*y)
}
 
object Appl {
  def main(agrs: Array[String]) {
    val v1 =  Int2DVec(1, 2)
    val v2 =  Int2DVec(10, 20)
    val v3 = v1 + v2
    val v4 = -v2
    val v5 = v2 - v1
    val v6 = v1 * v2
    val v7 =  Int2DVec(4,0)
    println(v3)
    println(v4)
    println(v5)
    println(v6)
    println(Int2DVec())
    println(Int2DVec(v1 + v1 + v2))
    println(Int2DVec.unitVectorOf(v7))
  }
}


*/