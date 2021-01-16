package jp.co.main.bs

class ShiftOnly {

    fun execute() {
        val n = readLine()!!.toInt()
        val aList = readLine()!!.split(" ").map { it.toInt() }
        var index = 0
        var tmpList = aList

        while(true) {
            if (tmpList.any { it == 0 || it % 2 != 0 }) break
            tmpList = tmpList.map { it / 2 }
            index++
        }

        println(index)

    }

}