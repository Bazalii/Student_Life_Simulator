package android.clicker.school_live_simulator

open class OnlineWorkCourseState: NullComputerCourseState {
    override price: Int

    init {
        available_web_task.add(WebTask.PUBLIC_PR)
    }

    override fun buyNexCourse(student: Player) {
        Player.courses = WebDesignCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){

    }
}
