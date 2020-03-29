package subtask1

class HappyArray {


    fun convertToHappy(sadArray: IntArray): IntArray {
            var i = 0

            val tempList = sadArray.toMutableList()

            while (i < tempList.size - 1) {
                when {
                    !(i == 0 || tempList[i] <= tempList[i + 1] + tempList[i - 1]) -> {
                        tempList.removeAt(i)
                        i --
                    }
                    else -> i ++
                }
            }
            return tempList.toIntArray()
        }
    }