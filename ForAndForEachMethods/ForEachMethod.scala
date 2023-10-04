object ForEachMethod{
  def main(args: Array[String]) ={
    val ratings = Map( "James" -> 40, "Jane" -> 50, "Joseph" -> 70)
    ratings.foreach {
      case(name, marks) => println(s"key: $name, value: $marks")
    }
  }
}
