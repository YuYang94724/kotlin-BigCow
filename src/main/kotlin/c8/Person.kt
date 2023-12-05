package c8

class Person(val name: String, val age: Int) {
    //自定义比较规则
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Person) {
            return false
        }
        return (name == other.name && age == other.age)
    }
}

fun main() {
    val value1 = 1
    val value2 = 2
    println(value1 == value2)//f
    println(value1.toDouble() == 1.0)//t
    println(value1 != value2)//t
    println(value1 > value2)//f
    println(value1 < value2)//t
    println(value1 <= value2)//t

    val p1 = Person("Tony", 18)
    val p2 = Person("Tony", 18)
    val p3 = Person("Tom", 20)
    val p4 = p3

    println(p1 == p2)//t
    println(p1 == p3)//f
    println(p3 === p4)  //t
}