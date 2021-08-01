package android.clicker.school_live_simulator

open class UsualComputerState: OldComputerState {
    override  price: Int = 30000

    override fun changeState(bag: Player.bag) {
        bag.computer = XiaomiMiNotebookState()
    }

}
