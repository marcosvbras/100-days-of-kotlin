/*
* [Day 014] Classes I
*
* The initializer, getter and setter are optional.
*
* */

class Cat(var name: String) {

    // Initializer block. You can have how many you want
    init {
        name = name.decapitalize()
    }

    // Another one...
    init {
        name = name.toUpperCase()
    }

    // Another one...
    init {
        name = name.toLowerCase()
    }

    // And another one...
    init {
        name = name.capitalize()
    }
}