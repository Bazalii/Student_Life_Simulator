package android.clicker.school_live_simulator

open class NullComputerState: ComputerState {
    override val price:Int = 0
    protected val owner:Player = Player()

    /**
     * This is a function to change the state of computer
     *
     * @param Player.bag player's bag of things
     */

    override fun changeState(bag: Player.bag) {
        bag.computer = NullComputer
    }

    /**
     * This is a function to ckeck availability of the course
     *
     * @param courseName name of the course to check
     * @return True if the course is available and False if not
     */

    override fun isAvailable(courseName: String): Boolean {
        return courseName in available_courses
    }

}
