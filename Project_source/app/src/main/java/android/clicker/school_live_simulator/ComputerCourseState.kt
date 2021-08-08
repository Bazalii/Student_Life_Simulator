package android.clicker.school_live_simulator

abstract class ComputerCourseState: StudyCourseState() {

    /**
     * Price of computer course
     */

    abstract val price: Int

    /**
     * List of available web tasks
     * These types are described in enumeration class WebTask
     */

    protected val available_web_tasks: ArrayList<WebTask> = arrayListOf<WebTask>()

    /**
     * Function for buying courses
     * @param courses Courses which Player takes
     */

    abstract fun buyNextCourse(courses: Player.Courses)

    /**
     * Function to ckeck if course is available to buy
     * @param web_task Element of enum WebTask
     * @return True if course is available to buy
     */

    fun isAvailable(web_task: WebTask): Boolean {
        return web_task in available_web_task
    }

}
