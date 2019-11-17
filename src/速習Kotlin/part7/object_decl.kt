package 速習Kotlin.part7

//オブジェクト宣言:一つしかインスタンスを持てない
//クラスではなくオブジェクトそのものの宣言
//コンストラクターは持てない
//継承もできるがその場合コンストラクター引数は全て指定しなければならないか
object MyApp{
    var name: String = "速習React"
    var auther: String = "WINGS Project"
    fun dump(){
        println("${name}:${auther}")
    }
}

fun main() {
    MyApp.name = "速習Kotlin"
    MyApp.dump()
}
//オブジェクト式
//object: parent{body}
//Javaで言う無名クラス
//btn.setOnClickListener(object: View.OnCLickLitener{
// override fun onClick(view: View){
// :

//SAMインタフェース（Single Abstract Method） Javaだと関数型インタフェースのことか
//SAM変換→関数リテラル（ラムダ式）で置き換えること
//btn.setOnClickListener({view: View -> Log.v("Kotlin Sample", "Clicked!")})
//ラムダ式のルールを当てはめていくと、以下になる
//btn.setOnClickListener{Log.v("Kotlin Sample", "Clicked!")}