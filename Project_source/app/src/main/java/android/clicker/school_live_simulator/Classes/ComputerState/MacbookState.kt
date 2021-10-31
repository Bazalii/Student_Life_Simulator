package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.EnumClasses.ShopItems
import kotlinx.serialization.Serializable

@Serializable
open class MacbookState : ComputerState() {

    @kotlinx.serialization.Transient
    override val price: Int = ShopItems.MACBOOK.money_diff

    @kotlinx.serialization.Transient
    override val happiness: Int = ShopItems.MACBOOK.happiness

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
