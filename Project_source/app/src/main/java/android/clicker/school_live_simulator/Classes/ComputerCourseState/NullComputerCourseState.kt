package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class NullComputerCourseState : ComputerCourseState() {

    @kotlinx.serialization.Transient
    override val price: Int = 0

    override var best_web_task: WebTask? = null

    @kotlinx.serialization.Transient
    override val course_length: Int = 0

    override fun buyNextCourse(courses: Player.Courses) {
        courses.computer_course = FriendsCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){

    }
}
