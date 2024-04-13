package main.kotlin.playground

class LoopsTr {
}

fun main() {
    outerLoop@ for (i in 1..10) {
        println("outerloop break, i: $i")
        innerLoop@ for (j in 1..4) {
            println("innterloop break j: $j")
            if (j == 2) break@outerLoop
        }
    }
    println("End program with break ")

    outerLoop@ for (i in 1..10) {
        println("outerloop continue, i: $i")
        innerLoop@ for (j in 1..4) {
            println("innterloop continue j: $j")
            if (j == 2) continue@outerLoop
        }
    }
    println("End program with continue ")

    outerLoop@ for (i in 1..10) {
        println("outerloop return, i: $i")
        innerLoop@ for (j in 1..4) {
            println("innerloop return j: $j")
            if (j == 2) return
        }
    }

    println("End program with return - this shouldnt print. Return is return ")

}