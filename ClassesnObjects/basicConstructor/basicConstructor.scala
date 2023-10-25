class Person(var firstName: String, var lastName: String);

object basicConstructor {
    def main(args: Array[String]) ={
        val p = new Person("Fidel", "Otieno");
        println(p.firstName + " " + p.lastName);
        p.firstName = "Fid";
        p.lastName = "Toadyy";
        println(p.firstName + " " + p.lastName);

    }
}