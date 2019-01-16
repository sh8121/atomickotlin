// Overloading/WithoutDefaultArguments.kt
package withoutdefaultarguments
import atomictest.eq

fun f(n: Int) = n + 373
fun f() = f(0)

class Number(val value: Int): Comparable<Number>{
  override fun compareTo(other: Number): Int =
          when {
            value > other.value -> 1
            value == other.value -> 0
            else -> -1
          }
}

fun main(args: Array<String>) {
  f() eq 373
    var v1 = args[0].toInt()
    var v2 = args[1].toInt()
    v1 < v2
  Number(1) < Number(2)
}