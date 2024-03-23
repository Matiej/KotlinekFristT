package main.kotlin.classeslearning.sealedclassesss

fun main() {
    val userResponse = UserResponse.Success(UserE("John"))
    handleUserResponse(userResponse)

    val userResponseError = UserResponse.Error("my test error occurred!!!")
    handleUserResponse(userResponseError)
}

fun handleUserResponse(userResponse: UserResponse) {
    when (userResponse) {
        is UserResponse.Success -> {
            userResponse.user.greetings()
            userResponse.save()
        }
        is UserResponse.Error -> {
            userResponse.logError()
        }
    }
}

