fun main() {
    val name: String? = "Hello"     //'?' to store the null value  "Safe Call ?."
    println("String length : ${name?.length}")
    name?.let { println("String length : ${name?.length}") }  // if name != null the file will executed "Safe call withlet ?.let{}

    var len = name?.length ?: -1  //if name != null give length of the name or give -1  "elvis ?:"
    println(len)

    println("String length : ${name!!.length}")  //if name == null throws an exception otherwise executed "Not-null assertion"
}