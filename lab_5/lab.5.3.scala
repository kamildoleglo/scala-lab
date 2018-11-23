object Appl531 {
  def genSumArray(elems: Array[Int], f: (Int) => Int) = {
    var sum = 0
    for (e <- elems) sum += f(e)
    sum
  }
 
  def sum(elems: Array[Int]) = genSumArray(elems, (e: Int) => e) 
  def sumSqr(elems: Array[Int]) = genSumArray(elems, (e: Int) => math.sqrt(e).toInt)
  def sumCube(elems: Array[Int]) = genSumArray(elems, (e: Int) => (e*e).toInt)
  def sumAbs(elems: Array[Int]) = genSumArray(elems, (e: Int) => math.abs(e))

  def tests() = {
    val a = Array(1,2,3,4,-5, 0)
    
    assert(sum(a) == 5)
    assert(sumCube(a) == 55)
    assert(sumSqr(a) == 5)
    assert(sumAbs(a) == 15)
  }
  def main(args: Array[String]) {
    tests()
    val a = Array(1,2,3,4,-5)
    println("sum(a) = " + sum(a))
  }
}

def printNTimes(toPrint: Int, n: Int) = for(i <- 1 to n) println(toPrint)
printNTimes(scala.util.Random.nextInt, 3)
