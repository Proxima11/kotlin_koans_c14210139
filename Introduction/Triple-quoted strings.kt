const val question = "life, the universe, and everything"
const val answer = 42

val tripleQuotedString = """
    #question = "$question"
    #answer = $answer""".trimMargin("#")

fun main() {
    println(tripleQuotedString)
}

//format multiline string dengan trimIndent dan trimMargin (trimMargin membuat string tidak memiliki prefix / nilai awalan)