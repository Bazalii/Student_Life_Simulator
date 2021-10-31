package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.Enum_classes.ShopItems
import kotlinx.serialization.Serializable

@Serializable
open class XiaomiMiNotebookState : ComputerState() {

    @kotlinx.serialization.Transient
    override val price: Int = ShopItems.XIAOMI_MI_NOTEBOOK.money_diff

    @kotlinx.serialization.Transient
    override val happiness: Int = ShopItems.XIAOMI_MI_NOTEBOOK.happiness

    @kotlinx.serialization.Transient
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
