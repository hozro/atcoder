package jp.co.main.bs

class Coins {

    fun execute() {
        val num_500 = readInt()
        val num_100 = readInt()
        val num_50 = readInt()
        val sum = readInt()

        val max_50 = sum / 50

        var index = if((sum / 50) % 2 == 1) 1 else 0
        var res = 0
        while(checkLoop(index, max_50, num_50)) {
            res += calc(sum - index * 50, num_100, num_500)
            index += 2
        }

        print(res)
    }

    fun calc(sum: Int, num_100:Int, num_500:Int): Int {
        val max_500 = sum.divMax(500)
        val real_num_100 = num_100 - (sum % 500) / 100

        if (real_num_100 < 0) return 0

        val max = arrayOf(max_500, num_500).min()!!

        var index = 0
        for (i in 0..max) {
            val tmp = (sum - i * 500) / 100
            if (tmp <= num_100) index++
        }

        return index
    }

    private fun checkLoop(index: Int, max_50:Int, num_50: Int): Boolean {
        return index <= arrayOf(max_50, num_50).min()!!
    }

    fun Int.divMax(num: Int) = (this - (this % num)) / num

    private fun readInt(): Int = readLine()!!.toInt()
}