package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.IsNotAvailableException
import kotlinx.serialization.*

@Serializable
open class NullBicycleState : BicycleState() {
    override val price: Int = 0

    override val best_delivery: Delivery? = null

    override fun changeState(bag: Player.Bag) {
        bag.bicycle = UssrBicycleState()
    }
}
