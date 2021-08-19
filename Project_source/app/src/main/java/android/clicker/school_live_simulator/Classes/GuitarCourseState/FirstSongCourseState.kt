package android.clicker.school_live_simulator

open class FirstSongCourseState: YardGuitarCourseState() {
    override val price: Int = 100

    override val course_length: Int = 30

    override fun buyNextCourse(courses: Player.Courses) {
        courses.guitar_course = YardSongCourseState()
    }

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        this.best_song = Song.GAZ_SECTOR
    }
}
