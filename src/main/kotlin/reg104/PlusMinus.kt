package jp.co.main.reg104

class PlusMinus {
    fun execute() {
        val (a,b) = readLine()!!.split(" ").map { e -> e.toInt() }
        val x = (a+b)/2
        val y = (a-b)/2
        print("$x $y")
    }
}