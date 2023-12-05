package c7

fun main() {
    val s1 = "Hello"
    // 使用+运算符连接
    val s2 = s1 + " "
    val s3 = s2 + "World"
    println(s3)//Hello World

    var s4 = "Hello"
    // 使用+运算符连接，支持+=赋值运算符 s4 += " "
    s4 += " World"
    println(s4)//Hello World
    val age = 18
    val s5 = "她的年龄是" + age + "岁。"
    println(s5)//她的年龄是18岁。
    val score = 'A'
    val s6 = "她的英语成绩是" + score
    println(s6)//她的英语成绩是A
    val now = java.util.Date() //对象拼接自动调用toString()函数
    val s7 = "今天是:" + now
    println(s7)
}