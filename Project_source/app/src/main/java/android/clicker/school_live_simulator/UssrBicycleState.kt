package android.clicker.school_live_simulator

open class UssrBicycleState : NullBicycleState() {
    override val price = 2000

    init {
        available_delivery.add(Delivery.SLOW_DELIVERY)
    }

    override fun changeState(bag: Player.Bag) {
        bag.bicycle = UsualBicycleState()
    }

}
