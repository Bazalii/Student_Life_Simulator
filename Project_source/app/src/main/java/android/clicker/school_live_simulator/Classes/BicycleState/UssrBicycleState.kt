package android.clicker.school_live_simulator

open class UssrBicycleState : NullBicycleState() {
    override val price = 2000

    override val best_delivery: Delivery? = Delivery.SLOW_DELIVERY

    override fun changeState(bag: Player.Bag) {
        bag.bicycle = UsualBicycleState()
    }

}
