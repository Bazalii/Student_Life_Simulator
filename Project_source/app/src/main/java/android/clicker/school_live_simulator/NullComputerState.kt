package android.clicker.school_live_simulator

/**
 * @author      Evgeniy Sudakov yevgeniysudakov@gmail.com
 * @version     1.0                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */

open class NullComputerState: ComputerState {
    override val price:Int = 0
    protected val owner:Player = Player()

    override fun changeState(thingsHandler: Things) {

    }
    override fun isCourseAvailable(courseName: String): Boolean {
        return courseName in super.availableCoursesList
    }

}
