package c11

fun main() {
    val user1 = UserT("Tony", "123")
    val user2 = UserT("Tony", "123")
    val user3 = user1.copy()
    println(user1 == user2)
    println(user1.hashCode())
    println(user2.hashCode())
    println(user1.hashCode() == user2.hashCode())

    val(name1,pwd1) = user1
    println(name1) //Tony
    println(pwd1) //123
    val(name2, _) = user1
    println(name2) //Tony
}