package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
class MountainBicycleState : BicycleState() {

    @kotlinx.serialization.Transient
    override val price = 40000

    override val best_delivery: Delivery? = Delivery.FAST_DELIVERY

    override fun changeState(bag: Player.Bag) {}
}
