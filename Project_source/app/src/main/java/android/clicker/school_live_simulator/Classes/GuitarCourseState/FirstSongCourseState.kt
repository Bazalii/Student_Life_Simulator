package android.clicker.school_live_simulator

open class FirstSongCourseState: YardGuitarCourseState() {
    override val price: Int = 100

    override fun buyNextCourse(courses: Player.Courses) {
        courses.guitar_course = YardSongCourseState()
    }

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        available_playlist.add(Song.SMELLS_LIKE)
    }
}
