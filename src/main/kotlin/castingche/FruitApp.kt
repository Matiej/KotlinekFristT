package main.kotlin.castingche

fun main() {
    var lemon = Lemon()
    checkFruitTaste(lemon)
}

fun checkFruitTaste(fruit: Fruit) {
    if(fruit is Apple) {
        println("Checking Apple")
        println(fruit.checkTaste())
    } else if(fruit is Lemon) {
        println("Checking Lemon")
        println(fruit.checkTaste())
    }

    var value = "Hello"
    checkVariable(value)

    var fruit = Apple()
    checkVariable(fruit)

    var doub = 10.0
    checkVariable(doub)

    println()
    whenCHeckVariable(value)
    println()
    castMyValue(10)
    castMyValue(null)
    castMyValue("Hello")
}

fun castMyValue(value: Any?) {
//   var number: Int? = value as Int?
    //when add ? after Int, it will be Int? which is nullable
    // when add ? after as keyword, it will be as? which is safe cast
   var number: Int? = value as? Int
    println("Casting success, value is number: $number")
}

fun checkVariable(value: Any) {
    if(value is Fruit) {
        value.checkTaste()
    } else if(value is String) {
        println("This is a string: $value")
    } else if(value is Int) {
        println("This is an integer: $value")
    } else {
        println("This is something else: $value")
    }
}

fun whenCHeckVariable(value: Any) {
    when(value) {
        is Fruit -> value.checkTaste()
        is String -> println("This is a string: $value")
        is Int -> println("This is an integer: $value")
        else -> println("This is something else: $value")
    }
}