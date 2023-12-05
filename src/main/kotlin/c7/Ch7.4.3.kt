package c7

fun main() {
    val string = "AB12CD34EF"
    val regex = Regex("""\d+""")
    val result = regex.find(string)
    println("第1个匹配字符串:${result?.value}")

    regex.findAll(string).forEach {
        println(it.value)
    }


}