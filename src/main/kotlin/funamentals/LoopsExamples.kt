package funamentals

class LoopsExamples {

    fun loopsTrainings() {
        for (i in 0..4) {
            println("Element in loop no: $i")
        }
        println()
        for (i in 0 until 4) {
            println("Element in loop with UNITL key world no: $i")
        }
        println()
        for (i in 0..<4) {
            println("Element in loop with < key world no: $i")
        }

        println()
        for (i in 0..4 step 2) {
            println("Element in loop no: $i with step 2 param")
        }

        println()
        for (i in 4 downTo 0) {
            println("Element in loop no: $i with downTo key world")
        }

        println()
        for (i in 6 downTo 0 step 3) {
            println("Element in loop no: $i with downTo and step with 3")
        }

        println()
        for (i in 0..5) {
            if (i == 3) {
                println("element in loop = 3 and if statement with continue command stop loop for this element")
                continue
            }
            println("Element in loop no: $i")
        }

        println()
        for (i in 0..5) {
            if (i == 3) {
                println("element in loop = 3 and if statement with break command stop and exit loop!")
                break
            }
            println("Element in loop no: $i")
        }

    }

    fun whileLoopExamples() {
        println()
        var i: Int = 0
        while (i <= 4) {
            println("while loop, element no: $i")
            i++
        }

        println()
        var j: Int = 0
        do {
            println("do-while loop, element no: $j")
            j++
        } while (j <= 4)
    }

    fun loopArray(myNumbersArray: IntArray) {
        println()
        for (el in myNumbersArray) {
            println("element: $el")
        }

        println()
        for(i: Int in 0 until  myNumbersArray.size) {
            println("no of index: $i for element: " + myNumbersArray[i])
        }

        println()
        for(i in myNumbersArray.indices) {
            println("using myNumbersArray.indices method, index: $i for element: " + myNumbersArray[i])
        }
    }


}