package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class FenderGuitarState : GuitarState() {

    @kotlinx.serialization.Transient
    override val price: Int = 40000

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
