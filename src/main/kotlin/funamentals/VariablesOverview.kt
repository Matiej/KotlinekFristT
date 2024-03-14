package funamentals

class VariablesOverview {
    fun variablesListening(ageParam: Int): String {
        println("age param you are using: $ageParam")
        val ageToModify = if (ageParam == 1) {
            1
        } else {
            2
        }
        var variableNoValue: Int
//        println(variableNoValue)
        var anotherValue = 11
        if(anotherValue is Int) {
            println("It is int")
        } else {
            println("It is not int")
        }

        return ageToModify.toString()
    }

}