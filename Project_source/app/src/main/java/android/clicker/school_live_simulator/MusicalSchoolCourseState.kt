package android.clicker.school_live_simulator

open class MusicalSchoolCourseState: YardSongCourseState() {
    override val price: Int = 0

    override fun buyNextCourse(courses: Player.Courses) {
        courses.guitar_course = MusicalObservatoryCourseState()
    }

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        available_playlist.add(Song.BAXA)
    }
}
