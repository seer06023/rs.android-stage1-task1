package subtask3

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = 0

        bill.indices.forEach {
            when {
                k != it -> sum += bill[it]
            }
        }
        sum = sum / 2

        when {
            b == sum -> return "Bon Appetit"
            else -> return "${b - sum}"
        }
    }
}
