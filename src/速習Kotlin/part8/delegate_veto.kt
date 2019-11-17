package 速習Kotlin.part8

import kotlin.properties.Delegates

class Person2(){
    //委譲プロパティ
    var age: Int by Delegates.vetoable(0){
        prop, old, new ->
            new >= 0 //例外をスローすることもできる
    }
}

fun main() {
    var p = Person2()
    p.age = 10
    println(p.age)
    p.age = -10
    println(p.age) //falseを返すと代入が無視される
}