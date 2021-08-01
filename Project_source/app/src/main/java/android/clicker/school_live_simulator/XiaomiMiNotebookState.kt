package android.clicker.school_live_simulator

open class XiaomiMiNotebookState: UsualComputerState {
    override  price: Int = 60000

    override fun changeState(bag: Player.bag) {
        bag.computer = XiaomiMiNotebookState()
    }

    override fun isAvailable(courseName: String): Boolean {
        return courseName in available_courses
    }

}
