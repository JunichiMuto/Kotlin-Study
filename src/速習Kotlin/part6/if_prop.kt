package 速習Kotlin.part6
import java.util.Date

interface Loggable{
    //プロパティを持てる
    var header: String

    fun log(msg: Any){
        println("[${this.header}] ${msg.toString()}")
    }
}

open class MyClass2() : Loggable{
    //実装は必須
    override var header: String = "Parent Log"
}

fun main() {
    val c = MyClass2()
    c.log(Date())
}
