package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.Enum_classes.Shop
import kotlinx.serialization.Serializable

@Serializable
open class FenderGuitarState : GuitarState() {

    @kotlinx.serialization.Transient
    override val price: Int = Shop.FENDER_GUITAR.money_diff

    @kotlinx.serialization.Transient
    override val happiness: Int = Shop.FENDER_GUITAR.happiness

    @kotlinx.serialization.Transient
    override val available_courses = arrayListOf(
        YardGuitarCourseState(),
        FirstSongCourseState(),
        YardSongCourseState(),
        MusicalSchoolCourseState()
    )

    override fun changeState(bag: Player.Bag) {
        bag.guitar = DoubleNeckGuitarState()
    }
}
