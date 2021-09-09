package android.clicker.school_live_simulator

import kotlinx.serialization.*

@Serializable
open class NullGuitarCourseState : GuitarCourseState() {

    @kotlinx.serialization.Transient
    override val price: Int = 0

    override var best_song: Song? = null

    @kotlinx.serialization.Transient
    override val course_length: Int = 0

    override fun buyNextCourse(courses: Player.Courses) {
        courses.guitar_course = YardGuitarCourseState()
    }

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {

    }
}
