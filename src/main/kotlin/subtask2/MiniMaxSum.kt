package subtask2

import kotlin.Int.Companion.MAX_VALUE

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        val outputArray = mutableListOf<Int>()
        val tempArray: IntArray = IntArray(input.size)
        var sumAll = 0
        var max = 0
        var min = 999999

        for (i in 0 until input.size) sumAll += input[i]

        (0..input.size - 1).forEach { i ->
            tempArray[i] = sumAll - input[i]

            max = if (tempArray[i] > max) {
                tempArray[i]
            } else max
            min = if (tempArray[i] < min) {
                tempArray[i]
            } else min
        }
        outputArray.add(min)
        outputArray.add(max)


        return outputArray.toIntArray()
    }
}
