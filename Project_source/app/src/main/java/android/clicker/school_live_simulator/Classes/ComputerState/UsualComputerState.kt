package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.Enum_classes.ShopItems
import kotlinx.serialization.Serializable

@Serializable
open class UsualComputerState : ComputerState() {

    @kotlinx.serialization.Transient
    override val price: Int = ShopItems.USUAL_COMPUTER.money_diff

    @kotlinx.serialization.Transient
    override val happiness: Int = ShopItems.USUAL_COMPUTER.happiness

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
