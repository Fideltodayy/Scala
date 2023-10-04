object integerArguments{
  def main(args : Array[String]) = {
    var i = 0;
    var sum = 0;
    while(i < args.length){
      println(args(i))
      sum += Integer.parseInt(args(i))
      i += 1
    }
    println(sum)
  }
}
