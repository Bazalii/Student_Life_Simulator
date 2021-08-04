package android.clicker.school_live_simulator

open class PreviouslyUsedComputerState: NullComputerState() {
    override val price: Int = 3000

    override fun changeState(bag: Player.Bag) {
        bag.computer = OldComputerState()
    }

}