package android.clicker.school_live_simulator

open class VideoEditingCourseState : WebDesignCourseState() {
    override val price: Int = 900

    override fun buyNextCourse(courses: Player.Courses) {
        courses.computer_course = GameDevelopmentCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        available_web_tasks.add(WebTask.VIDEO_EDITING)
    }
}
