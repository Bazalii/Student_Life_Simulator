package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class NullGuitarState : GuitarState() {
    @kotlinx.serialization.Transient
    override val price: Int = 0

    @kotlinx.serialization.Transient
    override val available_courses = arrayListOf<GuitarCourseState>()

    override fun changeState(bag: Player.Bag) {
        bag.guitar = UssrGuitarState()
    }
}
