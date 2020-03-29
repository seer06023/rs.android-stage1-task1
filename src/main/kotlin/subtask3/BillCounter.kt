package subtask3

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = 0

        for (i in bill.indices) if (i != k) {
            sum += bill[i]
        }
        sum = sum / 2

        when {sum == b -> return "Bon Appetit"
            else -> return "${b - sum}"
        }
    }
}
