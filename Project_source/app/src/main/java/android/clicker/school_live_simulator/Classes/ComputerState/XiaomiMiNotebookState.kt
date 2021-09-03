package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class XiaomiMiNotebookState : ComputerState() {
    override val price: Int = 60000

    override val available_courses = arrayListOf(
        FriendsCourseState(),
        OnlineWorkCourseState(),
        WebDesignCourseState(),
        VideoEditingCourseState()
    )

    override fun changeState(bag: Player.Bag) {
        bag.computer = MacbookState()
    }

}
