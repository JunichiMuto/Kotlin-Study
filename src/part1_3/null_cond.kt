package part1_3

fun main() {
    //セーフコール演算子
    var str:String? = "あいうえお"
    println(str?.length) //5

    var str2:String? = null
    println(str2?.length) //null

    //スマートキャスト
    if(str != null) println(str.length) //5
}