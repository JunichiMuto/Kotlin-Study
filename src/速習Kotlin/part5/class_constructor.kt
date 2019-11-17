package 速習Kotlin.part5

//プライマリコンストラクター
//アクセス修飾子やアノテーションを伴わない場合、キーワード省略できる
//class Person constructor(name: String, age: Int){
//class Person (name: String, age: Int){
//プロパティセットするだけの場合、varを付ける事で宣言やinitの記述も省略可能 アクセス修飾子も付けられる
class Person (var name: String, var age: Int){

//    var name:String
//    var age:Int
//    init{
//        this.name = name
//        this.age = age
//    }
    fun show(){
        println("私は${name}です。${age}歳です")
    }
}

fun main() {
    val p = Person("山田太郎", 18)
    p.show()
}