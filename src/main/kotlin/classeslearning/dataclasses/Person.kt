package main.kotlin.classeslearning.dataclasses

data class Person(var name:String, var lastname: String) {
    //using data class, we don't need to override toString() method
    // we don't need to override equals() method
    // we don't need to override hashCode() method
    // need to have primary constructor, and at least one parameter

}

fun main() {
    val person1 = Person("John", "Doe")
    val person2 = Person("John", "Doe")

    println(person1)
    println(person2.equals(person1))
    println(person1 == person2)

}