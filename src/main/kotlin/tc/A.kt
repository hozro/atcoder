package jp.co.main.tc

import java.util.*

private var height: Int = 0
private var width: Int = 0
private var maze: Array<Array<Char?>> = Array(500) { arrayOfNulls<Char>(500)}
private var root: Array<BooleanArray> = Array(500) { BooleanArray(500) }
private var queue: ArrayDeque<Coordinate>? = null
private lateinit var start: Coordinate
private lateinit var goal: Coordinate
private var result: Boolean = false

fun main(args:Array<String>) {

    val (h,w) = readIntList()
    height = h
    width = w

    queue = ArrayDeque(w * h)

    for (i in 0 until h) {
        readLine()!!.toCharArray().forEachIndexed { index, it ->
            maze[index][i] = it
            if (it == 's') start = Coordinate(index, i)
            if (it == 'g') goal = Coordinate(index, i)
        }
    }

    print(start)
    print(goal)

//    search(start!!.x, start!!.y)

    println(if(result) "Yes" else "No")

}

data class Coordinate(val x: Int, val y:Int)

fun search(x: Int, y:Int): Unit {
    val tmp = Coordinate(x, y)

    if (0 > x || x > width - 1 || 0 > y || y > height - 1 || maze[x][y] == '#') return
    if (root[x][y]) return
    if (x == goal!!.x && y == goal!!.y) {
        result = true
        return
    }
    queue!!.addLast(tmp)

    search(x + 1, y)
    search(x - 1, y)
    search(x, y + 1)
    search(x, y - 1)
}


fun readInt(): Int = readLine()!!.toInt()
fun readIntList(): List<Int> = readLine()!!.split(' ').map { it.toInt() }

