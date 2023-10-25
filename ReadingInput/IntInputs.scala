//we are using the readInt method from the scala.io.StdIn package hence we need to import it like shown below
import scala.io.StdIn.readInt

object IntInputs extends App {
    println("Integer inputs");
    println("Sum of values : " + totalMarks1());
}

//A function to read from the keyboard
def totalMarks1(a: Int = readInt(),b:Int = readInt(),c: Int = readInt()) = a+b+c;

// A function to generate the marks randomly

// def totalMarks(a: Int = (Math.ceil(Math.random()* 10 )), b:Int = (Math.ceil(Math.random()*20)), c:Int = (Math.ceil(Math.random()* 70 )) ) : Int = a + b + c;