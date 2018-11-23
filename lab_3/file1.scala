package utils

object PasswdGen {
  private val allowedChars = (('0' to '9') ++ ('A' to 'Z') ++ ('a' to 'z')).toArray ++ Array('$', '-', '.', '_')
  private val allowedCharsLength = allowedChars.length

  def nextChar = {
    allowedChars(util.Random.nextInt(allowedCharsLength))
  }
  def nextPasswd(passwdLen: Int) = {
    val passwd = new StringBuilder(passwdLen)
    for (i <- 0 until passwdLen) passwd += nextChar
    passwd.toString
  }
}