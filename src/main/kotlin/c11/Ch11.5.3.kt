package c11

fun main() {
    val dept = Department()
    dept.name = "智捷课堂"
    dept.no = 100

    println(dept.desc)
    dept.desc = "成员: ${dept.no} - ${dept.name}"
    println(dept.display())
    println(dept.desc)
    println(dept.display("My"))

    //自定義中缀函數
    dept rp 3
    dept pr 200
}

fun Department.display() : String {
    return "扩展: [no=${this.no}, name=${this.name}]"
}

fun Department.display(f: String): String {
    return "扩展: $f, [no=${this.no}, name=${this.name}] "
}