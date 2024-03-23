package main.kotlin

class LateInitNote {
    // can be used as a class property
    // only with var
    // lateinit can be used only with mutable data types (not Double, Int, etc.)
    // can't be null
    // no getter or setter
    lateinit var content: String
        private set

    fun addContent(noteContent: String) {
        content = noteContent
    }

    fun showContent() {
        if (this::content.isInitialized) {
            println(content)
        } else {
            println("Name is not initialized")
        }
    }
}