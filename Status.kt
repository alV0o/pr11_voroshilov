enum class Status {
    Processing{
        override fun StatusName() = "Заказ обрабатывается..."
        override val num = 1
        override val PossibilityOfFailure = true
    },
    OnTheWay{
        override fun StatusName() = "Заказ в пути."
        override val num = 2
        override val PossibilityOfFailure = true
    },
    InStock{
        override fun StatusName() = "Заказ на складе."
        override val num = 3
        override val PossibilityOfFailure = false
    },
    OrderPickUpPoint{
        override fun StatusName() = "Заказ в ПВЗ"
        override val num = 4
        override val PossibilityOfFailure = false
    },
    Issued{
        override fun StatusName() = "Заказ выдан."
        override val num = 5
        override val PossibilityOfFailure = false
    };

    abstract val num:Int
    abstract fun StatusName():String
    abstract val PossibilityOfFailure:Boolean //возможность отказаться от товара

    fun WaitingTime(){
        when(num){
            1 -> println("Ждать примерно 7-10 дней")
            2 -> println("Ждать примерно 5-7 дней")
            3 -> println("Ждать примерно 2-3 дня")
            4 -> println("Можете забирать!")
        }
    }

    fun RefusalOfGoods(){
        when(PossibilityOfFailure){
            true -> println("Товар успешно отменен!")
            else -> println("Товар нельзя отменить")
        }
    }

    fun NextStatus(){
        when(num){
            1-> println("Следующее состояние: ${OnTheWay.StatusName()}")
            2-> println("Следующее состояние: ${InStock.StatusName()}")
            3 -> println("Следующее состояние: ${OrderPickUpPoint.StatusName()}")
            4 -> println("Следующее состояние: ${Issued.StatusName()}")
            5 -> println("Следующее состояние: Отсутствует")
        }
    }
}
