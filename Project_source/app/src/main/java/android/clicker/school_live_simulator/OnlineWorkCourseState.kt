package android.clicker.school_live_simulator

open class OnlineWorkCourseState : NullComputerCourseState() {
    override val price: Int = 0

    init {
        available_web_task.add(WebTask.PUBLIC_PR)
    }

    override fun buyNexCourse(courses: Player.Courses) {
        courses.computer_course = WebDesignCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){

    }
}
