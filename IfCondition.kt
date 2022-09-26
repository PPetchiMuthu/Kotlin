fun minValue(a: Int, b: Int): Int {
    if (a < b)
        return a
    else
        return b
}

//we can write this function in single line
fun minVal(a: Int, b: Int) = if (a < b) a else b

fun main(args: Array<String>) {
    val a = 10
    val b = 20
    println(minVal(a, b))
    println(minValue(a, b))
}