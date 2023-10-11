import java.util.Date
object PartiallyAppliedFunctions {
    def main(args: Array[String]) = {
        //Creating a date object
        val date = new Date; 
        log(date, "message1" )
        //Sleeping for 1000 milliseconds
        Thread.sleep(1000) 
        log(date, "message2" )
        Thread.sleep(1000)
        log(date, "message3" )
    }
    //A function that recieves a message and the date and logs the msg
    def log(date: Date, message: String) = {
    println(date.toString() + "----" + message)
    }
}