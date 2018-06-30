/*
* [Day 014] Classes I
*
* The initializer, getter and setter are optional.
*
* */

fun main(args: Array<String>) {

    // Class without accessible attributes
    val person = Person("Marcos")


    // Class with accessible attributes
    val cat = Cat("hikari")
    println(cat.name) // Hikari

    cat.name = "AYAME"
    println(cat.name) // AYAME


    // Class with accessible attributes not defined in the constructor
    val dog = Dog("Haru")
    dog.age = 5
    println(dog.name) // Haru
    println(dog.age) // 5
    println(dog.owner) // Marcos


    // Class with a secondary constructor
    val fish = Fish("Nemo", "orange/white")
    println(fish.name) // Nemo


    // Class with custom getters and setters
    val smartphone = Smartphone()
    smartphone.model = "iphone"
    println(smartphone.model) // Iphone
    println(smartphone.year) // 2016
}