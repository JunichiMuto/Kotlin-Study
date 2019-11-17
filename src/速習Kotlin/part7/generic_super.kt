package 速習Kotlin.part7

open class Hoge(){}
class FooBar(): Hoge(){
    val value = "Hogeeeee"
}
//TはHogeのサブクラス
class MyGenerics2<T:Hoge>(var value: T){
    fun getProp(): T{
        return this.value
    }
}

fun main() {
    val g = MyGenerics2<FooBar>(FooBar())
    println(g.getProp().value)
}

//複数の型制約を付けられる。その場合whereで指定する
interface IPiyo
class MyGenerics3<T>(var value: T)
    where T:Hoge, T:IPiyo