package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.Enum_classes.ShopItems
import kotlinx.serialization.Serializable

@Serializable
open class YamahaGuitarState : GuitarState() {

    @kotlinx.serialization.Transient
    override val price: Int = ShopItems.YAMAHA_GUITAR.money_diff

    @kotlinx.serialization.Transient
    override val happiness: Int = ShopItems.YAMAHA_GUITAR.happiness

    @kotlinx.serialization.Transient
    override val available_courses = arrayListOf(
        YardGuitarCourseState(),
        FirstSongCourseState(),
        YardSongCourseState()
    )

    override fun changeState(bag: Player.Bag) {
        bag.guitar = FenderGuitarState()
    }
}
