package funamentals

class StringExamplesCases {

    fun playGroundForString() {
        var text: String = "Some text"
        var text2: String = "1234 another text"
        var name = "without :String"

        var connectedText = text + name
        var toList = text.toList()

        var length = name.length

        var multiLineText = "first line \n second line \n third line"
        println(multiLineText)
        println()

        var pureText = """
            pure 1 line
            pure 2 line
            pure 3 line
        """.trimIndent()
        println(pureText)

        var pureText1 = """
            pure 1 line
            pure 2 line
            pure 3 line
        """ // with all white spaces
        println(pureText1)

        var template: String = "$text - $text2"
        println(template)

        println("template text length: ${template.length}")

    }
}