package 速習Kotlin.part4

//inlineを付けるとインライン化できる
inline fun benchmark(action: ()->Unit):Long{
    val start = System.currentTimeMillis()
    action()
    val end = System.currentTimeMillis()
    return end - start
}

fun main() {
    val time = benchmark {
        var x = 1
        for(i in 1..10_000_000_000){
            x++
        }
    }
    println(time)

    //ローカル関数
    //varでも中から参照できる？？
    var rate = 0.2
    fun dicount(price: Int):Double{
        return price*(1-rate)
    }
    rate = 0.3
}