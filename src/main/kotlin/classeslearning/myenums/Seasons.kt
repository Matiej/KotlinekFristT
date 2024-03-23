package main.kotlin.classeslearning.myenums

enum class Seasons(val polishName: String) {
    SPRING("Wiosna"),
    SUMMER("Lato"),
    AUTUMN("Jesień"),
    WINTER("Zima"),
    OTHER("Inna");

    companion object {
        fun getByName(seasonName: String): Seasons {
            return try {
                Seasons.valueOf(seasonName)
            } catch (e: IllegalArgumentException) {
                println("There is no such season")
                OTHER
            }
        }
    }
}