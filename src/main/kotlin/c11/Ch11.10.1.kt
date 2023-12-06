package c11

class View {
    //外部類別屬性
    val x = 20

    class Button {
        //嵌套類函數
        fun onClick() {
            println("onClick...") //不能访问外部类的成员
            // println(x) //编译错误
        }
    }

    fun test() {
        val button = Button()
        button.onClick()
    }

    fun handler(listener: OnClickListener) {
        listener.onClick()
    }
}

class Outer {
    val x = 10
    fun printOuter() {
        println("调用外部函数...")
    }

    fun test(){
        val inner = Inner()
        inner.display()
    }

    inner class Inner {
        // 内部类属性
        private val x = 5

        fun display() {
            // 访问外部类的属性x
            println("外部类属性 x = " + this@Outer.x)
            // 访问内部类的属性x
            println("内部类属性 x = " + this.x)
            println("内部类属性 x = " + x)
            // 调用外部类的成员函数
            this@Outer.printOuter()
            printOuter()
        }
        fun printOuter(){
            println("調用內部函數")
        }
    }
}

fun main(args: Array<String>) {
    val button = View.Button()
    button.onClick()

    // 测试调用嵌套类
    val view = View()
    view.test()
    //測試內部類別
    val outer = Outer()
    outer.test()

    val inner = Outer().Inner()
    inner.display()
}