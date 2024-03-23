package main.kotlin.classeslearning.zoo

class Dog(name: String, age: Int, owner: String) : Pet(name, age, owner) {
    private val dogSound: String = "Bark"

    override fun sound(): String {
        return dogSound
    }

    override fun makeSound() {
        println("$name made a sound: $dogSound")
    }

}
