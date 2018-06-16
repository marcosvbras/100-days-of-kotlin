/*
* [Day 008] String Methods II: Indexes, Substrings and Replace
*
* */

fun main(args: Array<String>) {

    var movie = "Pirates of the Caribbean"

    // Java ChatAt equivalent
    println(movie.get(0)) // P

    // Getting the last index
    println(movie.lastIndex) // 23

    // Java Substring equivalent
    println(movie.subSequence(0, 7)) // Pirates

    // Drop the number of letters specified at the beginning of the String
    println(movie.drop(2)) // rates of the Caribbean

    // Drop the number of letters specified at the end of the String
    println(movie.dropLast(2)) // Pirates of the Caribbe

    // Getting the first letter
    println(movie.first()) // P

    // Getting the last letter
    println(movie.last()) // n

    // Java indexOf equivalent
    println(movie.indexOf("P")) // 0

    // Java replace equivalent
    println(movie.replace("Pirates", "Jedis")) // Jedis of the Caribbean

}