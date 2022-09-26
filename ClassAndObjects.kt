fun main(){
    var obj = ClassAndObjects() //object creation for class
    println(obj.findEven(3))
    OuterClass.InnerClass().merge()
}
class ClassAndObjects {          // class
    fun findEven(a:Int)=(a%2==0)
}
 // nested class and inner class
class OuterClass{
     var first_name = "Ram"
    class InnerClass{
        var last_name = "Kumar"
        fun merge(){
            println("Hello")
        }
    }
}