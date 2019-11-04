package part5

import java.lang.IllegalArgumentException

class Parson(){ //クラス名の後ろにカッコがある
    //プロパティ定義
    var name = "名無しの権兵衛"
    private set //クラス外からは読み取り専用にしたい

    var age = 10
    set(value){ //setterを定義
        if(value <= 0){
            throw IllegalArgumentException("ageは正数で指定してください")
        }
        field = value //fieldはバッキングフィールド。こちらに値が入る。
    }
    val race = "人間"
    val isAdult
    get() = age >= 20

    //既定のアクセス修飾子はpublic
    fun show(){
        println("私は${name}です。${age}歳です")
    }
    //protectedはパッケージ内からアクセス不可
    //internalはモジュール内でアクセス可
}

fun main() {
    //newはいらない
    val p = Parson()
    p.show()

    p.age = -10
}

//staticキーワードがない