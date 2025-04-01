enum class Colors {
    RED{
        override fun ColorName() = "Красный"
        override val rgb = "#FF0000"
        override val priceOfColors = 100
        override val num = 1

        override fun TrafficLight() = "Стоп! Ехать нельзя"
    },
    BLUE{
        override fun ColorName() = "Синий"
        override val rgb = "#0000FF"
        override val priceOfColors = 100
        override val num = 2

        override fun TrafficLight() = "Этот цвет не используется в светофоре!"
    },
    GREEN{
        override fun ColorName() = "Зеленый"
        override val rgb = "#008000"
        override val priceOfColors = 100
        override val num = 3

        override fun TrafficLight() = "Можно ехать."
    },
    YELLOW{
        override fun ColorName() = "Желтый"
        override val rgb = "#FFFF00"
        override val priceOfColors = 120
        override val num = 4

        override fun TrafficLight() = "Приготовься или затормози!"
    },
    PURPLE{
        override fun ColorName() = "Фиолетовый"
        override val rgb = "#800080"
        override val priceOfColors = 200
        override val num = 5

        override fun TrafficLight() = "Этот цвет не используется в светофоре!"
    };

    abstract fun ColorName():String
    abstract val num:Int
    abstract val rgb:String
    abstract val priceOfColors:Int //цена за 100мл

    abstract fun TrafficLight():String

    fun PriceTomatoPerColor(){
        when(ColorName()){
            "Красный" -> println("Цена за кг помидоров - 100")
            "Желтый" -> println("Цена за кг помидоров - 75")
            "Зеленый" -> println("Цена за кг помидоров - 50")
            else -> println("-")
        }
    }

    fun SizeCan(){
        when(num){
            in 1..3 -> println("Большая банка. Цена: ${priceOfColors*10}")
            4 -> println("Средняя банка. Цена: ${priceOfColors*5}")
            5 -> println("Маленькая банка. Цена: ${priceOfColors * 3}")
        }
    }


}