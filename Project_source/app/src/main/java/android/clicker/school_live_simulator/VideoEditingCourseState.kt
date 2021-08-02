package android.clicker.school_live_simulator

open class VideoEditingCourseState: WebDesignCourseState {
    override price: Int

    init {
        available_web_task.add(WebTask.VIDEO_EDITING)
    }

    override fun buyNexCourse(student: Player) {
        Player.courses = GameDevelopmentCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){

    }
}
