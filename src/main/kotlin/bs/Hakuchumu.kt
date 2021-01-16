package jp.co.main.bs

import java.lang.Exception
import kotlin.system.measureTimeMillis

class Hakuchumu {

    fun execute() {
        val s = readLine()!!
        var str = s
        while (str.isNotEmpty()) {
            var res = canAppend(str)
            if (!res.first) {
                println("NO")
                return
            }
            str = res.second
        }
        println("YES")
    }

    fun canAppend(str:String): Pair<Boolean, String> {
        val tmp = check(str)
        return if (tmp == null) {
            Pair(false, "")
        } else {
            Pair(true, tmp)
        }
    }

    fun check(str:String): String? {
        var tmp = str
        if (str.length <= 4) return null
        val fiveStr = str.substring(0..4)
        if (checkDream(fiveStr)) {
            tmp = str.drop(5)
            val threeStr = if(tmp.length <= 2) tmp else tmp.substring(0..2)
            if (checkAfterDream(threeStr)) {
                tmp = tmp.drop(2)
            }
            return tmp
        }
        if (checkErase(fiveStr)) {
            tmp = str.drop(5)
            val twoStr = if(tmp.length <= 1) tmp else tmp.substring(0..1)
            if (checkAfterErase(twoStr)) {
                tmp = tmp.drop(1)
            }
            return tmp
        }

        return null
    }

    fun checkDream(str:String): Boolean {
        return str == "dream"
    }

    fun checkErase(str:String):Boolean {
        return str == "erase"
    }

    fun checkAfterDream(str:String): Boolean {
        return if (str.length == 3) {
            str == "ere" || str == "erd"
        } else {
            str == "er"
        }
    }

    fun checkAfterErase(str:String):Boolean {
        return if(str.length == 2) {
            str == "re" || str == "rd"
        } else {
            str == "r"
        }
    }
}