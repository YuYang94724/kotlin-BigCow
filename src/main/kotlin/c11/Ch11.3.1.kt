package c11

import apple.laf.JRSUIConstants.Animating

fun main() {
    val animal = Animal()
}

class Animal {
    // 动物年龄
    var age = 1

    // 动物性别
    var sex = false

    // 动物体重
    private val weight = 0.0


    private fun eat() {
        // 函数体
    }

    fun run(): Int {
        // 函数体
        return 10
    }

    fun getMaxNumber(n1: Int, n2: Int) = if (n1 > n2) n1 else n2
}