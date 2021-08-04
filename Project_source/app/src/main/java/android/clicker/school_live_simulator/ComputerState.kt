package android.clicker.school_live_simulator

abstract class ComputerState {

    /**
     * Computer price
     */

    protected abstract val price: Int

    /**
     * This is a list of available courses for Player
     */

    protected val available_courses: List<String> = listOf<String>()

    /**
     * This is a function to change computer
     * @param bag Player's bag of things
     */

    abstract fun changeState(bag: Player.Bag)

    /**
     * This is a function to check availability of the course
     *
     * @param courseName name of the course to check
     * @return True if the course is available
     */

    open fun isAvailable(courseName: String): Boolean {
        return courseName in available_courses
    }

}
