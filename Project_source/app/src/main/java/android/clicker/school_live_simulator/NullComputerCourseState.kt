package android.clicker.school_live_simulator

open class NullComputerCourseState: ComputerCourseState {
    override val price: Int = 0

    init {
        available_web_task.add(WebTask.ACCOUNT_BOOST)
    }

    override fun buyNexCourse(courses: Player.Courses) {
        courses.computer_course = OnlineWorkCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){

    }
}
