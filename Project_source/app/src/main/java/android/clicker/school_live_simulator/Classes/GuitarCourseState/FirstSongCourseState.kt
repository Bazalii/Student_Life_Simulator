package android.clicker.school_live_simulator

open class FirstSongCourseState: YardGuitarCourseState() {
    override val price: Int = 100

    override var best_song: Song? = null

    override fun buyNextCourse(courses: Player.Courses) {
        courses.guitar_course = YardSongCourseState()
    }

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        this.best_song = Song.GAZ_SECTOR
    }
}
