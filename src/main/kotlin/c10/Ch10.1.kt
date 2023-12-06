package c10

fun main() {
    println("320x480的长方形的面积:${rectangleArea(320.0, 480.0)}")
}

fun rectangleArea(width: Double, height: Double): Double {
    val area = width * height
    return area
}