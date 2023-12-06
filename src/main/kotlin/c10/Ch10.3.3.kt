package c10

fun main() {
    println(sum(100.0, 20.0, 30.0)) //输出150.0
    println(sum(30.0, 80.0)) //输出110.0
    println(sum(30.0, 80.0, multiple = 2)) //输出220.0 multiple需要指定名稱

    val doubleAry = doubleArrayOf(50.0, 60.0, 0.0)
    //* 是展開運算子,將陣列中的元素展開為可變參數 但還是算第一個numbers的參數
    println(sum(30.0, 80.0, *doubleAry)) //输出220.0 使用預設 Int = 1
}

fun sum(vararg numbers: Double, multiple: Int = 1): Double {
    var total = 0.0
    println("multiple = $multiple")
    for (number in numbers) {
        total += number
    }
    return total * multiple
}