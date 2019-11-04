package part7

class Person private constructor(var name: String){
    //companionオブジェクトの定義
    companion object Factory{
        fun getInstance(): Person{
            return Person("山田太郎")
        }
    }

    override fun toString(): String {
        return "Person: ${this.name}"
    }
}

fun main() {
    val p = Person.getInstance()
    //本当は↓？
//    val p = Person.Factory.getInstance()
    println(p)
}