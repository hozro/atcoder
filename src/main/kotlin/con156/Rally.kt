package jp.co.main.con156

class Rally {
    fun execute() {
        val n = readLine()!!.toInt()
        val xArr = readLine()!!.split(" ").map { it.toInt() }

        val arr: Array<Int?> = arrayOfNulls(100)

        for(num in IntRange(1,100)) {
            arr[num - 1] = xArr.sumBy { (it - num) * (it - num) }
        }

        println(arr.filterNotNull().min())
    }
}