package android.clicker.school_live_simulator

open class MusicalSchoolCourseState: YardSongCourseState() {
    override val price: Int = 900

    override open var best_song: Song? = null

    override fun buyNextCourse(courses: Player.Courses) {
        courses.guitar_course = MusicalObservatoryCourseState()
    }

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        this.best_song = Song.JAZZ
    }
}
