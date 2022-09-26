fun main() {
    val a = 2
    when (a) {
        1 -> println("Case 1 is printed")
        2 -> println("Case 2 is printed")
        else -> println("Invalid")
    }
    when (a) {
        in 1..20 -> println("a is within the 1 to 20 ")  //first check the first case then goto the next case
        2 -> println("Case 2 is printed")           //this is case is not excuted
        else -> println("Invalid")
    }
}