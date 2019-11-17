package 速習Kotlin.part8

class Book(private val map: Map<String, Any?>){
    //マップを委譲として利用
    val title: String by map
    val price: Int by map
    val isPublished: Boolean by map
}

class Book2(private val map: MutableMap<String, Any?>){
    //マップを委譲として利用
    var title: String by map
    var price: Int by map
    var isPublished: Boolean by map
}


fun main() {
    val b = Book(mapOf(
            "title" to "速習Kotlin",
            "price" to 454,
            "isPublished" to true
    ))
    println(b.title)
    println(b.price)
    println(b.isPublished)

    val b2 = Book2(mutableMapOf(
            "title" to "速習Kotlin",
            "price" to 454,
            "isPublished" to true
    ))
    b2.title = "速習React"
    println(b2.title)
    println(b2.price)
    println(b2.isPublished)
}