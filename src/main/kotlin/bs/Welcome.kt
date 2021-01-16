package jp.co.main.bs

class Welcome {
    fun execute() {
        val a = readInt()
        val (b,c) = readArrInt()
        val s = readLine()!!

        print("${a+b+c} $s")
    }

    private fun readInt():Int = readLine()!!.toInt()
    private fun readArrInt():List<Int> = readLine()!!.split(" ").map { it.toInt() }
}