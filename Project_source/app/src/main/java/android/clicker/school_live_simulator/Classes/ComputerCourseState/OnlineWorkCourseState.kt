package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.EnumClasses.ShopCourses
import kotlinx.serialization.Serializable

@Serializable
open class OnlineWorkCourseState : ComputerCourseState() {

    @kotlinx.serialization.Transient
    override val happiness: Int = ShopCourses.COMPUTER_COURSE_V2.happiness

    @kotlinx.serialization.Transient
    override val satiety: Int = ShopCourses.COMPUTER_COURSE_V2.satiety

    @kotlinx.serialization.Transient
    override val course_length: Int = ShopCourses.COMPUTER_COURSE_V2.length

    @kotlinx.serialization.Transient
    override val price: Int = ShopCourses.COMPUTER_COURSE_V2.money_diff

    override var best_web_task: WebTask? = null

    override fun buyNextCourse(courses: Player.Courses) {
        courses.computer_course = WebDesignCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        this.best_web_task = WebTask.PUBLIC_PR
    }
}
