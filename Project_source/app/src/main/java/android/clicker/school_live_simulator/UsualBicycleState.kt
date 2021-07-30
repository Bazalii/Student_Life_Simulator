package android.clicker.school_live_simulator

open class UsualBicycleState: UssrBicycleState() {
    override val price = 10000
    init{
        available_delivery.add(Delivery.USUAL_DELIVERY)
    }
    override fun changeState(bag : Player.Bag) {
        bag.bicycle = MountainBicycleState()
    }
}
