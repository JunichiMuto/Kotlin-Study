package part1_3

fun main() {
    //continue
    var result = 1
    val list = listOf(1,5,0,10)
    for(item in list){
        result *= if(item != 0) item else continue
    }
    println(result)

    //break
    for(i in 1..9){
        for(j in 1..9){
            if(i * j > 30){
                break;
            }
            print("${i*j} ")
        }
        println()
    }

    //gotoみたいの
    outer@ for(i in 1..9){
        for(j in 1..9){
            if(i * j > 30){
                break@outer
            }
            print("${i*j} ")
        }
        println()
    }

}