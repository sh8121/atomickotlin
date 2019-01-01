package summary1

fun countDigits(number: Int, digit: Int): Int {
    var worker = number
    var occurrences = 0
    while (worker > 0) {
        val rest = worker % 10
        if(rest == digit)
            occurrences++
        worker /= 10
    }
    return occurrences
}

fun main(args: Array<String>) {
    println(countDigits(764241, 4)) // 2
}