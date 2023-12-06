package c10

fun main() {
    printArea1(320.0, 480.0)
    printArea2(320.0, 480.0)
}

fun printArea1(width: Double, height: Double): Unit {
    val area = width * height
    println("$width x $height 长方形的面积:$area")
    return//可省略
}

fun printArea2(width: Double, height: Double) {
    val area = width * height
    println("$width x $height 长方形的面积:$area")
}