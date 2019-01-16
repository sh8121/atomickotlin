package namedandDefaultArguments3

import atomictest.eq

fun foo(int: Int, string: String, d: Double) = "(i = $int, s = $string)"

fun bar(i: Int, s: String, d: Double) = "(i = $i, s = $s)"

fun main(args: Array<String>) {
    foo(int = 1, string = "abc", d = 1.0) eq "(i = 1, s = abc)"
    foo(2, "def", 1.0) eq "(i = 2, s = def)"
}