package jp.co.main.con156

class Digits {
    fun execute() {
        val target = readLine()!!.toInt()
        val advancement = readLine()!!.toInt()

        var index = 1
        var num = advancement

        while(true) {
            if (target <= num) break
            num *= advancement
            index++
        }

        println(index)
    }
}