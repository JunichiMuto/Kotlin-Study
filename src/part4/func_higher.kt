package part4

fun print(item:Int){
    println(item)
}
fun main() {
    var list = arrayOf(1,2,3,4)
    list.forEach ( ::print)

    //ラムダ式ならその場で定義
    list.forEach ({ num:Int -> println(num) })
    //型は省略可能
    list.forEach ({ num -> println(num) })
    //最後の引数がラムダ式の場合、丸括弧は外に出せる
    list.forEach() { num -> println(num) }
    //ラムダ式が唯一の引数の場合は丸括弧は省略可能
    list.forEach{ num -> println(num) }
    //ラムダ式の引数が単一の場合、暗黙の引数itで受け取れる
    list.forEach() { println(it) }

    //ラムダ式内のreturnは呼び出し元を抜けてしまう!!
    list.forEach {
//        if(it > 3) return
        println(it)
    }
    println("終了しました") //出ない

    //ラベルを使って抜ける
    list.forEach loop@{
        if(it > 3) return@loop
        println(it)
    }
    println("終了しました") //出る

    //上位メソッド名を暗黙的なラベルとして使用できる
    list.forEach {
        if(it > 3) return@forEach
        println(it)
    }
    println("終了しました") //出る
}