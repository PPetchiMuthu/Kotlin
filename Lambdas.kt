fun main(){
    val myFun:(Int, Int) ->Int = { a, b -> a+b } //lambdas is just a function with no name
    addTwoNum(8,4,myFun)
}
fun addTwoNum(a:Int,b:Int,myFun:(Int, Int) ->Int) {   //high level functions
    var result = myFun(a,b)
    println(result)
}