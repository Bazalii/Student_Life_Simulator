package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.IsNotAvailableException
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import kotlin.reflect.KClass

@Serializable
abstract class ComputerState {

    /**
     * Computer price
     */
    abstract val price: Int

    /**
     * Happiness that player receives when he buys a computer
     */
    abstract val happiness: Int

    /**
     * This is a list of available courses for Player
     */
    protected abstract val available_courses: ArrayList<ComputerCourseState>

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
    fun isAvailable(course_name: ComputerCourseState): Boolean {
        for (i in available_courses) if (i::class == course_name::class) return true
        return false
    }
}
