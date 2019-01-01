package theinKeyword4



fun isValidIdentifier(s: String): Boolean {
    if(s.isEmpty()){
        return false
    }
    if(s[0] != '_' && s[0] !in 'a'..'z' && s[0] !in 'A'..'Z'){
        return false
    }
    for(c in s){
        if(c != '_' && c !in 'a'..'z' && c !in 'A'..'Z' && c !in '0'..'9'){
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))  // true
    println(isValidIdentifier("0name"))  // false
}