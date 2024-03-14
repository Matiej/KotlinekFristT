package funamentals

class RelationalOperators {

    fun operators() {
        var a = 4
        var b = 5

        var check1: Boolean = a == b
        var check2: Boolean = a > b
        //etc like in java

        var isValueBetweenAB = 4 in a..b

        var isValueNotBetweenAB = 4 !in a..b
    }

    fun multipleOperators() {
        var age: Int = 33
        var isValidAge: Boolean = (18 <= age && age <= 70)
        var isValidAgeKotlinWay: Boolean = (18 <= age) and (age <= 70)
        var isValidKotlinAge: Boolean = (age in 18..79)
        var isOrValid: Boolean = (age <= 30 || 50 <= age)

        //this is something new
        var isNice: Boolean = true;
        var isSmart: Boolean = true;
        var result: Boolean = isNice and isSmart;
        var resultJavaStyle: Boolean = isNice && isSmart;

        var halfResult: Boolean = isNice or isSmart
        var halfResultJavaStyle: Boolean = isNice || isSmart

    }

    fun arithmeticOperators() {
        var a = 24
        var b = 12
        var result: Int

        result = a + b
        result = a.plus(b)
        result = a - b
        result = a.minus(b)
        result = a * b
        result = a.times(b)
        result = a / b
        result = a.div(b)
        result = a % b
        result = a.mod(b)

    }
}