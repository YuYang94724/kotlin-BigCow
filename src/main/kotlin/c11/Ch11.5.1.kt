package c11

fun main() {
    val interest1 = 10_000.00.interestBy(0.0668)
    println("利息1: $interest1")

    val account = Account()
    account.amount = 10_000.00
    val interest2 = account.interestBy(0.0668)
    println("利息2: $interest2")

    val inFun = 10_100.00 interestBy 0.0668
    println(inFun)
}

//基本数据类型扩展
infix fun Double.interestBy(interestRate: Double): Double {
    return this * interestRate
}

//自定义账户类
class Account {
    var amount: Double = 0.0
    var owner: String = ""
//账户金额 //账户名
}
//账户类扩展函数
fun Account.interestBy(interestRate: Double): Double {
    return this.amount * interestRate
}