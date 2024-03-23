package main.kotlin.classeslearning.zoo

class Cat(name: String, age: Int, owner: String): Pet(name, age, owner), PetGames {
    private val catSound: String = "Meow"

    override fun sound(): String {
        return catSound
    }

    override fun makeSound() {
        println("Cat name '$name' made a sound: $catSound")
    }

    override fun play() {
        println("Cat name '$name' is playing")
    }

    override fun sleep() {
        println("Cat name '$name' is sleeping with an owner '$owner'")
    }

    override fun eat() {
        println("$age years old named '$name' is eating")
    }
}