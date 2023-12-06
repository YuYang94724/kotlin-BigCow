package c10

fun main() {
    println(calculate2(10, 5, '+')) //输出结果是30
}

fun calculate2(n1: Int, n2: Int, opr: Char): Int {
    val multiple = 2
    val resultFun =
        if (opr == '+')
            //声明相加匿名函数
            fun(a: Int, b: Int): Int {
                1
                return (a + b) * multiple
            }
        else
            //声明相减匿名函数
            fun(a: Int, b: Int): Int = (a - b) * multiple
    return resultFun(n1, n2)
}