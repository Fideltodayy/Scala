class Point(xc: Int, yc: Int) {
    var x: Int = xc
    var y: Int = yc
    def move(dx: Int, dy: Int) ={
        x = x + dx
        y = y + dy
        println ("Point x location : " + x);
        println ("Point y location : " + y);
    }
}
//The driver class
object workingWithAClass {
    def main(args: Array[String]) ={
        val pt = new Point(10, 20); //Instantiating an object
        // Move to a new location
        pt.move(10, 10);
    }
}