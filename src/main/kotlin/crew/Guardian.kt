package crew

class Guardian constructor(var login: String, var password: String) {

    var name: String? = null
        get() {
            return "$login and $password"
        }
        private set


    var money: Double = 0.0
        set(value) {
            field = value
        }
        get() {
            return field
        }

    public var publicFiled: String? = null
    protected var protectedFiled: String? = null
    private var privateFiled: String? = null
    var noModifierFiled: String? = null
    internal var internalFiled: String? = null

}

fun main() {
    val guardian = Guardian("Alien", "test123")
    println(guardian.name)
    guardian.money = 11.2
    guardian.money = 101.23
    println(guardian.money)
}