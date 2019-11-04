package part6

interface Hoge1{
    fun run(){
        println("Hoge1 running")
    }
}
interface Hoge2{
    fun run(){
        println("Hoge2 running")
    }
}

class MyClass(): Hoge1, Hoge2{
    override fun run(){
//        super.run() これだとコンパイルエラー
        super<Hoge1>.run() //OK
        //Javaだと Hoge1.super.run()となる
    }
}

fun main() {
    val c = MyClass()
    c.run()
}