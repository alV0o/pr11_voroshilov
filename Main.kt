fun main(){
    val day = DaysOfWeek.Wednesday
    println(day.DayInRussian())
    println("Время окончания рабочего дня: " + day.TimeEndOfWork())
    day.WeekendOrWeekday()
    day.DiscountOnTransportForDay()
    println()
    val color = Colors.YELLOW
    println(color.ColorName())
    println(color.rgb)
    println(color.priceOfColors)
    color.PriceTomatoPerColor()
    color.SizeCan()
    println(color.TrafficLight())
}