package creatingClasses2

fun isPalIgnoreCase(s: SimpleString): Boolean {
    for(i in 0..(s.length() - 1)){
        if(s.get(i).toLowerCase() != s.get(s.length() - 1 - i).toLowerCase()){
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    println(isPalIgnoreCase(SimpleString("Mom")))
}
/* Output:
true
*/