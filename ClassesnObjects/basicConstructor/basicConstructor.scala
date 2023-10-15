class Person(var firstName: String, var lastName: String);

object basicConstructor {
    def main(args: Array[String]) ={
        val p = new Person("Fidel", "Otieno");
        println(p.firstName + " " + p.lastName);
        p.firstName = "Fidel";
        p.lastName = "Toadyy";
        println(p.firstName + " " + p.lastName);

    }
}