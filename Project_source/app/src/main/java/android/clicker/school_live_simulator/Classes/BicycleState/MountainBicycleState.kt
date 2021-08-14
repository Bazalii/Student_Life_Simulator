package android.clicker.school_live_simulator

class MountainBicycleState : BicycleState() {
    override val price = 40000

    init {
        available_delivery.add(Delivery.FAST_DELIVERY)
    }

    override fun changeState(bag: Player.Bag) {}
}
