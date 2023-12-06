package c11

class Rectangle (w: Int, h: Int) {

    var width: Int
    var height: Int
    var area: Int

    init { //初始化代码块
        width = w
        height = h
        area = w * h// 计算矩形面积
    }

    constructor(width: Int, height: Int, area: Int) : this(width, height) {
        this.area = area
    }
    constructor(area: Int) : this(200, 100) {
        this.area = area
    }
}

fun main() {
    val rect = Rectangle(100, 50)
    val rect2 = Rectangle(50, 25, 10)
    val rect1 = Rectangle(10)

    println("${rect.area}")
    println("${rect1.area}")
    println("${rect2.area}")
}
