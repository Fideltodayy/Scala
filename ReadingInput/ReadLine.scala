//we are using the readLine method from the scala.io.StdIn package hence we need to import it like shown below

import scala.io.StdIn.readLine
object ReadLine extends App {
    val firstName = readLine("Enter your First Name: ");
    val lastName = readLine("Enter your Last Name: ");

    println(s"Hello $firstName $lastName");
}