package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class FriendsCourseState : ComputerCourseState() {
    override val price: Int = 0

    override var best_web_task: WebTask? = null

    override val course_length: Int = 40

    override fun buyNextCourse(courses: Player.Courses) {
        courses.computer_course = OnlineWorkCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        this.best_web_task = WebTask.ACCOUNT_BOOST
    }
}
