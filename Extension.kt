class Extension {
    fun oddOrEven(a: Int) = if (a % 2 == 0) "Even" else "Odd"
}

fun Extension.displlay(result:String){
    println("Given Number is $result")
}


fun main() {
    val obj = Extension()
    val result = obj.oddOrEven(6)
    obj.displlay(result)
}


