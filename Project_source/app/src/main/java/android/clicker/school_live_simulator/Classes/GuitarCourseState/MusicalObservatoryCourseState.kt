package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
class MusicalObservatoryCourseState : GuitarCourseState() {
    override val price: Int = 2700

    override val course_length: Int = 30

    override fun buyNextCourse(courses: Player.Courses):
        Unit = throw UnsupportedOperationException("Operation not supported")

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        this.best_song = Song.BAXA
    }
}
