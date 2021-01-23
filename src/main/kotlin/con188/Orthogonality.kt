package jp.co.main.con188

import java.util.*

class Orthogonality {

    fun execute() {
        val n = readLine()!!.toInt()
        val aList = readLine()!!.split(' ').map { it.toInt() }
        val bList = readLine()!!.split(' ').map { it.toInt() }

        var result = 0

        for (i in 0 until n) {
            result += (aList.get(i) * bList.get(i))
        }

        if (result == 0) println("Yes") else println("No")
    }
}