package funamentals

class ConditionalsBas {
    fun ifers(value: Int) {
        if (value > 0) {
            println("more then 0")
        } else if (value < 0) {
            println("less then zero")
        } else {
            println("maybe zero")
        }

        var isEven: Boolean
        if (value % 2 == 0) {
            isEven = true
        } else {
            isEven = false
        }

        if (value % 2 == 0) isEven = true else isEven = false
        var isEvenKotlinStyle: Boolean = if (value % 2 == 0) true else false
        var isEvenKotlinStyleShorter: Boolean = value % 2 == 0

        isEven = if (value % 2 == 0) {
            println("something doing here")
            true
        } else {
            println("something else dooing here")
            false
        }
    }

    fun switchExample(mood: String): String {
        switchExample(100)
        return when (mood) {
            "one" -> "jeden"
            "two" -> "dwa"
            "three" -> "trzy"
            else -> "inne"
        }

    }

    fun switchExample(value: Int) {
        when (value) {
            0 -> println("zero")
            1 -> println("one")
            3 -> {
                println("it is my best number")
                println("three")
            }

            4, 5, 6 -> println("those I don't like")
            in 15..20 -> println("this is interesting")
            else -> println("unknown number")
        }

        var notification: String = when (value) {
            0 -> "zero"
            1 -> "one"
            2 -> "two"
            else -> "nothing"
        }

        var a = 1
        var b = 10

        var checkingValueInformation: String = when {
            a + b > value -> "a+b is more then value"
            a * b > value -> "a*b is less then value"
            else -> "I don't care value"
        }
    }

    fun elvisExample(name: String?) {
        var firstCapitalLetter: Char
        if(name != null) {
            firstCapitalLetter = name.first().uppercaseChar()
        } else {
            firstCapitalLetter = ' '
        }
        
        firstCapitalLetter = name?.first()?.uppercaseChar() ?: ' '
    }
}