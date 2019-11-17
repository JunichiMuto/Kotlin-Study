package 速習Kotlin.part7

data class Book(var title: String = ""){
    var price: Int = 0
}

fun main() {
    val b1 = Book("JavaScript本格入門")
    b1.price = 3000
    val b2 = Book("JavaScript本格入門")
    b2.price = 3500
    //equalsメソッド（==で自動に呼ばれる）
    //プライマリコンストラクターで定義されたプロパティを対象とする
    println(b1 == b2) //false

    //toString 同じくプライマリコンストラクターで定義されたプロパティだけ
    println(b1) //Book(title=JavaScript本格入門)

    //componentN 分割代入で内部的に呼ばれる
    val t = Triple("山田", 18, 175.5)
    val (name, old, height) = t
    //以下と同じ
//    val name = t.component1()
//    val old = t.component2()
//    val height = t.component3()

    //copyメソッド 特定のプロパティだけ変更してオブジェクトを複製できる
    data class Article(val url:String, val title: String, val view: Int = 0)
    val a = Article("https://google.com", "kotlin", 12345)
    //通常は名前付き引数で指定する
    val copied = a.copy(view = 0)
    println(copied) //Article(url=https://google.com, title=kotlin, view=0)
}