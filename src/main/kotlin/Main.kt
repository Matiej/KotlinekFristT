import funamentals.FunctionsPlayGround
import funamentals.LoopsExamples
import funamentals.Primitivo
import funamentals.StringExamplesCases

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
    // nullPointerException exception in purpose. Just to check
//    NullNullableOverview().nonNullForcePlay(myNumber)
    LoopsExamples().loopsTrainings()
    LoopsExamples().whileLoopExamples()
    LoopsExamples().loopArray(intArrayOf(5, 33, 12, 191, -6))
    StringExamplesCases().playGroundForString()
    println()
    FunctionsPlayGround().publicOne()
    println(FunctionsPlayGround().singleExpr(3, 6))
    println(FunctionsPlayGround().isAdult(18))

}