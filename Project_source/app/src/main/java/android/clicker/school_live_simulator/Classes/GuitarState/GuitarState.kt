package android.clicker.school_live_simulator

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import kotlin.reflect.KClass

@Serializable
abstract class GuitarState {
    /**
     * Guitar price
     */
    abstract val price: Int

    /**
     * Happiness that player receives when he buys a guitar
     */
    abstract val happiness: Int

    protected abstract val available_courses: ArrayList<GuitarCourseState>

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
    open fun isAvailable(course_name: GuitarCourseState): Boolean {
        for (i in available_courses) if (i::class == course_name::class) return true
        return false
    }
}
