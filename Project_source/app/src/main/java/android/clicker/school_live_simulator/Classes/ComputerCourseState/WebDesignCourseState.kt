package android.clicker.school_live_simulator

open class WebDesignCourseState : OnlineWorkCourseState() {
    override val price: Int = 300

    override fun buyNextCourse(courses: Player.Courses) {
        courses.computer_course = VideoEditingCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        available_web_tasks.add(WebTask.MAKE_FRONTEND)
    }
}
