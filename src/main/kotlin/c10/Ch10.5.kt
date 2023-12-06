package c10

fun main() {
    print(calculate(opr = '+')) //输出结果是30
//    add(10, 5) // 编译错误
//    sub(10, 5) // 编译错误
}
fun calculate(n1: Int = 10, n2: Int= 5, opr: Char): Int {
    val multiple = 2
    //声明相加函数
    fun add(a: Int, b: Int): Int {
        return (a + b) * multiple
    }

    //声明相减函数
    fun sub(a: Int, b: Int): Int = (a - b) * multiple
    return if (opr == '+') add(n1, n2) else sub(n1, n2)
}