package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.IsNotAvailableException
import kotlinx.serialization.Serializable

@Serializable
abstract class ComputerCourseState: StudyCourseState() {
    /**
     * List of available web tasks
     * These types are described in enumeration class WebTask
     */

    protected var best_web_task: WebTask? = null

    /**
     * Function to ckeck if course is available to buy
     * @param web_task Element of enum WebTask
     * @return True if course is available to buy
     */
    fun BestNetWork(): WebTask {
        return best_web_task ?: throw IsNotAvailableException("delivery is not available!")
    }
}
