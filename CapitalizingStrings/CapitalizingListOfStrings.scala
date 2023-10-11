object CapitalizingListOfStrings{
  def main(args: Array[String])={
    val underscorenames = List("_adam", "_david", "_frank")
    val capNames = for (name <- underscorenames) yield {
      val nameWithoutUnderscore = name.drop(1)
      val capName = nameWithoutUnderscore.capitalize
    }
    val names = List("fidel", "otieno", "fideltodayy")
    val ucNames = for (name <- names) yield name.capitalize
    for (capname <- ucNames) println(capname)
    for (cname <- capNames) println(cname)
  }
}
