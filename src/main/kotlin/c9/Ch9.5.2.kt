package c9

fun main() {
    val strArray = arrayOf("刘备", "关羽", "张飞")
    val name = "赵云"
    if (name !in strArray) {
        println(name + "不在队伍中")
    }
}