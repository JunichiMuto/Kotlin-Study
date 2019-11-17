package 速習Kotlin.part7

import java.net.URL

class MyGenerics<T>(var value:T){
    fun getProp(): T{
        return this.value
    }
}

fun main() {
   val g = MyGenerics<String>("hoge")
    println(g.getProp())

//    g.value = 100 コンパイルエラー

    val g2 = MyGenerics("Hoge") //型推論できる場合は<>不要

}

//Type Alias
//既存の型に別名を付けられる
typealias URLMap = MutableMap<String, MutableList<URL>>
