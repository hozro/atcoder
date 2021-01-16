package jp.co.main.bs

class SomeSums {

    fun execute() {
        val (n,a,b) = readLine()!!.split(" ").map(String::toInt)
        val arr = Array<Int>(n) { it + 1 }
        val numMap = arr.associate { it to sumAllDigit(it) }
        var sum = 0
        for ((key, value) in numMap) {
            if(value.range(a, b)) sum += key
        }
        print(sum)
    }

    fun sumAllDigit(num:Int): Int {
        return num.toString().toCharArray().map { Character.getNumericValue(it) }.sum()!!
    }

    fun Int.range(min:Int, max:Int):Boolean = this in min..max


    fun Int.floor(num:Int) = (this - (this % num)) / num


}