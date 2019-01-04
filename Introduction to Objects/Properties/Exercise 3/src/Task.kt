package properties3

class Counter {
    var value = 0

    private val counter = 10

    fun inc() {
        value += counter
    }

    fun dec() {
        value -= counter
    }
}