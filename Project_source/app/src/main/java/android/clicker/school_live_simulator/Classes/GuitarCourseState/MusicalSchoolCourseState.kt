package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class MusicalSchoolCourseState : GuitarCourseState() {
    override val price: Int = 900

    override val course_length: Int = 30

    override fun buyNextCourse(courses: Player.Courses) {
        courses.guitar_course = MusicalObservatoryCourseState()
    }

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        this.best_song = Song.JAZZ
    }
}
