/*
* [Day 012] Creating Functions II - Infix
*
* */

fun main(args: Array<String>) {

    println(2.concat(1)) // 21
        // or
    println(2 concat 1) // 21

    println((5 > 4) and (4 > 2)) // true

    println((6 > 10) or (5 > 6)) // false

}

infix fun Int.concat(number: Int) : String = this.toString() + number.toString()

infix fun Boolean.and(anotherBoolean: Boolean) : Boolean = this && anotherBoolean

infix fun Boolean.or(anotherBoolean: Boolean) : Boolean = this || anotherBoolean