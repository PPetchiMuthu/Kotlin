// we can give default arguments in a function

fun add(a: Int, b: Int = 10, c: Int = 10): Int {
    return a + b + c
}

fun main() {
    println(add(10))
    println(add(10, 20))
    println(add(10, 20, 30))
    println(add(a = 10, c = 30))
    //  println(add(b=20,c=30))  its give error 

}