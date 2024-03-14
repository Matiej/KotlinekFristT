import funamentals.NullNullableOverview
import funamentals.Primitivo

fun main(args: Array<String>) {
    println("Hello World!")
//    val superBascicFundamentals = SuperBascicFundamentals()
//    superBascicFundamentals.checkForMainArgs(args)
//    superBascicFundamentals.scannerExample()
//    VariablesOverview().variablesListening(3).also {
//        println(it)
//    }

    Primitivo().playGroundIntegerTypes()
    var myNumber: Int? = null
    NullNullableOverview().nonNullForcePlay(myNumber) // nullPointerException exception in purpose. Just to check

}