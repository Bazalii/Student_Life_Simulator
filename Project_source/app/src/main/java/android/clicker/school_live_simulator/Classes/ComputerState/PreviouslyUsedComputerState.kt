package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class PreviouslyUsedComputerState : ComputerState() {

    @kotlinx.serialization.Transient
    override val price: Int = 3000

    @kotlinx.serialization.Transient
    override val available_courses = arrayListOf<ComputerCourseState>(
        FriendsCourseState()
    )

    override fun changeState(bag: Player.Bag) {
        bag.computer = OldComputerState()
    }

}
