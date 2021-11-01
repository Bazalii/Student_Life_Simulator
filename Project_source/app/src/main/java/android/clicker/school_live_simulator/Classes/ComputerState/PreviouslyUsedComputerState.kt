package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.EnumClasses.ShopItems
import kotlinx.serialization.Serializable

@Serializable
open class PreviouslyUsedComputerState : ComputerState() {

    @kotlinx.serialization.Transient
    override val price: Int = ShopItems.PREVIOUSLY_USED_COMPUTER.money_diff

    @kotlinx.serialization.Transient
    override val happiness: Int = ShopItems.PREVIOUSLY_USED_COMPUTER.happiness

    @kotlinx.serialization.Transient
    override val available_courses = arrayListOf<ComputerCourseState>(
        FriendsCourseState()
    )

    override fun changeState(bag: Player.Bag) {
        bag.computer = OldComputerState()
    }

}
