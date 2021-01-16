package jp.co.main.con157

class Bingo {
    fun execute() {
        val arr1 = readBingoNum()
        val arr2 = readBingoNum()
        val arr3 = readBingoNum()

        val bingoCard = BingoCard(listOf(arr1, arr2, arr3))

        val n = readLine()!!.toInt()
        val bArr = IntArray(n) {
            readLine()!!.toInt()
        }

        val res = checkBingo(bingoCard, bArr)
        print(res)
    }

    private fun checkBingo(bingoCard:BingoCard, bArr:IntArray):String {
        var tmp = bingoCard.copy()
        for (vertical in 0..2) {
            for (side in 0..2) {
                var bingoNum = tmp.arr[vertical][side]
                bingoNum.checked = bArr.contains(bingoNum.num)
            }
        }

        // 縦
        for (vertical in 0..2) {
            var tmpBingoArr = Array<BingoNum>(3) { tmp.arr[it][vertical] }
            if(tmpBingoArr.filter { !it.checked }.isEmpty()) return "Yes"
        }

        // 横
        for (vertical in 0..2) {
            if (tmp.arr[vertical].filter { !it.checked }.isEmpty()) return "Yes"
        }

        // 斜め
        if (tmp.arr[0][0].checked && tmp.arr[1][1].checked && tmp.arr[2][2].checked) return "Yes"
        if (tmp.arr[0][2].checked && tmp.arr[1][1].checked && tmp.arr[2][0].checked) return "Yes"

        return "No"
    }
}

data class BingoCard(
    var arr:List<List<BingoNum>>
)

data class BingoNum(
    val num: Int,
    var checked: Boolean = false
)

fun readBingoNum() = readLine()!!.split(" ").map { BingoNum(it.toInt()) }