package android.clicker.school_live_simulator

open class NullComputerState: ComputerState() {
    override val price: Int = 0

    override fun changeState(bag: Player.Bag) {
        bag.computer = PreviouslyUsedComputerState()
    }

}
