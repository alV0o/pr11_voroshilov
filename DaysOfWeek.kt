enum class DaysOfWeek {
    Monday {
        override fun DayInRussian() = "Понедельник"
        override fun TimeEndOfWork() = "17:00"
        override val num = 1
    },
    Tuesday {
        override fun DayInRussian() = "Вторник"
        override fun TimeEndOfWork() = "17:00"
        override val num = 2
    },
    Wednesday{
        override fun DayInRussian() = "Среда"
        override fun TimeEndOfWork() = "17:00"
        override val num = 3
    },
    Thursday{
        override fun DayInRussian() = "Четверг"
        override fun TimeEndOfWork() = "17:00"
        override val num = 4
    },
    Friday{
        override fun DayInRussian() = "Пятница"
        override fun TimeEndOfWork() = "16:00"
        override val num = 5
    },
    Saturday{
        override fun DayInRussian() = "Суббота"
        override fun TimeEndOfWork() = "-"
        override val num = 6
    },
    Sunday{
        override fun DayInRussian() = "Воскресенье"
        override fun TimeEndOfWork() = "-"
        override val num = 7
    };

    abstract val num: Int
    abstract fun DayInRussian(): String
    fun WeekendOrWeekday(){
        when(num){
            in 1..5 -> println("Рабочий день")
            in 6..7 -> println("Выходной день")
        }
    }
    abstract fun TimeEndOfWork():String

    fun DiscountOnTransportForDay(){
        when(num){
            in 1..4 -> println("Скидка на транспорт - 20%")
            5 -> println("Скидка на транспорт - 15%")
            in 6..7 -> println("Скидка на транспорт отсутствует")
        }
    }


}