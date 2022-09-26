fun main() {
    val a = 10
    val b = 20
    printSum(a, b)
    println(sum(a, b))

}

//without return type
fun printSum(a: Int, b: Int) {
    println(a + b)
}

//with return type
fun sum(a: Int, b: Int): Int {
    return a + b
}
//we can write this function in single line
//fun sum(a: Int, b: Int) =  a + b
