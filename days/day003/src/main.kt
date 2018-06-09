/*
* [Day 003] Nullable variables
*
* */

fun main(args: Array<String>) {

    /*
    * By default, Kotlin variables can't be null, you need to assign some
    * value to it.
    *
    * If you want to create a nullable variable, use the operator "?".
    *
    * */

    // Creating a nullable variable
    var email: String?

    email = "foo@bar.com"
    println(email) // foo@bar.com

    email = null
    println(email) // null

    // Preventing null errors
    println(email?.length) // null
}