package crew

import java.lang.Exception

class User(var name: String?, var lastname: String?, var age: Int?) {
    var email: String? = null

    constructor(name: String?, lastname: String?, age: Int, email: String) : this(name, lastname, age) {
        this.email = email
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (lastname != other.lastname) return false
        if (age != other.age) return false
        if (email != other.email) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name?.hashCode() ?: 0
        result = 31 * result + (lastname?.hashCode() ?: 0)
        result = 31 * result + (age ?: 0)
        result = 31 * result + (email?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "User(name=$name, lastname=$lastname, age=$age, email=$email)"
    }


}