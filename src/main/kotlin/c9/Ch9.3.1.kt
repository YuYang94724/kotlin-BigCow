package c9

fun main() {
    var i = 0
    while (i * i < 100_000) {//采用下划线分割数值可读性好
        i++
    }
    println("i = " + i) //输出结果是i = 317
    println("i * i = " + i * i) //输出结果是i * i = 100489
}