package android.clicker.school_live_simulator

open class YardSongCourseState: FirstSongCourseState() {
    override val price: Int = 300

    override var best_song: Song? = null

    override fun buyNextCourse(courses: Player.Courses) {
        courses.guitar_course = MusicalSchoolCourseState()
    }

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        this.best_song = Song.SMELLS_LIKE
    }
}
