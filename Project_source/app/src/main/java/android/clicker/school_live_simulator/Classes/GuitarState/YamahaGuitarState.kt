package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class YamahaGuitarState : GuitarState() {

    @kotlinx.serialization.Transient
    override val price: Int = 12000

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
