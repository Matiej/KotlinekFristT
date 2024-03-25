package extensionfunc

fun main() {
    var wall = Wall()
    wall.paint()
    wall.destroy()
    val myText: String = "blabla"
    println(myText.removeFirstLetter())
}

fun Wall.destroy() {
    println("demolish")
}

fun String.removeFirstLetter(): String {
    return this.substring(1)
}