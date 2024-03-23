package main.kotlin.classeslearning.objectclass

fun main() {
    println(MyApplicatonProperitesObject.myApplicationName)
    println(MyApplicatonProperitesObject.myApplicationVersion)
    MyApplicatonProperitesObject.myApplicationVersion = "2.0.0"
    println(MyApplicatonProperitesObject.myApplicationVersion)
    var sc = Screent()
    sc.changeAppVersion("3.0.0")
    println(MyApplicatonProperitesObject.myApplicationVersion)
}

class Screent {
    fun changeAppVersion(version: String) {
        MyApplicatonProperitesObject.myApplicationVersion = version
    }
}