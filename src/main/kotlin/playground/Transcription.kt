package main.kotlin.playground

import java.time.LocalDateTime

class Transcription(val originalContent: String, val contentDateTime: LocalDateTime) {
    var summary: String? = null
        get() {
            println("custom getter for summary field, value: $field")
            return field
        }
        set(value) {
            println("some validation for summary field, value: $value")
            field = value
        }


    init {
        println("transcript inside init block?")
    }

    constructor(summary: String, originalContent: String, contentDateTime: LocalDateTime) : this(
        originalContent,
        contentDateTime
    ) {
        this.summary = summary
        println("inside secondary constructor")
    }


    fun shotTranscriptionDetails() {
        println("Original content: $originalContent, content created time: $contentDateTime, summary: $summary")
    }
}

fun main() {
    var ts = Transcription(
        originalContent = "my huge content",
        summary = "summary for content",
        contentDateTime = LocalDateTime.now().minusDays(4)
    )

    ts.shotTranscriptionDetails()
    var summary = ts.summary
//    println(summary)


}

