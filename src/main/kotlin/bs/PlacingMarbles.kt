package jp.co.main.bs

class PlacingMarbles {
    fun execute() {
        val list = readLine()!!.toCharArray()
        print(list.filter { it == '1' }.count())
    }
}