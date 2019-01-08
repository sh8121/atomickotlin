package summary21

import atomictest.eq

val intToRomanNumeralMap: Map<Int, String> = mapOf(
        Pair(1000, "M"),
        900 to "CM",
        Pair(500, "D"),
        Pair(400, "CD"),
        Pair(100, "C"),
        Pair(90, "XC"),
        Pair(50, "L"),
        Pair(40, "XL"),
        Pair(10, "X"),
        Pair(9, "IX"),
        Pair(5, "V"),
        Pair(4, "IV"),
        Pair(1, "I"))

fun convertToRoman(number: Int): String {
    var result = ""
    var remainder = number
    for((int, roman) in intToRomanNumeralMap){
        val times = remainder / int
        repeat(times) {
            result += roman
        }
        remainder %= int
    }
    return result
}

fun main(args: Array<String>) {
    convertToRoman(23) eq "XXIII"
    convertToRoman(44) eq "XLIV"
    convertToRoman(100) eq "C"
    convertToRoman(2018) eq "MMXVIII"
}