package summary2

fun reverseDecimal(number: Int): Int {
    var worker = number
    var result = 0
    while(worker > 0){
        val rest = worker % 10
        result = result * 10 + rest
        worker /= 10
    }
    return result
}

fun main(args: Array<String>) {
    println(reverseDecimal(1234))  // 4321
}