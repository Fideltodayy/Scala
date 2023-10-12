 //Class Marks which contains the marks a student can get in a unit
class Marks(val CAT1: Int, val CAT2: Int, val EXAM: Int) {
    val cat1=CAT1;
    val cat2=CAT1;
    val exam=EXAM;
}
//Class Subject inherits class Marks
class Subject(override val CAT1: Int,override val CAT2: Int,override val EXAM: Int,var code: String,var name: String) extends Marks(CAT1,CAT2,EXAM){
    val sname=name;
    val scode=code;
    def result() ={
        var tcat=cat1+cat2
        var sum=cat1+cat2+exam
        val grd=if( sum >= 70 )"A" else if( sum >= 60 )"B" else if( sum >= 50 )"C" else if( sum >= 40 )"D" else "F"
        println(scode + "\t");
        //Printing the results
        println(sname + "\t");
        println(cat1 + "\t");
        println(cat2 + "\t");
        println(tcat + "\t");
        println(exam + "\t");
        println(sum + "\t");
        println(grd);
    }//End of rsult
    }//End of Subject class
// The main Class. Take note of the use of scala asInstanceOf[Int] method to cast the doulble into an Int
object InheritanceExample2 {
    def main(args: Array[String]) ={
        val c1=scala.math.ceil(Math.random()*10).asInstanceOf[Int]
        val c2=scala.math.ceil(Math.random()*20).asInstanceOf[Int]
        val ex=scala.math.ceil(scala.math.random()*70).asInstanceOf[Int]
        val subj = new Subject(c1, c2, ex,"CMT201","OOP");

        subj.result();
    }
}