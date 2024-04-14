package main.kotlin.playground

import kotlin.math.E

data class Employee(val id: Int, val name: String) {

}

fun main() {
    var employee = Employee(1, "Julia").also {
        println(it)
    }

    val employee2 = Employee(2, "Adam")
    println(employee.equals(employee2))

    var employee3 = employee.copy()
    println(employee.equals(employee3))
}