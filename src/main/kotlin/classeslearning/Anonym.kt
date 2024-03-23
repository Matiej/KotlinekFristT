package main.kotlin.classeslearning

import main.kotlin.classeslearning.zoo.Pet

fun main() {
    //anonymous class, no need to create a new file
    // anonymous class is a class that is defined without a name
    // anonymous class is used to override the properties and methods of a class
    // anonymous class can must be created by using an object keyword
    // anonymous class can implement an interface or extend a class
    val dog = object : Pet("Burek", 5, "John") {
        private val dogSound: String = "Bark"

        override fun sound(): String {
            return dogSound
        }

        override fun makeSound() {
            println("$name made a sound: $dogSound")
        }
    }

    dog.makeSound()
}