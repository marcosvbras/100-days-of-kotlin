/*
* [Day 014] Classes I
*
* The initializer, getter and setter are optional.
*
* */

class Smartphone {

    // Custom setter method
    var model: String? = null
        set(value) {
            field = value?.capitalize()
        }

    // Custom getter method
    var year: Int? = null
        get() {
            return if (field != null) field else 2018
        }
        private set

    init {
        this.year = 2016
    }
}