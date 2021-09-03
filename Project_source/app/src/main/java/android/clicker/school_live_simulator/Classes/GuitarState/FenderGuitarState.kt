package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class FenderGuitarState : GuitarState() {
    override val price: Int = 40000

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
