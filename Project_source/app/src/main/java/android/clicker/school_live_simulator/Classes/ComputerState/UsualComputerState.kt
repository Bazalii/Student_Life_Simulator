package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class UsualComputerState : ComputerState() {

    @kotlinx.serialization.Transient
    override val price: Int = 30000

    @kotlinx.serialization.Transient
    override val available_courses = arrayListOf(
        FriendsCourseState(),
        OnlineWorkCourseState(),
        WebDesignCourseState()
    )

    override fun changeState(bag: Player.Bag) {
        bag.computer = XiaomiMiNotebookState()
    }

}
