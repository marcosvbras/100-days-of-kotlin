/*
* [Day 007] String Methods I
*
* */

fun main(args: Array<String>) {

    var sentence1 = "Marcos is an amazing developer"
    var sentence2 = "There's a problem with the horizon: There's no horizon."
    var place = "Coruscant"
    var fruit = "strawberry"

    /*
    *
    * All methods below does not change the variable value
    *
    * */

    // String length
    println(sentence1.length) // 30

    // ChatAt equivalent
    println(sentence1.get(0)) // M

    // Comparing two Strings
    println(sentence1.equals(sentence2)) // false

    // Upper case
    println(place.toUpperCase()) // CORUSCANT

    // Lower case
    println(place.toLowerCase()) // coruscant

    // Capitalize
    println(fruit.capitalize()) // Strawberry

    // Decapitalize
    println(place.decapitalize()) // coruscant

    // Starts with
    println(sentence1.startsWith("Marcos")) // true

    // Ends with
    println(sentence2.endsWith("HORIZON.", true)) // true

    // Concat
    println(fruit.plus(" and apple")) // strawberry and apple

}