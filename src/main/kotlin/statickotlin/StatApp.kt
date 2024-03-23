package main.kotlin.statickotlin

import main.kotlin.castingche.Fruit


fun main() {
    val anonymObject = object : Fruit() {
        override fun checkTaste(): String {
            return "Apple is Sweet"
        }

        fun checkMe(question: String) {
            println("What is  $question anonymous class extending Fruit")
        }
    }

    val anonymNoFruit = object {
        fun checkMe(question: String) {
            println("What is  $question anonymous class")
        }
    }


}