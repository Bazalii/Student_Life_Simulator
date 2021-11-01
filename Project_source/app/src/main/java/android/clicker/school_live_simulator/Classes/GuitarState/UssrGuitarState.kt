package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.EnumClasses.ShopItems
import kotlinx.serialization.Serializable

@Serializable
open class UssrGuitarState : GuitarState() {

    @kotlinx.serialization.Transient
    override val price: Int = ShopItems.USSR_GUITAR.money_diff

    @kotlinx.serialization.Transient
    override val happiness: Int = ShopItems.USSR_GUITAR.happiness

    @kotlinx.serialization.Transient
    override val available_courses = arrayListOf<GuitarCourseState>(
        YardGuitarCourseState()
    )

    override fun changeState(bag: Player.Bag) {
        bag.guitar = UralGuitarState()
    }
}
