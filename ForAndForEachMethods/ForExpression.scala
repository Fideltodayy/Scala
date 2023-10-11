object ForExpression{
  def main(args: Array[String]) ={
    val nums = Seq(1,2,3);
    val doubledNums = for (n <- nums) yield n * 2;
    for (num <- doubledNums) println(num)
  }
}
