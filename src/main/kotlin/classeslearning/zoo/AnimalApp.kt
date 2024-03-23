package main.kotlin.classeslearning.zoo

fun main() {
    val dog = Dog("Burek", 5, "John")
    val cat = Cat("Mruczek", 3, "Anna")

    dog.makeSound()
    dog.printInfo()

    cat.makeSound()
    cat.printInfo()
    println()
    cat.eat()
    cat.play()
    cat.sleep()

}