package c9

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in numbers.indices) {
        if (i == 3) {
            // 跳出循环
            break
        }
        println("Count is: " + i)
    }

    label1@
    for (x in 0..4) {
        for (y in 5 downTo 1){
            if (y == x){
                break@label1
            }
            println("(x,y) = ($x,$y)")
        }
    }
    println("Game Over!")
}