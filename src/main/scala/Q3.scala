object Q3 {

  def toUpper(text: String): String = text.toUpperCase()
  def toLower(text: String): String = text.toLowerCase()


  def formatNames(name: String)(letter: Int*)(changeLetter: String => String): String = {
    var out = ""
    if(letter.isEmpty){
      out = changeLetter(name)
    }
    else {
      var i = 0
      while (i < name.length()) {
        if (letter.contains(i)) out = out + changeLetter(name.charAt(i).toString)
        else out = out + name.charAt(i).toString
        i = i + 1
      }
    }
    out
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")()(toUpper))
    println(formatNames("Niroshan")(0,1)(toUpper))
    println(formatNames("Saman")()(toLower))
    println(formatNames("Kumara")(5)(toUpper))
  }
}
