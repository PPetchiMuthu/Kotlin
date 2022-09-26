fun main() {
    val number = listOf(-2, 3, 0, 1, 2)
    print(number.filter(::isPositive))
}

fun isPositive(x: Int) = x > 0