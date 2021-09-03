package android.clicker.school_live_simulator

import android.util.Log
import kotlinx.serialization.Serializable

@Serializable
open class YardGuitarCourseState : GuitarCourseState() {
    override val price: Int = 0

    override val course_length: Int = 30

    override fun buyNextCourse(courses: Player.Courses) {
        courses.guitar_course = FirstSongCourseState()
    }

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        this.best_song = Song.SINGLE_CHORD
    }
}
