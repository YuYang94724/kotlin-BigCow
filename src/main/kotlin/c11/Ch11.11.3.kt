package c11

import java.util.*

class Account3 {
    // 实例属性账户金额
    var amount = 0.0

    // 实例属性账户名
    var owner: String? = null

    // 实例函数
    fun messageWith(): String {
        //实例函数可以访问实例属性、实例函数、静态属性和静态函数
        val interest = interestBy(amount)
        return "${owner}的利息是$interest"
    }

    init {
        owner = "Fake"
        amount = 100_000_000.0
        println("容器初始化")
    }

//    companion object {
//        // 静态属性利率
//        var interestRate: Double = 0.0
//
//        // 静态函数
//        fun interestBy(amt: Double): Double {
//            // 静态函数可以访问静态属性和其他静态函数
//            return interestRate * amt
//        }
//
//        // 静态代码块
//        init {
//            println("静态代码块被调用...")
    // 初始化静态属性
//            interestRate = 0.0668
//        }
//    }

    companion object : Date(), OnClickListener {
        override fun onClick() {
        }

        override fun onHover() {
        }

        // 静态属性利率
        var interestRate: Double = 0.0

        // 静态函数
        fun interestBy(amt: Double): Double {
            // 静态函数可以访问静态属性和其他静态函数
            return interestRate * amt
        }
        fun extendFun() {
            println(interestRate)
        }
        // 静态代码块
        init {
            println("静态代码块被调用...")
            // 初始化静态属性
            interestRate = 0.0668
        }
    }
}

fun main() {
    //有companion object可以不用()
    val myAcc = Account3
    val testAcc = Account3()

    println(testAcc.messageWith())
    println(testAcc.owner)
    println(Account3.interestRate)

    // 访问伴生对象属性
    println(Account3.interestRate)
    println(Account3.interestBy(1_000.00))

    println(myAcc.interestRate)
    println(myAcc.interestBy(1_000.00))
    Account3.extendFun()
}
