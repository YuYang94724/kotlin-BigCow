package c7

fun main() {
    val string = "AB12CD34EF"
    val regex = Regex("""\d+""")
    val result = regex.split(string)
    println(result)
}