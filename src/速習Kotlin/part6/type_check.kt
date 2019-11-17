package 速習Kotlin.part6

open class Person2{}
class BusinessPerson2(): Person2(){
    fun work() = println("働いています")
}

fun main() {
    //アップキャスト
    val p: Person2 = BusinessPerson2()
    //型のチェック
    if(p is BusinessPerson2){
        p.work() //スマートキャスト
    }

    //明示的なキャスト
    val bp: BusinessPerson2 = p as BusinessPerson2
}
