package c7

fun main() {
    val pattern = """\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}"""
    val string = "eoreint@sina.com"
    //val regex = Regex(pattern)
    val regex = pattern.toRegex()
    println(regex.matches(string))

    //全部是数字模式
    val regex2 = Regex("""\d+""")
    val input1 = "1000"
    val input2 = "¥1000"
    println(regex2.matches(input1))//true
    println(regex2.matches(input2))//false

    println(regex2.containsMatchIn(input1))//true
    println(regex2.containsMatchIn(input2))//true
}