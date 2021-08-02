package android.clicker.school_live_simulator

open class NullComputerState: ComputerState {
    override val price:Int = 0

    /**
     * This is a function to change the state of computer
     *
     * @param Player.bag player's bag of things
     */

    override fun changeState(bag: Player.bag) {
        bag.computer = PreviouslyUsedComputerState()
    }

}
