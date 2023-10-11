import java.util.Date
  object PartiallyBoundedFunctions {
    def main(args: Array[String]) = {
      val date = new Date
      // Note the magic of the underscore
      val logWithDateBound = log(date, _ : String)
      // First call to the function
      logWithDateBound("message1" )
      Thread.sleep(1000)
      // Second call to the function
      logWithDateBound("message2" )
      Thread.sleep(1000)
      // Third call to the function
      logWithDateBound("message3" )
    }
    def log(date: Date, message: String) = {
    println(date.toString() + "----" + message)
    }
}
