package jp.co.main.con188

import java.util.*
import kotlin.math.pow

class ABCTournament {
    fun execute() {
        val n = readLine()!!.toInt()
        val aArray = readLine()!!.split(' ').map { it.toInt() }

        val peopleNum = 2.toDouble().pow(n.toDouble()).toInt()

        var que = ArrayDeque<Int>(peopleNum)
        que.addAll(aArray)

        for(i in 2 until peopleNum) {
            val a = que.pollFirst()
            val b = que.pollFirst()
            if (a > b) {
                que.addLast(a)
            } else {
                que.addLast(b)
            }
        }

        val a = que.pollFirst()
        val b = que.pollFirst()
        if (a > b) {
            println(aArray.indexOf(b) + 1)
        } else {
            println(aArray.indexOf(a) + 1)
        }
    }
}
