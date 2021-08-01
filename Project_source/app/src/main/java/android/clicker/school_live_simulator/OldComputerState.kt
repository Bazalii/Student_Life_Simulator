package android.clicker.school_live_simulator

open class OldComputerState: PreviouslyUsedComputerState {
    override  price: Int = 10000

    override fun changeState(bag: Player.bag) {
        bag.computer = UsualComputerState()
    }

}
