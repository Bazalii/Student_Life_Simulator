package android.clicker.school_live_simulator

open class WebDesignCourseState : OnlineWorkCourseState() {
    override val price: Int = 300

    override var best_web_task: WebTask? = null

    override fun buyNextCourse(courses: Player.Courses) {
        courses.computer_course = VideoEditingCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        this.best_web_task = WebTask.MAKE_FRONTEND
    }
}
