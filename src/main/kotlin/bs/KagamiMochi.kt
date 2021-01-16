package jp.co.main.bs

class KagamiMochi {
    fun execute() {
        val n = readLine()!!.toInt()
        val aArr = Array<Int>(n) {
            readLine()!!.toInt()
        }
        var tmpSet = aArr.toSet()
        print(tmpSet.size)
    }
}