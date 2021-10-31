package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.Enum_classes.ShopCourses
import kotlinx.serialization.Serializable

@Serializable
class MusicalObservatoryCourseState : GuitarCourseState() {

    @kotlinx.serialization.Transient
    override val happiness: Int = ShopCourses.GUITAR_COURSE_V5.happiness

    @kotlinx.serialization.Transient
    override val satiety: Int = ShopCourses.GUITAR_COURSE_V5.satiety

    @kotlinx.serialization.Transient
    override val course_length: Int = ShopCourses.GUITAR_COURSE_V5.length

    @kotlinx.serialization.Transient
    override val price: Int = ShopCourses.GUITAR_COURSE_V5.money_diff

    override var best_song: Song? = null

    override fun buyNextCourse(courses: Player.Courses):
        Unit = throw UnsupportedOperationException("Operation not supported")

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        this.best_song = Song.BAXA
    }
}
