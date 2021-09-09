package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
class DoubleNeckGuitarState : GuitarState() {

    @kotlinx.serialization.Transient
    override val price: Int = 150000

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
