fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (a in arr)  // to print the all element in array
        print(a)
    println()
    for (index in arr.indices) print(arr[index])
}