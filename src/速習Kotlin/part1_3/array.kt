package 速習Kotlin.part1_3

fun main() {
    var data = arrayOf(1,2,3)
    data.forEach { i -> println(i) }

    data.forEach { println(it) }

    var list = listOf<String>("あか", "あお", "緑")
    println(list)
    var set = setOf<String>("A","B","C","A","A","B")
    println(set)
    var map = mapOf<String, Int>("First" to 1, "Second" to 2, "Third" to 3)
    println(map)

    //変更可能なリスト
    var list2 = mutableListOf<Int>(100,500,10000)
    list2[1] = 800
    println(list2)

    //Listも変更可能に→できない！ 書籍が古い？
    var list3 : List<Int> = list2;
//    list3[1] = 200
}