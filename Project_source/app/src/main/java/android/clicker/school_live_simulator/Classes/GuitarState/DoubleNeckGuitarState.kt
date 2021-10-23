package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.Enum_classes.Shop
import kotlinx.serialization.Serializable

@Serializable
class DoubleNeckGuitarState : GuitarState() {

    @kotlinx.serialization.Transient
    override val price: Int = Shop.DOUBLE_NECK_GUITAR.money_diff

    @kotlinx.serialization.Transient
    override val happiness: Int = Shop.DOUBLE_NECK_GUITAR.happiness

    @kotlinx.serialization.Transient
    override val available_courses = arrayListOf(
        YardGuitarCourseState(),
        FirstSongCourseState(),
        YardSongCourseState(),
        MusicalSchoolCourseState(),
        MusicalObservatoryCourseState()
    )

    override fun changeState(bag: Player.Bag):
        Unit = throw UnsupportedOperationException("Operation not supported")
}
