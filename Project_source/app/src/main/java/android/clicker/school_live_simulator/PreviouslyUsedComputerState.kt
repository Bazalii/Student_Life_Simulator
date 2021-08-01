package android.clicker.school_live_simulator

open class PreviouslyUsedComputerState: NullComputerState {
    override val price: Int = 3000

    override fun changeState(bag: Player.bag) {
        bag.computer = PreviouslyUsedComputerState()
    }

    override fun isvailable(courseName: String): Boolean {
        return courseName in available_courses
    }
}
