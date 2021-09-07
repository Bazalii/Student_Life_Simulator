package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class GameDevelopmentCourseState : ComputerCourseState() {

    @kotlinx.serialization.Transient
    override val price: Int = 2700

    override var best_web_task: WebTask? = null

    @kotlinx.serialization.Transient
    override val course_length: Int = 30

    override fun buyNextCourse(courses: Player.Courses) {
//        Unit = throw UnsupportedOperationException("Operation not supported")
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        this.best_web_task = WebTask.MAKE_A_GAME
    }
}
