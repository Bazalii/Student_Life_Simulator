package android.clicker.school_live_simulator

open class MacbookState: XiaomiMiNotebookState {
    override  price: Int = 200000

    override fun changeState(bag: Player.bag) {
        bag.computer = MacbookState()
    }

    override fun isAvailable(courseName: String): Boolean {
        return courseName in available_courses
    }

}
