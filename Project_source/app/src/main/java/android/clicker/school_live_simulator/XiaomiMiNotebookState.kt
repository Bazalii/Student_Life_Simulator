package android.clicker.school_live_simulator

open class XiaomiMiNotebookState: UsualComputerState() {
    override  price: Int = 60000

    init {
        available_courses.add(VideoEditingCourseState::class)
    }

    override fun changeState(bag: Player.Bag) {
        bag.computer = MacbookState()
    }

}
