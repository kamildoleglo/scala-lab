
object Appl470 {
  object WeekDay extends Enumeration {
    type WeekDay = Value
    val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
  }
  import WeekDay._
  def printDayName(day: WeekDay) = day match {
      case Mon => println("Monday")
      case Tue => println("Tuesday")
      case Wed => println("Wednesday")
      case Thu => println("Thursday")
      case Fri => println("Friday")
      case Sat => println("Saturday")
      case Sun => println("Sunday")
      case _   => println("What the he..?!")
  }
  
  
  def main(args: Array[String]) {
    for (day <- WeekDay.values) printDayName(day)
  }
}


def printContInfo(c: Any) = c match {
  case any   => println("Variable pattern matched, matched: " + any)
  case 1     => println("1 matched")
  case 1.1   => println("1.1 matched")
  case 1.1f  => println("1.1f matched")
  case "42"  => println("'42' matched")
  case true  => println("true matched")
  case false => println("false matched")
  case ()    => println("() matched")
}