package part6

//抽象クラス：openの代わりにabstractを使う
//abstract class Figure(var width: Double, var height: Double){
//    abstract fun getArea(): Double
//}

//インタフェースの場合
interface Figure{
    fun getArea():Double
}

//class Triangle(width: Double, height: Double): Figure(width, height){
class Triangle(var width: Double, var height: Double): Figure{
    override fun getArea(): Double {
        return this.width * this.height / 2
    }
}

fun main() {
    val t = Triangle(10.0, 5.0)
    println(t.getArea())
}