package jp.co.main.bs

class Otoshidama {

    fun execute() {
        val (n,y) = readLine()!!.split(" ").map { it.toInt() }

        if (y > 10000 * n || 1000 * n > y) {
            error()
            return
        }

        var num_1000 = y % 5000 / 1000

        if (num_1000 > n) {
            error()
            return
        }

        var n_usable = n - num_1000

        while (0 <= n_usable) {
            val ans = check(n_usable, y - 1000 * num_1000, Answer(null, null, num_1000))
            ans?.let {
                println("${it.x} ${it.y} ${it.z}")
                return@execute
            }
            num_1000 += 5
            n_usable -= 5
        }
        error()
    }

    private fun check(num: Int, sum: Int, answer:Answer): Answer? {
        for (i in 0..num) {
            if (i * 5000 + (num - i) * 10000 == sum ) {
                answer.y = i
                answer.x = num - i
                return answer
            }
        }
        return null
    }

    private fun error() = println("-1 -1 -1")

}

data class Answer(var x:Int?, var y:Int?, var z:Int)