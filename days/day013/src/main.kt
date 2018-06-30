/*
* [Day 013] Creating Functions III - Local Functions
*
* */

fun main(args: Array<String>) {
    var number = 5

    println(doSomething(5)) // 6
}

fun doSomething(number: Int) : Int {
    fun isOdd(number: Int) : Boolean = number%2 == 1
    if(isOdd(5)) return number + 1 else return number + 2
}