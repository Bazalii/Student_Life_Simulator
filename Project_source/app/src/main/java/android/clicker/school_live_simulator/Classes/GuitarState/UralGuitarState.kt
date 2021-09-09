package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class UralGuitarState : GuitarState() {

    @kotlinx.serialization.Transient
    override val price: Int = 5000

    @kotlinx.serialization.Transient
    override val available_courses = arrayListOf(
        YardGuitarCourseState(),
        FirstSongCourseState()
    )

    override fun changeState(bag: Player.Bag) {
        bag.guitar = YamahaGuitarState()
    }
}
