package sets1

import atomictest.eq

val meats = setOf("beef", "chicken")
val fruits = setOf("apple", "orange", "banana", "kiwi")
val vegetables = setOf("beans", "peas", "carrots", "sweet potatoes", "asparagus", "spinach")

private fun getPercent(productCart: Set<String>, groceryCart: Set<String>) =
    100.0 * (productCart intersect groceryCart).size / groceryCart.size
fun percentMeat(groceryCart: Set<String>): Double =  getPercent(meats, groceryCart)
fun percentFruit(groceryCart: Set<String>): Double = getPercent(fruits, groceryCart)
fun percentVeggies(groceryCart: Set<String>): Double = getPercent(vegetables, groceryCart)
fun percentOther(groceryCart: Set<String>): Double = getPercent(groceryCart - meats - fruits - vegetables, groceryCart)

fun main(args: Array<String>) {
    val groceryCart = setOf("apple", "pretzels", "bread", "orange", "beef",
            "beans", "asparagus", "sweet potatoes", "spinach", "carrots")

    percentMeat(groceryCart) eq 10.0
    percentFruit(groceryCart) eq 20.0
    percentVeggies(groceryCart) eq 50.0
    percentOther(groceryCart) eq 20.0
}