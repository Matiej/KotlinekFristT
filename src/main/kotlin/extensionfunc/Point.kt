package extensionfunc

class Point(var x: Int, var y: Int) {

    operator fun plus(other: Point): Point {
        return Point(this.x + other.x, this.y + other.y)
    }

    infix fun minus(other: Point): Point {
        return Point(this.x - other.x, this.y - other.y)
    }

    operator fun compareTo(other: Point): Int {
        if (this.x != other.x) {
            return this.x - other.x
        } else {
            return this.y - other.y
        }
    }

    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }


}