package main.kotlin.classeslearning.sealedclassesss

sealed class UserResponse {
    class Success(val user: UserE) : UserResponse() {
        fun save() {
            println("User name ${user.name} saved")
        }
    }

    class Error(val message: String) : UserResponse() {
        fun logError() {
            println("Error: $message")
        }
    }
}