import java.io.InputStream

class TestInputStream: InputStream() {
    private var buffer = StringBuffer()
    private val crlf:String = System.getProperty("line.separator")

    fun inputln(str:String) {
        buffer.append(str).append(crlf)
    }

    override fun read(): Int {
        if (buffer.isEmpty()) return -1
        val res = buffer[0].toInt()
        buffer.deleteCharAt(0)
        return res
    }
}