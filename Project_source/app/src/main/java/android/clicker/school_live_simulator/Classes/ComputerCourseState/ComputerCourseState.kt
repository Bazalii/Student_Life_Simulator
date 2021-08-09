package android.clicker.school_live_simulator

abstract class ComputerCourseState: StudyCourseState() {
    /**
     * List of available web tasks
     * These types are described in enumeration class WebTask
     */

    protected val available_web_tasks: ArrayList<WebTask> = arrayListOf()

    /**
     * Function to ckeck if course is available to buy
     * @param web_task Element of enum WebTask
     * @return True if course is available to buy
     */

    fun isAvailable(web_task: WebTask): Boolean {
        return web_task in available_web_tasks
    }

}
