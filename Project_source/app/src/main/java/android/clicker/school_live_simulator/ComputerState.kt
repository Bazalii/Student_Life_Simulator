package android.clicker.school_live_simulator

abstract class ComputerState {
    protected abstract val price: Int

    protected val available_courses: List<String> = listOf<String>()

    protected  abstract val owner: Player

    abstract fun changeState(thingsHandler: Things)

    /**
     * This is a function to ckeck availability of the course
     *
     * @param courseName name of the course to check
     * @return True if the course is available and False if not
     */

    open fun isAvailable(courseName: String): Boolean {
        return courseName in available_courses
    }

}
