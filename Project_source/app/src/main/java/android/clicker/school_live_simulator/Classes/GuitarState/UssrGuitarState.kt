package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class UssrGuitarState : GuitarState() {

    @kotlinx.serialization.Transient
    override val price: Int = 1000

    @kotlinx.serialization.Transient
    override val available_courses = arrayListOf<GuitarCourseState>(
        YardGuitarCourseState()
    )

    override fun changeState(bag: Player.Bag) {
        bag.guitar = UralGuitarState()
    }
}
