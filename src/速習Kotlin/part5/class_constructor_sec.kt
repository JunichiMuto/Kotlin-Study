package 速習Kotlin.part5

class Person2 (var name: String, var age: Int){
    //セカンダリコンストラクター
    constructor(name: String): this(name, 16){}
    //2個目
    constructor(): this("山田太郎"){}
    //プライマリコンストラクターが存在する場合、必ず最後に呼ばないといけない

    fun show(){
        println("私は${name}です。${age}歳です")
    }
}

fun main() {
    val p = Person("山田太郎", 18)
    p.show()
}