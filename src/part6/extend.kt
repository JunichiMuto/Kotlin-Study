package part6

//kotlinでは既定で継承ができない（final）openを付けて明示する。
open class Person(var name:String ="名無しの権兵衛"){
    open fun show(): String{
        return "私は${this.name}です。"
    }
}
//継承は:のあとクラス名とコンストラクタ引数
class BusinessPerson(name: String, var depart:String): Person(name){
    //メソッドのオーバーライドはoverrideを付ける
    override fun show(): String{
        return "${super.show()} 部署は${this.depart}です。"
    }
}

fun main() {
    val bp = BusinessPerson("山田太郎", "営業")
    println(bp.show())
}

//プライマリコンストラクターを持たないクラスを継承する場合、
//セカンダリコンストラクターで基底クラスのコンストラクターを呼び出すにはsuperを使う
