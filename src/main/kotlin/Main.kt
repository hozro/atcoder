package jp.co.main

import com.fasterxml.jackson.databind.ObjectMapper
import jp.co.main.bs.Traveling
import jp.co.main.con179.PluralForm
import jp.co.main.reg104.DNASequence
import jp.co.main.reg104.PlusMinus
import kotlin.system.measureTimeMillis

fun main(args:Array<String>) {
    val a = DNASequence()
    a.execute()
}
