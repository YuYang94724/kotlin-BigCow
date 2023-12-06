package c11

interface DAOInterface { //插入数据
    fun create(): Int //查询所有数据
    fun findAll(): Array<Any>?
}

object UserDAO : DAOInterface {
    //保存所有数据属性
    private var datas: Array<Any>? = null
    override fun create(): Int {
        //TODO 插入数据
        return 0
    }

    override fun findAll(): Array<Any>? {
        //TODO 查询所有数据
        return datas
    }
    object Singleton{
        val i = 10
    }
}

class Out{
    object Sop{
        val i =10
    }
    object Swp{
        val i =10
    }
}

fun main() {
    UserDAO.create()
    var datas = UserDAO.findAll()
    val create = OrderDAO().create()
    val findAll = OrderDAO().findAll()
}

class OrderDAO : DAOInterface {
    //保存所有数据属性
    private var datas: Array<Any>? = null
    override fun create(): Int {
        //TODO 插入数据
        return 0
    }

    override fun findAll(): Array<Any>? {
        //TODO 查询所有数据
        return datas
    }
}