package android.clicker.school_live_simulator

class MountainBicycleState : UsualBicycleState() {
    override val price = 40000

    override val best_delivery: Delivery? = Delivery.FAST_DELIVERY

    override fun changeState(bag: Player.Bag) {}
}
