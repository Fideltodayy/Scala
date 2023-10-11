object StringInterpolation {
    def main( args: Array[String]) = {
        val firstName = "Fidel";
        val middleName= "Otieno";
        val lastName = "Onyango"

        println(s"$firstName $middleName $lastName");
        println( firstName + " " + middleName + " " + lastName);
        println(s" Name: ${firstName} ${middleName} ${lastName} ");
        println(s"1 + 1 = ${ 1+1}");

    }
}