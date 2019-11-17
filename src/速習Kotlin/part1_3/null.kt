package 速習Kotlin.part1_3

fun main() {
    var str:String = "Hoge"
    //str = null //コンパイルエラー

    var str2:String? = "Hoge"
    str2 = null // OK

    //ボクシング
    var i:Int = 65535; //10とかだと最後falseにならない
    var j:Int = i;
    println(i == j) // ture
    println(i === j) // true

    var k:Int? = i
    println(i == k) // true
    println(i === k) // false
}