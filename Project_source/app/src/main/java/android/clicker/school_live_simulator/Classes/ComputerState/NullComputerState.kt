package android.clicker.school_live_simulator
import kotlinx.serialization.*


@Serializable
open class NullComputerState : ComputerState() {
    override val price: Int = 0

    override fun changeState(bag: Player.Bag) {
        bag.computer = PreviouslyUsedComputerState()
    }

}
