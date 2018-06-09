/*
* [Day 002] Defining variables
*
* */


fun main(args: Array<String>) {

    // Creating a variable without tell the type and initializing it
    var age = 21
    println(age) // 21

    // Creating an Int variable without initialize
    var year: Int
    year = 2018
    println(year) // 2018

    // Creating a String variable and initializing it
    var name: String = "Marcos"
    println(name) // Marcos

    /*
    * The variables above are mutable. You can assign other values whenever you want.
    *
    * The variables below are immutable. You cannot assign values after the first assignment.
    *
    * */

    val planet = "Tatooine"
    println(planet) // Tatooine

}