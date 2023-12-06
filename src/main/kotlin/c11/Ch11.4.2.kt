package c11

fun main() {
    val emp = Employee()
    println(emp.fullName)//Tony.Guan
//    emp.fullName = "Tom.Guan"
    println(emp.fullName)//Tom.Guan
    emp.salary = -10.0 //不接收负值
    println(emp.salary)//0.0
    emp.salary = 10.0
    println(emp.salary)//10.0
}