/*
* [Day 010] Using conditions
*
* */

fun main(args: Array<String>) {

    var name = "Marcos"
    var needUpcase = true
    var needCapitalize = true

    // If you have just one line, you can put at the same line of the condition
    if (needUpcase) println(name.toUpperCase()) // MARCOS

    // You can use as an expression
    name = if (needUpcase) name.toUpperCase() else name.toLowerCase()
    println(name) // MARCOS

    // You can use as an expression block if you have more than 1 line
    val capitalized = if (needCapitalize) {
        name = "vinicius"
        name.capitalize()
    } else {
        name = "Han Solo"
        name.decapitalize()
    }

    println(capitalized) // Vinicius
}