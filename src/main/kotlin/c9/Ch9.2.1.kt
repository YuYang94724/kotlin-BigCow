package c9

fun main() {
    val testScore = 75 //设定一个数值用来测试
    when (testScore / 10) {
        9 -> {
            println('优')
        }
        8 -> println('良')
        7, 6 -> println('中')
        else -> println('差')
    }

}