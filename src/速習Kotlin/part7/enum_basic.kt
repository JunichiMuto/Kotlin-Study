package 速習Kotlin.part7

enum class Season(val value: Int){
    SPRING(1),
    SUMMER(2),
    AUTUMN(4),
    WINTER(8)
}

fun main() {
    val s = Season.SPRING
    println(s)
    println(s is Season) // true
    println(s is Enum<Season>) // true

    println(s.value) //1
    println(s.ordinal) //0 インデックス

    val w = Season.valueOf("WINTER")
    println(w)
//    val n = Season.valueOf("WINTERAAA") IllegalArgumentException
    for(s in Season.values()){
        println(s)
    }
}