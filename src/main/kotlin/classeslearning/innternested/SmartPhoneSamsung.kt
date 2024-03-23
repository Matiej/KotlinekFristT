package main.kotlin.classeslearning.innternested

class SmartPhoneSamsung(var height: Double, var width: Double) {
    val caseThickness: Double = 2.1

    inner class Amoled {
        val lenghtA: Double = height - caseThickness
        val lenghtB: Double = width - caseThickness
        override fun toString(): String {
            return "Amoled(lenghtA=$lenghtA, lenghtB=$lenghtB)"
        }


    }
}

fun main() {
    var amoledX = SmartPhoneSamsung(100.0, 50.0).Amoled()
    println(amoledX)
}