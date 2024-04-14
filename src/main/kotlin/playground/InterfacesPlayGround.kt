package main.kotlin.playground

class InterfacesPlayGround {

}

interface  A {
    val isSomethingDone: Boolean
    fun doSomething()
    fun myMethodWithBody() {
        println("A interface method")
    }
}

interface  B {
    fun doSomething()
    fun myMethodWithBody() {
        println("B interface method")
    }
}

class AB: A, B {
    override var isSomethingDone: Boolean = false
        get() = field
    override fun doSomething() {
        println("implementing the same interface from both classes")
    }

    override fun myMethodWithBody() {
        super<A>.myMethodWithBody()
        super<B>.myMethodWithBody()
        this.isSomethingDone = true
        println("Class AB implementing method form both interfaces")
    }

}
fun main() {
    val ab = AB()
    ab.myMethodWithBody()
    println(ab.isSomethingDone)
}