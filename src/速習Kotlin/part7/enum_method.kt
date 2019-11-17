package 速習Kotlin.part7

enum class Language{
    JAPANISE{
        override fun getDisplayName(): String = "日本語"
    },
    ENGLISH{
        override fun getDisplayName(): String = "英語"
    },
    CHINESE{
        override fun getDisplayName(): String = "中国語"
    }; //先に列挙の値を定義

    abstract fun getDisplayName(): String
}

fun main() {
    for(l in Language.values()){
        println(l.getDisplayName())
    }
}