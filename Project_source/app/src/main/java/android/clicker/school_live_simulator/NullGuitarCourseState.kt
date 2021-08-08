package android.clicker.school_live_simulator

open class NullGuitarCourseState: GuitarCourseState() {
    override val price: Int = 0

    override fun buyNextCourse(courses: Player.Courses) {
        courses.guitar_course = YardGuitarCourseState()
    }

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        available_playlist.add(Song.SINGLE_CHORD)
    }
}