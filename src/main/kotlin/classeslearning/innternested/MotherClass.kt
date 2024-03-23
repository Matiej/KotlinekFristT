package main.kotlin.classeslearning.innternested

class MotherClass {
    private val motherClassField = "MotherClassField"

    fun motherClassMethod() {
        println("MotherClassMethod and filed value is $motherClassField")
    }

    inner class InnerMotherClass {
        private val nestedClassField = "NestedClassField"
        fun nestedClassMethod() {
            println("NestedClassMethod and filed value is $nestedClassField")
        }

        fun motherClassMethod() {
            println("Access from inner class to motherClassFiled and filed value is $motherClassField")
        }
    }

    class NestedMotherClass {
        private val nestedClassField = "NestedClassField"
        fun nestedClassMethod() {
            println("NestedClassMethod and filed value is $nestedClassField")
        }

        fun tryAccessToMotherClassField() {
            // important to remember that nested class can't access to mother class field
            // println("Access from nested class to motherClassFiled and filed value is $motherClassField")
            // Error: Unresolved reference: motherClassField
        }
    }
}