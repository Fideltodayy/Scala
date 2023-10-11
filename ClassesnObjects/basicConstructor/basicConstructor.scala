class Person(var firstName: String, var lastName: String);

object basicConstructor {
    def main(args: Array[String]) ={
        val p = new Person("Bill", "Panner");
        println(p.firstName + " " + p.lastName);
        p.firstName = "William";
        p.lastName = "Bernheim";
        println(p.firstName + " " + p.lastName);

    }
}