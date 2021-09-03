package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class UralGuitarState : GuitarState() {
    override val price: Int = 5000

    override val available_courses = arrayListOf(
        YardGuitarCourseState(),
        FirstSongCourseState()
    )

    override fun changeState(bag: Player.Bag) {
        bag.guitar = YamahaGuitarState()
    }
}
