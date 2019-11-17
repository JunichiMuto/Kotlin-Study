package 速習Kotlin.part8

import java.util.*

interface Loggable{
    fun log(value: String)
}
class LoggableImpl(val header:String):Loggable{
    override fun log(value: String) {
        println("${this.header}:${value}")
    }
}
class MyClass3: Loggable by LoggableImpl("MyApp3"){
}

fun main() {
    val c = MyClass3()
    c.log(Date().toString())
}