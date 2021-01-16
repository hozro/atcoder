package jp.co.main.con179

class PluralForm {
    fun execute() {
        val target = readLine()!!
        if (target.endsWith("s", ignoreCase = true)) {
            print("${target}es")
        } else {
            print("${target}s")
        }
    }
}

