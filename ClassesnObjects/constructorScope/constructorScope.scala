class Person(var firstName: String, var lastName: String) {
    println("the constructor begins")
    // 'public' access by default
    var age = 0
    
    // some class fields
    private val HOME = System.getProperty("user.home")
    // some methods
    override def toString(): String = s"$firstName $lastName is $age years old"
    def printHome(): Unit = println(s"HOME = $HOME")
    def printFullName(): Unit = println(this)
    printHome()
    printFullName()
    println("you've reached the end of the constructor")
}

object constructorScope {
    def main(args: Array[String]) ={
        val p = new Person("Ryan", "Kaleli");
        println(p.age);
        p.age = 36;
        println(p.age);
        val f = new Person("Fidel", "Otieno");

    }
}