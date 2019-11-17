package 速習Kotlin.part8

import java.lang.StringBuilder

//拡張関数repeatを宣言
fun String.repeat(num: Int): String{
    var builder = StringBuilder()
    for(i in 1..num){
        builder.append(this)
    }
    return builder.toString()
}
//privateメンバーにはアクセスできない

fun main() {
    var str = "ほげ"
    println(str.repeat(5))
}