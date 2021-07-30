package android.clicker.school_live_simulator

/**
 * @author      Evgeniy Sudakov yevgeniysudakov@gmail.com
 * @version     1.0                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */

abstract class ComputerState {
    protected abstract val price: Int

    protected val availableCoursesList: List<String> = listOf<String>()

    abstract fun changeState(thingsHandler: Things)

    abstract fun isCourseAvailable(courseName: String): Boolean

}
