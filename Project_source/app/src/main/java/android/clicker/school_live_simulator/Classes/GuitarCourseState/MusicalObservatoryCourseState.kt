package android.clicker.school_live_simulator

class MusicalObservatoryCourseState: MusicalSchoolCourseState() {
    override val price: Int = 2700

    override val course_length: Int = 30

    override fun buyNextCourse(courses: Player.Courses):
        Unit = throw UnsupportedOperationException("Operation not supported")

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        this.best_song = Song.BAXA
    }
}
