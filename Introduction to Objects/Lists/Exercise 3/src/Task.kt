package lists3

import atomictest.eq

fun checkAnagrams(s1: String, s2: String): Boolean {
    var s1List = s1.toList()
    var s2List = s2.toList()
    s1List = s1List.sorted()
    s2List = s2List.sorted()
    return s1List == s2List
}

fun main(args: Array<String>) {
    checkAnagrams("thing", "night") eq true
    checkAnagrams("leader", "dealer") eq true
    checkAnagrams("sector", "escort") eq true
    checkAnagrams("tablet", "battle") eq true
    checkAnagrams("friend", "finder") eq true
    checkAnagrams("senator", "treason") eq true
    checkAnagrams("terrain", "trainer") eq true
    checkAnagrams("teaching", "cheating") eq true

    checkAnagrams("pots", "stops") eq false
    checkAnagrams("escort", "sectors") eq false
    checkAnagrams("sections", "notices") eq false
}