package android.clicker.school_live_simulator
import android.clicker.school_live_simulator.Classes.Enum_classes.Shop
import kotlinx.serialization.*

@Serializable
open class NullComputerState : ComputerState() {

    @kotlinx.serialization.Transient
    override val price: Int = 0

    @kotlinx.serialization.Transient
    override val happiness: Int = 0

    @kotlinx.serialization.Transient
    override val available_courses = arrayListOf<ComputerCourseState>()

    override fun changeState(bag: Player.Bag) {
        bag.computer = PreviouslyUsedComputerState()
    }

}
