package jp.co.main.con156

class Beginner {
    fun execute() {
        val participateNum = readLine()!!.toInt()
        val displayRate = readLine()!!.toInt()
        print(if (participateNum <= 10) {
            displayRate + 100 * (10 - participateNum)
        } else {
            displayRate
        })
    }
}