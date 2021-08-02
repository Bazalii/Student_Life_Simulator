package android.clicker.school_live_simulator

abstract class ComputerCourseState: StudyCourseState {
    protected abstract val price: Int

    /**
     * This is a list of available web tasks
     * These types are described in enumeration class WebTask
     */

    protected val available_web_task: List<WebTask> = listOf<WebTask>()

    /**
     * This is a function for buying courses
     * @param student Player who buys course
     */

    abstract fun buyNextCourse(student: Player)

    /**
     * This is a function to ckeck if course is available to buy
     * @param web_task Element of enum WebTask
     * @return True if course is available to buy and False if not
     */

    fun isAvailable(web_task: WebTask): Boolean {
        return web_task in available_web_task
    }

}
