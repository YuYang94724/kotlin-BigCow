package c10


fun main(args: Array<String>) {
    printArea(320.0, 480.0) //没有采用命名参数函数调用
    printArea(width = 320.0, height = 480.0)//采用命名参数函数调用
    printArea(320.0, height = 480.0)//采用命名参数函数调用
    printArea(width = 320.0, 480.0)
    printArea(height = 480.0, width = 320.0)//采用命名参数函数调用 5
}

fun printArea(width: Double, height: Double): Unit { val area = width * height
    println("$width x $height 长方形的面积:$area")
}