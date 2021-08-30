package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable


open class WebDesignCourseState : OnlineWorkCourseState() {
    override val price: Int = 300

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
