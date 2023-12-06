package c11

fun main() {
    val message = (-7).errorMessage
    println("Error Code: -7 , Error Message:  $message")

    val dept = Department()
    dept.name ="智捷课堂"
    dept.no = 100
    println(dept.desc)
    dept.desc = "技术部门"
    println(dept.desc)
}

var Department.desc: String
    get() {
        return "扩展: [no=${this.no}, name=${this.name}]"
    }
    set(value) {
        println(value)
//println(field)//编译错误
    }


val Int.errorMessage: String
    get() = when (this) {
        -7 -> "没有数据。"
        -6 -> "日期没有输入。"
        -5 -> "内容没有输入。"
        -4 -> "ID没有输入。"
        -3 -> "数据访问失败。"
        -2 -> "您的账号最多能插入10条数据。"
        -1 -> "用户不存在，请到http://51work6.com注册。"
        else -> ""
    }