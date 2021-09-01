package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class UsualBicycleState : BicycleState() {
    override val price = 10000

    override val best_delivery: Delivery? = Delivery.USUAL_DELIVERY

    override fun changeState(bag: Player.Bag) {
        bag.bicycle = MountainBicycleState()
    }
}
