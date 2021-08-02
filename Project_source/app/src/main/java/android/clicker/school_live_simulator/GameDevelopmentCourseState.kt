package android.clicker.school_live_simulator

open class GameDevelopmentCourseState: VideoEditingCourseState {
    override price: Int

    init {
        available_web_task.add(WebTask.MAKE_A_GAME)
    }

    override fun buyNexCourse(student: Player) {
        Unit = throw UnsupportedOperationException("Operation not supported")
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){

    }
}
