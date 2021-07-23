package org.kotlinlang.play

import kotlin.math.absoluteValue

fun main() {
    println(addStringNumbers("One-two-three--banana-five-"))
    println(addStringNumbers(""))
    println(addStringNumbers("-&&-!=-//--"))
    println(addStringNumbers("#~#;|#<-#>#"))
    println(addStringNumbers("#+#-#*#"))
    println(addStringNumbers("%-%-$-$"))
    println(addStringNumbers("what else can-one;try"))
    println(addStringNumbers("nine-Eight-seven-Six-five-Four-three"))
}

//addStringNumbers()
//input:    String: written out numbers from 0-9 separated by '-,; '
//return:   String: numbers as Int-String and their sum, separated by '+' and '='
//          addStringNumbers("one-two-tree") returns "1+2+3=6"
fun addStringNumbers(stringNumbers: String): String{
    val numbersMap = mapOf(
        "zero" to 0,
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9)
        .withDefault { 0 }

    var s: String = ""
    var sum: Int = 0

    for(stringNumber: String in stringNumbers.toLowerCase().split('-',',',' ',';')){
        var intNumber: Int = numbersMap.getValue(stringNumber)
        s += "$intNumber+"
        sum += intNumber
    }

    return s.substring(startIndex = 0, endIndex = s.length-1) + "=" + sum.toString()
}
