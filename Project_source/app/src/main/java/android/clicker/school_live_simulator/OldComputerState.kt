package android.clicker.school_live_simulator

open class OldComputerState: PreviouslyUsedComputerState {
    override  price: Int = 10000

    override fun changeState(bag: Player.bag) {
        bag.computer = OldComputerState()
    }

    override fun isAvailable(courseName: String): Boolean {
        return courseName in available_courses
    }

}
