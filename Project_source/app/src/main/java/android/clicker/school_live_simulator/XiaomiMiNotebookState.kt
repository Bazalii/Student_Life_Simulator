package android.clicker.school_live_simulator

open class XiaomiMiNotebookState: UsualComputerState() {
    override  price: Int = 60000

    override fun changeState(bag: Player.Bag) {
        bag.computer = MacbookState()
    }

}
