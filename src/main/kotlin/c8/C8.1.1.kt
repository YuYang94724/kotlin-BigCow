package c8

fun main() {
    var a = 12
    println(-a) //a取反，结果输出是-12
    var b = a++
    println(b) //结果输出是12
    b = a
    println(b)
    b = ++a
    println(b) //结果输出是14
}