package 速習Kotlin.part8

class LazyTest(){
    //遅延プロパティ
    val randomValue: Double by lazy {
        //1回目は処理が行われる,2回目以降は初回の値を返す。
        println("initialized...")  //1回目しか実行されない
        Math.random()
    }
}

fun main() {
    val c = LazyTest()
    println(c.randomValue)
    println(c.randomValue)
}