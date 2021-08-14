package android.clicker.school_live_simulator

open class UsualBicycleState : BicycleState() {
    override val price = 10000

    override val available_delivery  = arrayListOf<Delivery>(Delivery.SLOW_DELIVERY,Delivery.USUAL_DELIVERY)

    override fun changeState(bag: Player.Bag) {
        bag.bicycle = MountainBicycleState()
    }
}
