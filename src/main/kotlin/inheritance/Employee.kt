package inheritance

open class Employee(var name: String?, var surnmae: String?, var role: String?, var salary: Double?) {

    override fun toString(): String {
        return "I'm - (name=$name, surnmae=$surnmae, role=$role, salary=$salary)"
    }

    fun introduce() {
        println(this)
    }
}