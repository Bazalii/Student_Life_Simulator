package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.Enum_classes.ShopItems
import kotlinx.serialization.Serializable

@Serializable
class MountainBicycleState : BicycleState() {

    @kotlinx.serialization.Transient
    override val price = ShopItems.MOUNTAIN_BICYCLE.money_diff

    @kotlinx.serialization.Transient
    override val happiness = ShopItems.MOUNTAIN_BICYCLE.happiness

    override val best_delivery: Delivery? = Delivery.FAST_DELIVERY

    override fun changeState(bag: Player.Bag) {}
}
