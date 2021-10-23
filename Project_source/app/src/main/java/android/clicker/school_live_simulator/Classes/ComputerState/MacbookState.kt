package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.Enum_classes.Shop
import kotlinx.serialization.Serializable

@Serializable
open class MacbookState : ComputerState() {

    @kotlinx.serialization.Transient
    override val price: Int = Shop.MACBOOK.money_diff

    @kotlinx.serialization.Transient
    override val happiness: Int = Shop.MACBOOK.happiness

    @kotlinx.serialization.Transient
    override val available_courses = arrayListOf(
        FriendsCourseState(),
        OnlineWorkCourseState(),
        WebDesignCourseState(),
        VideoEditingCourseState(),
        GameDevelopmentCourseState()
    )

    override fun changeState(bag: Player.Bag) {
//        Unit = throw UnsupportedOperationException("Operation not supported")
    }

}
