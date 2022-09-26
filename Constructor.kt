//primary constructor only for initialise the value
class Constructor (val name:String){

}
fun main (){
    val obj = Constructor("varun")
    println(obj.name)
    val objt = Construct()
    println(objt.name)
}

//primary constructor with init block
class Construct(){
    lateinit var name: String
    init {
        name = "varun"
    }
}