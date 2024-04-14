package main.kotlin.playground

class PlayGround(
    val name: String, val size2Meters: Int) {

    fun showPlayGroundData() {
        println("Play ground name: $name, size of ground is: $size2Meters")
    }
}

fun main() {
    val plground = PlayGround( size2Meters = 700, name = "Izabelin")
    plground.showPlayGroundData()
}