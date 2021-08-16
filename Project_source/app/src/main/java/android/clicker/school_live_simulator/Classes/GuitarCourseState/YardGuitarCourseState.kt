package android.clicker.school_live_simulator

open class YardGuitarCourseState: NullGuitarCourseState() {
    override val price: Int = 0

    override var best_song: Song? = null

    override fun buyNextCourse(courses: Player.Courses) {
        courses.guitar_course = FirstSongCourseState()
    }

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        this.best_song = Song.SINGLE_CHORD
    }
}
