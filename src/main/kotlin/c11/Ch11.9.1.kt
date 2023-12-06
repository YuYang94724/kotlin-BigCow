package c11

fun main() {
    val day = WeekDays.FRIDAY
    println(day)
    when (day) {
        WeekDays.MONDAY -> println("星期一")
        WeekDays.TUESDAY -> println("星期二")
        WeekDays.WEDNESDAY -> println("星期三")
        WeekDays.THURSDAY -> println("星期四")
        else //case FRIDAY:
        -> println("星期五")
    }

    val allWeekDays = WeekDays.entries
    allWeekDays.forEach(::easyP)
    println(allWeekDays)
    val day1 = WeekDays.valueOf("FRIDAY")
    println(WeekDays.FRIDAY == day1)
    println(WeekDays.FRIDAY.equals(day1))
    println(WeekDays.FRIDAY === day1)
    println(day1 === day)
}

fun <T> easyP(v: T) = println(v)