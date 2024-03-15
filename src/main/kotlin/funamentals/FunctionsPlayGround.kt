package funamentals

import kotlin.math.sqrt

class FunctionsPlayGround {

    fun publicOne() {
        testFunction(secondParam = 3, firstParam = 2)
        //it is possible to change order for params in function.

        defaultValTestFunction()
        println(calculateBallSpeed(3.1))
    }

    fun singleExpr(a: Int, b: Int): Int = a*b
    fun isAdult(age: Int):Boolean = age >= 18

    private fun testFunction(firstParam: Int, secondParam: Int) {
        println(firstParam)
        println(secondParam)
    }

    private fun defaultValTestFunction(textParam: String = "default param value") {
        println(textParam)
    }

    private fun calculateBallSpeed(high: Double, gravity: Double = 10.0): Double {
        return sqrt(2 * high * gravity)
    }
}