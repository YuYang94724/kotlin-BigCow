package c8

fun main() {
    var a = 1
    val b = 2
    a += b      //相当于a =a+b
    println(a)  //输出结果3

    a += b + 3  //相当于a =a+b+3
    println(a)  //输出结果8

    a -= b      //相当于a = a-b
    println(a)  //输出结果6

    a *= b      // 相当于 a=a*b
    println(a)  //输出结果12

    a /= b      // 相当于 a=a/b
    println(a)  //输出结果6

    a %= b      // 相当于 a=a%b
    println(a) //输出结果0
}