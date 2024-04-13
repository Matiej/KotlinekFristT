package main.kotlin.playground

fun main() {
    val name: String = "Ales"
    var result = if (name.length == 4) {
        println("name is 4 chars length")
        name
    } else {
        println("name is NOT 4 chars length")
        name
    }

    println("result : ${result}")

    var racePosition: Int = 3;

    val raceMedalJavaStyle = if(racePosition ==1 ) {
        "GOLD"
    } else if (racePosition ==2 ) {
        "SILVER"
    } else if (racePosition == 3) {
        "BROZNE"
    } else {
        "NO MEDAL"
    }
    println("Race medal with java style: ${raceMedalJavaStyle}")

    racePosition = 1
    val raceMedal = when (racePosition) {
        1 -> "GOLD" //simplest version if more code curly braces use

        2 -> {
            "SILVER"
        }
        3 -> {
            "BROZNE"
        }
        else -> {
            "NO MEDAL"
        }
    }

    println("Race medal with Kotlin when: ${raceMedal}")

}