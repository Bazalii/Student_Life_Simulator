package android.clicker.school_live_simulator

open class WebDesignCourseState: OnlineWorkCourseState {
    override price: Int

    init {
        available_web_task.add(WebTask.MAKE_FRONTEND)
    }

    override fun buyNexCourse(student: Player) {
        Player.courses = VideoEditingCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){

    }
}
