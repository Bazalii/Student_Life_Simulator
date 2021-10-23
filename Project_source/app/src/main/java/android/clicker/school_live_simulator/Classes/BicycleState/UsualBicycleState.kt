package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.Enum_classes.Shop
import kotlinx.serialization.Serializable

@Serializable
open class UsualBicycleState : BicycleState() {

    @kotlinx.serialization.Transient
    override val price = Shop.USUAL_BICYCLE.money_diff

    @kotlinx.serialization.Transient
    override val happiness = Shop.USUAL_BICYCLE.happiness

    override val best_delivery: Delivery? = Delivery.USUAL_DELIVERY

    override fun changeState(bag: Player.Bag) {
        bag.bicycle = MountainBicycleState()
    }
}
