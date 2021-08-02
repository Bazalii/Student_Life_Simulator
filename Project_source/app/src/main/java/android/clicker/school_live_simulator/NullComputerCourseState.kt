package android.clicker.school_live_simulator

open class NullComputerCourseState: ComputerCourseState {
    override price: Int = 0

    init {
        available_web_task.add(WebTask.ACCOUNT_BOOST)
    }

    override fun buyNexCourse(student: Player) {
        Player.courses = OnlineWorkCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){

    }
}
