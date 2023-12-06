package c11

class Employee {
    var no: Int = 0 // 员工编号属性
    var job: String? = null // 工作属性
    //延遲加載
    lateinit var dept: Department

    var firstName: String = "Tony"
    var lastName: String = "Guan"
    //惰性加載
    val fullName: String by lazy {
        "$firstName.$lastName"
    }
//    var fullName: String //全名
//        get() {
//            return firstName + "." + lastName
//        }
//        set(value) {
//            val name = value.split(".")
//            firstName = name[0]
//            lastName = name[1]
//        }
    var salary: Double = 0.0 // 薪资属性
        set(value) {
            if (value >= 0.0) field = value
        }
}

// 部门类
//class Department {
//    var no: Int = 0 // 部门编号属性
//    var name: String = "" // 部门名称属性
//}