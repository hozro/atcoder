package jp.co.main.reg104

class DNASequence {
    fun execute() {
        val (L,s) = readLine()!!.split(" ")
        val l = L.toInt()
        var ans = 0

        for (i in 0 until l) {
            var atnum = 0
            var cgnum = 0
            for (i2 in i until l) {
                when(s[i2]) {
                    'A' -> atnum++
                    'G' -> cgnum--
                    'C' -> cgnum++
                    'T' -> atnum--
                }
                if (atnum === 0 && cgnum === 0) ans++
            }
        }
        println(ans)
    }
}
