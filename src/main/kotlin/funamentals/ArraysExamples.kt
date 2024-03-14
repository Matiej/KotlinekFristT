package funamentals

class ArraysExamples {

    fun oneDimension() {
        var intArr: IntArray = IntArray(3)
        var shortArr: ShortArray = ShortArray(3)
        //etc

        intArr[0] = 5
        intArr[1] = 6
        intArr[2] = 12

        intArr.forEach { el -> println(el) }

        var doublArr: DoubleArray = doubleArrayOf(5.1, 6.1, 11.3)
        var objArray: Array<String> = arrayOf("one", "john")// cant create empty array delcaring number of object
        //var objArray: Array<String> = Array(3) ==> doesn't work like that.
    }

    fun multiDimension() {
        var multiIntArr = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(11,12,13),
            intArrayOf(4,5,6),
            intArrayOf(7,8,9)
        )
        var i = multiIntArr[1][2]
        
        println(multiIntArr[0][2])

    }
}