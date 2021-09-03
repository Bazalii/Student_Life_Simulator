package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class OldComputerState : ComputerState() {
    override val price: Int = 10000

    override val available_courses = arrayListOf(
        FriendsCourseState(),
        OnlineWorkCourseState()
    )

    override fun changeState(bag: Player.Bag) {
        bag.computer = UsualComputerState()
    }

}
