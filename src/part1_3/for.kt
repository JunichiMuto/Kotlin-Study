package part1_3

fun main() {
    val list = arrayOf("花鳥風月", "山紫水明", "百花繚乱")
    for(item in list){
        println(item)
    }

    //マップの場合 toは中置記法と言う
    val map = mapOf("1月" to "睦月", "2月" to "如月")
    for((key, value) in map){
        println("${key}:${value}")
    }

    //配列インデックスを得る
    for((index, value) in list.withIndex()){
        println("${index}:${value}")
    }
    //インデックスだけ欲しい時
    for(index in list.indices){
        println(index)
    }

    //指定した回数だけ繰り返す（従来のfor）
    for(i in 1..10){
        println(i)
    }
    //<=の場合
    for(i in 1 until 10){
        println(i)
    }
    //デクリメントする
    for(i in 10 downTo 1){
        println(i)
    }
    //増分を変える
    for(i in 1..10 step 3){
        println(i)
    }
}