package subtask4

class StringParser {

      fun closeBracket (typeBracket: Char): Char {
        return if (typeBracket == '(') ')'
        else if (typeBracket == '[') ']'
        else if (typeBracket == '<') '>'
        else ' '
    }
}

fun StringParser.getResult(inputString: String): Array<String> {
    val output: MutableSet<String> = mutableSetOf()
    inputString.indices.forEach { i ->
        val firstBracket = inputString[i]
        when (firstBracket) {
            '(', '[', '<' -> {
                val secondBracket = closeBracket(firstBracket)
                var isClosed: Boolean = false
                loop@ for (j in i + 1 until inputString.length) {
                    if (inputString[j] == secondBracket) {
                        output += inputString.substring(i+1, j)
                        isClosed = true
                    }
                    when {
                        inputString[j] == firstBracket && isClosed -> {
                            break@loop
                        }
                    }
                }
            }
        }
    }
    return output.toTypedArray()
}