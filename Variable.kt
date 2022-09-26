//we can declare variable at top level
val i = 10      //read only variable only once can assign
var j = 20      // it can be reassigned

fun changeVariable() {
    j = j + 1
//    i = i + 1      it cannot be changed once assign
}

fun main() {
    println("i = $i \nj = $j")
    changeVariable()
    println("i = $i \nj = $j")
}