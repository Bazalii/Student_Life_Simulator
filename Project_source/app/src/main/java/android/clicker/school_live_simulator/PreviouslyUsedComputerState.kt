package android.clicker.school_live_simulator

open class PreviouslyUsedComputerState: NullComputerState() {
    override val price: Int = 3000

    init {
        available_courses.add(FriendsCourseState::class)
    }

    override fun changeState(bag: Player.Bag) {
        bag.computer = OldComputerState()
    }

}
