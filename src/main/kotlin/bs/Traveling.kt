package jp.co.main.bs

import java.lang.Math

class Traveling {

    fun execute() {
        val n = readLine()!!.toInt()

        val lst = Array(n) {
            Destination(readLine()!!
                .split(' ')
                .map { it.toInt() }
            )
        }

        var before = Destination(0,0,0)

        for (des in lst) {
            val min = Math.abs(before.x - des.x) +
                    Math.abs(before.y - des.y)
            val time = des.t - before.t

            if (time < min) {
                println("No")
                return
            }

            val mod = time - min

            if (mod % 2 != 0) {
                println("No")
                return
            }

            before = des

        }

        println("Yes")

    }

}

data class Destination(
    var t: Int,
    var x: Int,
    var y: Int
) {
    constructor(lst: List<Int>): this(lst[0], lst[1], lst[2])
}
