package assets

open class VehicleAccessModifiers {
    /*
    open - class is open for inheritance
    Kotlin access modifiers#
    */

    public var make: String? = null // public that's why grey color
    protected var brand: String? = null
    private var plate: String? = null
    var year: String? = null // public by default
    internal var bodyColor: String? = null // access inside module - for class as well

}

fun main() {
    var vehicle: VehicleAccessModifiers = VehicleAccessModifiers()
    
}