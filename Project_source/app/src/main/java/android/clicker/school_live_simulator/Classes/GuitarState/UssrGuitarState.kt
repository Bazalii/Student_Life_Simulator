package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.Enum_classes.Shop
import kotlinx.serialization.Serializable

@Serializable
open class UssrGuitarState : GuitarState() {

    @kotlinx.serialization.Transient
    override val price: Int = Shop.USSR_GUITAR.money_diff

    @kotlinx.serialization.Transient
    override val happiness: Int = Shop.USSR_GUITAR.happiness

    @kotlinx.serialization.Transient
    override val available_courses = arrayListOf<GuitarCourseState>(
        YardGuitarCourseState()
    )

    override fun changeState(bag: Player.Bag) {
        bag.guitar = UralGuitarState()
    }
}
