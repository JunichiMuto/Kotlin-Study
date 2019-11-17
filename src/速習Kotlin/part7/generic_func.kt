package 速習Kotlin.part7

//ジェネリック関数
fun <T>tail(list: Array<T>):T = list[list.size - 1]

fun main() {
    val data = arrayOf(1,2,5,6)
    println(tail(data))
}