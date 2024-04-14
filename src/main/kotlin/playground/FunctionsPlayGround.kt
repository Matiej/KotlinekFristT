package main.kotlin.playground

const val nameLikeAStaticInJava = "Kotlin programming"

fun topLevelFun(): Int {
    return (0.. 100).random()
}

fun main() {
    println("top level function result: ${topLevelFun()}")
}