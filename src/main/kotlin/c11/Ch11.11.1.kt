package c11

fun main() {
    var i = 10
    val v = View()
    // 对象表达式作为函数参数
    v.handler(object : OnClickListener {
        override fun onClick() {
            println("111对象表达式作为函数参数...")
            println(++i)
        }

        override fun onHover() {
            println("222对象表达式作为函数参数...")
            println(++i)
        }
    })

    val person = object : Person("Tony", 18), OnClickListener {
        override fun onClick() {
            println("实现接口onClick函数...")
        }

        override fun onHover() {
            println("实现接口onHover函数...")
        }

        //重写toString函数
        override fun toString(): String {
            return ("Person[name=$name, age=$age]")
        }

        fun test(){
            println("test...")
        }
    }
    println(person)

    //无具体父类对象表达式
    var rectangle = object {
        // 矩形宽度
        var width: Int = 200 // 矩形高度
        var height: Int = 300
        //重写toString函数
        override fun toString(): String {
            return ("[width=$width, height=$height]")
        }
    }
    println(rectangle)
}

//声明OnClickListener接口
interface OnClickListener {
    fun onClick()
    fun onHover()
}

open class Person(val name: String, val age: Int)