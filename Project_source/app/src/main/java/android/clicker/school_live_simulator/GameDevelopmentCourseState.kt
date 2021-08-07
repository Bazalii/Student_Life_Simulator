package android.clicker.school_live_simulator

open class GameDevelopmentCourseState : VideoEditingCourseState() {
    override val price: Int = 0

    init {
        available_web_task.add(WebTask.MAKE_A_GAME)
    }

    override fun buyNexCourse(courses: Player.Courses) {
        Unit = throw UnsupportedOperationException("Operation not supported")
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        available_web_task.add(WebTask.MAKE_A_GAME)
    }
}
