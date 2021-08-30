package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class VideoEditingCourseState : WebDesignCourseState() {
    override val price: Int = 900

    override val course_length: Int = 30

    override fun buyNextCourse(courses: Player.Courses) {
        courses.computer_course = GameDevelopmentCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        this.best_web_task = WebTask.VIDEO_EDITING
    }
}
