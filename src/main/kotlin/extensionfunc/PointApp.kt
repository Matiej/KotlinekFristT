package extensionfunc

fun main() {
    val point1 = Point(1, 6)
    val point2 = Point(3, 2)
    val point3 = point1+point2
    println(point1 > point3)

    val point4 = Point(3, 2)
    val resultPoint = point4 minus point1
    println(resultPoint)
}