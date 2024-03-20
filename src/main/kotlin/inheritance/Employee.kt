package inheritance

open class Employee(
    var name: String?,
    var surnmae: String?,
    var role: String?,
    var salary: Double?
) {

    open val FUNCTION: String = "EMPLOYEE"

    override fun toString(): String {
        return " - (name=$name, surnmae=$surnmae, role=$role, salary=$salary)"
    }

    open fun introduce() {
        println(FUNCTION+this)
    }
}