package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val output = digitString.toCharArray()
        val endNumber = n - 1
        var diff = 0
        (0..endNumber / 2).forEach { i ->
            when {
                output[i] != output[endNumber-i] -> diff++
            }
            when {
                diff >= k && i < (endNumber / 2) -> return "-1"
            }
        }
        var count = k - diff
        (0..endNumber / 2).forEach { i ->
            when {
                !(output[i] != output[endNumber - i] && count > 0) -> {
                    when {
                        output[i] != output[endNumber - i] -> {
                            when {
                                output[i] > output[endNumber - i] -> {
                                    output[endNumber - i] = output[i]
                                }
                                else -> output[i] = output[endNumber - i]
                            }
                        }
                    }
                }
                else -> {
                    output[i] = '9'
                    output[endNumber - i] = '9'
                    count = count - 2
                }
            }
        }
        return String(output)
    }
}