package android.clicker.school_live_simulator

class MountainBicycleState : BicycleState() {
    override val price = 40000

    override val available_delivery  = arrayListOf<Delivery>(Delivery.SLOW_DELIVERY, Delivery.USUAL_DELIVERY, Delivery.FAST_DELIVERY)

    override fun changeState(bag: Player.Bag) {}
}
