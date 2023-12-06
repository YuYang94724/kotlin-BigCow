package c11

import kotlin.properties.Delegates

class Department {
    var no: Int = 10 // 部门编号属性
    var name: String by Delegates.observable("<无>") { p, oldValue, newValue ->
        println("${p.name} $oldValue -> $newValue")
    }

    //一開始初始化就給值了
    var desc: String = "成员: ${no} - ${name}"

    fun display(): String {
        return "成员: [no=${this.no}, name=${this.name}]"
    }

    //定义中缀函数rp
    infix fun rp(times: Int) {
        repeat(times) {
            println(no)
        }
    }

    infix fun pr(len: Int){
        no += len
        println(no)
    }
}

fun main() {
    val dept = Department()
    dept.no = 20
    dept.name = "技术部" //输出<无> -> 技术部
    dept.name = "市场部"
}