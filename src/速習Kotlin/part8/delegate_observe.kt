package 速習Kotlin.part8

import kotlin.properties.Delegates

class Person(){
    //委譲プロパティの宣言
    var name: String by Delegates.observable("?????") {
        prop, prev, next ->
        println("${prop.name} プロパティ：{prev} -> ${next}")
        println(prop.isAbstract)
        println(prop.isConst)
        println(prop.isOpen)
        println(prop.name)
        println(prop.returnType)
        println(prop.visibility)
    }
}

fun main() {
    val p = Person()
    p.name = "佐藤敏夫"
    p.name = "鈴木耕作"

}