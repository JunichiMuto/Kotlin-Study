package 速習Kotlin.part8

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

//プロパティの実装
class LoggableProp<T>(var value:T): ReadWriteProperty<Any, T>{
    //取得時の処理
    override fun getValue(thisRef: Any, prop: KProperty<*>): T {
        println("get ${prop.name}")
        return this.value
    }
    //設定時の処理
    override fun setValue(thisRef: Any, prop: KProperty<*>, value: T) {
        this.value = value
        println("set ${prop.name} = ${value}.")
    }
}
class LoggableClass (){
    //LoggablePropを紐付ける
    var name: String by LoggableProp("山田太郎")
}

fun main() {
    val c =  LoggableClass()
    println(c.name)
    c.name = "WINGS Project"
    println(c.name)
}