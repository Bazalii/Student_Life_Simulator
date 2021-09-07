package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class UssrBicycleState : BicycleState() {

    @kotlinx.serialization.Transient
    override val price = 2000

    override val best_delivery: Delivery? = Delivery.SLOW_DELIVERY

    override fun changeState(bag: Player.Bag) {
        bag.bicycle = UsualBicycleState()
    }

}
