/*
* [Day 011] Creating Functions I
*
* */

fun main(args: Array<String>) {

    saySomething() // Nothing good ever happens after 2 am.

    println(getSomeCoolSentence()) // Have you met Ted?

    println(getCapitalized("marcos")) // Marcos

    println(getFirstLettersUpper(5, "legendary")) // LEGEN

    sayAnotherThing(adjective = "amazing") // Kotlin is amazing!!!

    doSomething { println("Damn, pass functions as arguments is awesome ") } // Damn, pass functions as arguments is awesome

    passingSomethingThatCouldBeNull(null) // Something is null

}

// A basic function
fun saySomething() {
    println("Nothing good ever happens after 2 am.")
}

// Function that returns something
fun getSomeCoolSentence() : String {
    return "Have you met Ted?"
}

// One line function
fun getCapitalized(name: String) = name.capitalize()

// Taking parameters
fun getFirstLettersUpper(amount: Int, text: String) : String {
    return text.substring(0, amount).toUpperCase()
}

// Using default parameters
fun sayAnotherThing(language: String = "Kotlin", adjective: String = "awesome") {
    println("$language is $adjective!!!")
}

// Passing functions
fun doSomething(action: () -> Unit) {
    action()
}

// Passing null arguments
fun passingSomethingThatCouldBeNull(something: String?) {
    if (something == null)
        println("Something is null")
    else
        println("Something is not null")
}