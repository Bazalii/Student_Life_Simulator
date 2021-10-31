package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.EnumClasses.ShopItems
import kotlinx.serialization.Serializable

@Serializable
open class UssrBicycleState : BicycleState() {

    @kotlinx.serialization.Transient
    override val price = ShopItems.USSR_BICYCLE.money_diff

    @kotlinx.serialization.Transient
    override val happiness = ShopItems.USSR_BICYCLE.happiness

    override val best_delivery: Delivery? = Delivery.SLOW_DELIVERY

    override fun changeState(bag: Player.Bag) {
        bag.bicycle = UsualBicycleState()
    }

}
