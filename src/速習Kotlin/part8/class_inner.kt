package 速習Kotlin.part8

class MyClass2(var name: String = "MyClass"){
    //インナークラスを定義
    inner class MyHelper(var name: String = "MyHelper"){
        fun show(){
            println(name) //MyHelper
            println(this@MyClass2.name) //MyClass
        }
    }
}

fun main() {
    MyClass2().MyHelper().show()
}