package android.clicker.school_live_simulator

open class OldComputerState : PreviouslyUsedComputerState() {
    override val price: Int = 10000

    init {
        available_courses.add(OnlineWorkCourseState())
    }

    override fun changeState(bag: Player.Bag) {
        bag.computer = UsualComputerState()
    }

}
