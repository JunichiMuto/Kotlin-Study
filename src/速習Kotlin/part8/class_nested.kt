package 速習Kotlin.part8

class MyClass(){
    private class MyHelper(){
        fun show(){
            println("Nested class is running...")
        }
    }

    fun run(){
        val helper = MyHelper()
        helper.show()
    }
}

fun main() {
    val c = MyClass()
    c.run()
//    MyClass.MyHelper.run() privateが無ければ参照できる
}