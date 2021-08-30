package android.clicker.school_live_simulator

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import kotlin.reflect.KClass

@Serializable
abstract class GuitarState {
    abstract val price: Int
    protected val available_courses: ArrayList<GuitarCourseState> = arrayListOf()

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
    open fun isAvailable(courseName: GuitarCourseState): Boolean {
        return available_courses.contains(courseName)
    }
}
