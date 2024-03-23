package main.kotlin.classeslearning.myenums

fun main() {
    println(Seasons.SPRING)
    println(Seasons.SUMMER.ordinal)
    println(Seasons.AUTUMN.name)
    for (value in Seasons.values()) {
        println("Actual season is $value")
        println("Polish name is ${value.polishName}")
    }
    println()
    when(Seasons.getByName("WINTERsss")) {
        Seasons.SPRING -> println("It's spring")
        Seasons.SUMMER -> println("It's summer")
        Seasons.AUTUMN -> println("It's autumn")
        Seasons.WINTER -> println("It's winter")
        Seasons.OTHER -> println("It's other season")
    }
}