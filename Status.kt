enum class Status {
    Processing{
        override fun StatusName() = "Заказ обрабатывается..."
        
        override val num = 1
    },
    OnTheWay{
        override fun StatusName() = "Заказ в пути."
        override val num = 2
    },
    InStock{
        override fun StatusName() = "Заказ на складе."
        override val num = 3
    },
    OrderPickUpPoint{
        override fun StatusName() = "Заказ в ПВЗ"
        override val num = 4
    },
    Issued{
        override fun StatusName() = "Заказ выдан."
        override val num = 5
    };

    abstract val num:Int
    abstract fun StatusName():String
    abstract fun PossibilityOfFailure():String //возможность отказаться от товара

    fun WaitingTime(){
        when(num){
            1 -> println("Ждать примерно 7-10 дней")
            2 -> println("Ждать примерно 5-7 дней")
            3 -> println("Ждать примерно 2-3 дня")
            4 -> println("Можете забирать!")
        }
    }
}