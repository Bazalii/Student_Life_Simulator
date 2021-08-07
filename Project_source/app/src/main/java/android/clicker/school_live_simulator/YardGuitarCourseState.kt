package android.clicker.school_live_simulator

open class YardGuitarCourseState: NullGuitarCourseState() {
    override val price: Int = 0

    override fun buyNextCourse(courses: Player.Courses) {
        courses.guitar_course = FirstSongCourseState()
    }

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        available_playlist.add(Song.GAZ_SECTOR)
    }
}
