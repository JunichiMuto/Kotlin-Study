package part1_3

fun main() {
    val point = 75
    val result = when(point){
        100,99 -> "合格！素晴らしい！！"
        in 70..98 -> "合格です！"
        in 50..69 -> "不合格ですが、もう少し…"
        !in 50..100 -> "がんばりましょう"
        else -> "不明な値です"
    }
    println(result)

    //is演算子
    val obj: Any = "ほげほげ"
    when(obj){
        is String -> println(obj[0])
        is Int -> println(Math.abs(obj))
        else -> println("?")
    }

    //引数を取らないwhen
    val x = 10
    val y = 5
    when{
        x >= 10 -> println("x >= 10")
        x < 10 && y > 10 -> println("x < 10 && y > 10")
        else -> println("その他")
    }

}