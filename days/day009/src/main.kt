/*
* [Day 009] String Methods III - String Checks
*
* */

fun main(args: Array<String>) {

    var text1 = ""
    var text2 = " "
    var text3 = "I want to move to Ireland"
    var text4: String? = null

    println(text3.contains("Want", true)) // true

    println(text1.isBlank()) // true

    println(text2.isBlank()) // true

    println(text1.isEmpty()) // true

    println(text2.isEmpty()) // false

    println(text1.isNotBlank()) // false

    println(text2.isNotEmpty()) // true

    println(text4.isNullOrBlank()) // true

}