package main.kotlin.playground

class Range {
}

fun main() {
    val range = 1..10
    for (i in range) {
        println("i: $i")
    }
    println()
    for (i in 0..10) {
        println("Element in loop no: $i")
    }
    println()

    val reverseRange = 10 downTo 1
    for (i in reverseRange) {
        println("reverseRange i: $i")
    }

    println()
    for (i in reverseRange step 2) {
        println("reverseRange with step 2 -i: $i")
    }

    var i: Int = 0
    while (i <= 4) {
        println("while loop, element no: $i")
        i++
    }

    println()
    var j: Int = 0
    do {
        println("do-while loop, element no: $j")
        j++
    } while (j <= 4)

    var x: Int = 1
    while (x <= 5) {
        println("Value of X is : $x")
        x++
    }
}