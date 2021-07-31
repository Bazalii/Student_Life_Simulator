package android.clicker.school_live_simulator

/**
 * @author  Nikita Dimitryuk niksvob@mail.ru
 */
abstract class GuitarState {
    protected abstract val price: Int
    protected val available_courses: ArrayList<String> = arrayListOf()

    /**
     * Updates the state of the purchased guitar.
     *
     * @param    bag player inventory
     */
    abstract fun changeState(bag: Player.Bag)

    /**
     * Function checks if the course is available
     *
     * @param    courseName  name of the course
     * @return               course availability (true/false)
     */
    open fun isAvailable(courseName: String): Boolean {
        return available_courses.contains(courseName)
    }
}
