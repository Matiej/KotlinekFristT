package main.kotlin.classeslearning.zoo

abstract class Pet(var name: String, var age: Int, var owner: String) {

    abstract fun sound():String
    abstract fun makeSound()
    fun printInfo() {
        println("Pet bame: $name, Age: $age, Owner: $owner")
    }
}