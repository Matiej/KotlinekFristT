package funamentals

class NullNullableOverview {
    fun playGroundWithNulls()  {
        var myNullableInt: Int? = null// null safety - need that questinamark
        var newValue = myNullableInt?.minus(2) // question mark is safe to use then new value is null but no crash

    }

    fun nonNullForcePlay(incomingNumber: Int?) {
        var myNumber: Int = 33
        var result = incomingNumber!!.minus(myNumber) //
    }
}