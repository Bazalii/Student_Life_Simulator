package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class WebDesignCourseState : ComputerCourseState() {
    override val price: Int = 300

    override var best_web_task: WebTask? = null

    override val course_length: Int = 30

    override fun buyNextCourse(courses: Player.Courses) {
        courses.computer_course = VideoEditingCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        this.best_web_task = WebTask.MAKE_FRONTEND
    }
}
