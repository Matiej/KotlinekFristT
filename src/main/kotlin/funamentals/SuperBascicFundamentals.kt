package funamentals

import java.util.*

class SuperBascicFundamentals {

    fun checkForMainArgs(mainArg: Array<String>) {
        if (mainArg.isNotEmpty()) {
            println("Number og arguments: " + mainArg.size)
            println("List of arguments:")
            mainArg.forEach { el -> println(el) }
        } else {
            println("No argument sin main function.")
        }
    }

    fun scannerExample() {
//        println("\n  Type something here: ")
//        val scanner = Scanner(System.`in`)//in kotlin word 'in' is key word thats why like this
//        val enteredData = scanner.nextLine()
//        println("You wrote: $enteredData")
    }
}