package funamentals

class VariableConverters {

    fun fromIntToLong(intToConvert: Int): Long {
        return intToConvert.toLong()
    }

    fun fromIntToDouble(intToConvert: Int): Double {
        return intToConvert.toDouble()
    }

    fun fromDoubleToInt(doubleToConvert: Double): Int {
        return doubleToConvert.toInt()
    }
}