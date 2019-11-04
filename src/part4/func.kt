package part4

import java.util.*
import java.text.*

//型指定は必須
fun getTriangleArea(width:Double, height:Double) : Double {
    return width * height / 2
}
//戻り値が無い場合はUnit
fun summary(str: String): Unit{
    println("${str.substring(0,5)}...")
}
//単一式の関数(戻り値の型は推論できる場合不要
fun getTriangleArea2(width:Double, height:Double) = width * height / 2

//引数の規定値
fun getTriangleArea3(width:Double = 1.0, height:Double = 2.0) : Double {
    return width * height / 2
}
//別の引数を規定値に
fun getTriangleArea4(width:Double = 1.0, height:Double = width) : Double {
    return width * height / 2
}

//式の値を規定値に
fun formatTime(d: Date = Date()): String{
    val df = SimpleDateFormat("HH:mm:ss")
    return df.format(d)
}

//可変長引数
fun product(vararg values:Int):Int{
    var result = 1
    for(value in values){
        result *= value
    }
    return result
}

//複数の戻り値
fun getSumAvarage(vararg values:Int): Pair<Int,Double>{
    var count = 0.0
    var result = 0
    for(v in values){
        result += v
        count++
    }
    return Pair(result, result/count)
}

fun main() {
    println(getTriangleArea(5.0, 10.0))
    summary("こんにちは、赤ちゃん！")

    println(getTriangleArea3())

    println(formatTime())

    //名前付き引数
    println(getTriangleArea(height = 10.0, width = 20.0))
    //名前無しと混在できるが、名前付きは後に指定する必要がある
    println(getTriangleArea(20.0, height = 10.0))
    //こちらはエラー
//    println(getTriangleArea(width = 20.0, 10.0))

    //可変長引数 こちらも最後にする→Javaと同じ 名前付き引数を使えばエラーにはならない
    println(product(5,2,4,3))
    //可変長引数に配列を渡す→スプレッド演算子(*)
    val list = intArrayOf(5,2,4,3)
    println(product(*list))

    //複数の戻り値を受け取って別々の変数にバラす
    val (sum, avarage) = getSumAvarage(58,75,98,82,89)
    println(sum)
    println(avarage)
    //片方が不要な場合
    val(_, avarage2) = getSumAvarage(58,75,98,82,89)
    //Tripleもある
}