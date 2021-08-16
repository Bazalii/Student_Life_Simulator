package android.clicker.school_live_simulator

open class VideoEditingCourseState : WebDesignCourseState() {
    override val price: Int = 900

    override var best_web_task: WebTask? = null

    override fun buyNextCourse(courses: Player.Courses) {
        courses.computer_course = GameDevelopmentCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        this.best_web_task = WebTask.VIDEO_EDITING
    }
}
