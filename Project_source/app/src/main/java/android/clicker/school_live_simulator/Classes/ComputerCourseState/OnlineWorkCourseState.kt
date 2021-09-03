package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class OnlineWorkCourseState : ComputerCourseState() {
    override val price: Int = 100

    override val course_length: Int = 30

    override fun buyNextCourse(courses: Player.Courses) {
        courses.computer_course = WebDesignCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        this.best_web_task = WebTask.PUBLIC_PR
    }
}
