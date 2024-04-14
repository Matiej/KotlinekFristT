package main.kotlin.playground

class Worker
    (
    val name: String = "",
    val age: Int = 0,
) {
    var email: String = ""

    constructor(
        _email: String,
        _name: String = "",
        _age: Int = 0,
    ) : this(_name, _age) {
        email = _email
    }

    fun action() {
        println("Person Walks")
    }
}


fun main() {
    val worker = Worker("Alex", 25)
    worker.action()
    println("Name : ${worker.name} and the age is ${worker.age}")

    val person1 = Worker()
    println("Name : ${person1.name} and the age is ${person1.age}")

    val person2 = Worker(_email = "abc@gmail.com", "Alex", 25)

    println(
        "Name : ${person2.name} and the age is ${person2.age} and the email is " +
                "${person2.email}"
    )
}
