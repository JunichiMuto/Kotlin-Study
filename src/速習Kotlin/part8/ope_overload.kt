package 速習Kotlin.part8

class Coodidate(val x:Double, val y:Double){
    //1.「+」のオーバーロード
    operator fun plus(c:Coodidate): Coodidate{
        return Coodidate(this.x + c.x, this.y + c.y)
    }
    override fun toString(): String {
        return "Coodinate:(${x}, ${y})"
    }
}

fun main() {
    val c1 = Coodidate(5.0, 3.0)
    val c2 = Coodidate(10.0,1.0)
    println(c1 + c2)
}