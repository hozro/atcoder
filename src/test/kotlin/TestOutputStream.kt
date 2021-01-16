import java.io.*
import java.lang.RuntimeException

class TestOutputStream : PrintStream(ByteArrayOutputStream()) {
    private var br = BufferedReader(StringReader(""))

    fun readLine():String {
        val line = br.readLine()
        if (line != null) return line

        try {
            BufferedReader(StringReader(out.toString())).use { sr ->
                sr.reset()
                return br.readLine()
            }
        } catch(e: IOException) {
            throw RuntimeException(e)
        }
    }
}