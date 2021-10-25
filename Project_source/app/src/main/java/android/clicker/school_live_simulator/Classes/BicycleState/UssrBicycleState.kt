package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.Enum_classes.Shop
import kotlinx.serialization.Serializable

@Serializable
open class UssrBicycleState : BicycleState() {

    @kotlinx.serialization.Transient
    override val price = Shop.USSR_BICYCLE.money_diff

    @kotlinx.serialization.Transient
    override val happiness = Shop.USSR_BICYCLE.happiness

    override val best_delivery: Delivery? = Delivery.SLOW_DELIVERY

    override fun changeState(bag: Player.Bag) {
        bag.bicycle = UsualBicycleState()
    }

}
