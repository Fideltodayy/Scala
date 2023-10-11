object stringArgs {
  def main(args : Array[String]) = {
    println("Hello, " + args(0) + "!")
    var i = 0;
    while (i < args.length ){
    println(args(i))
    i+=1;
    }
  }
}
