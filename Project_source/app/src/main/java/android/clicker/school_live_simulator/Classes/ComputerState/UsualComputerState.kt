package android.clicker.school_live_simulator

open class UsualComputerState : OldComputerState() {
    override val price: Int = 30000

    init {
        available_courses.add(WebDesignCourseState())
    }

    override fun changeState(bag: Player.Bag) {
        bag.computer = XiaomiMiNotebookState()
    }

}
