package c8

fun main() {
    val i = 0
    var a = 10
    var b = 9

    if (a > b || i == 1) {
        println("或运算为 真")
    } else {
        println("或运算为 假")
    }

    if (a < b && i == 1) {
        println("与运算为 真")
    } else {
        println("与运算为 假")
    }
    //a++ == --b不會執行
    if (a > b || a++ == --b) {
        println("a = " + a)
        println("b = " + b)
    }
    println("a = " + a)
    println("b = " + b)
}