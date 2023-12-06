package c9

fun main() {
    val numbers = intArrayOf(43, 32, 53, 54, 75, 7, 10)
    for (number in numbers) {
        println("Count is:$number")
    }

    for (i in numbers.indices) { //获取数组索引
        println("numbers[$i] = ${numbers[i]}")
    }
    println(numbers.size)


}