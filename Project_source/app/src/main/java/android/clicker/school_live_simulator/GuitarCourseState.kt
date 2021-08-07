package android.clicker.school_live_simulator

abstract class GuitarCourseState: StudyCourseState() {
    abstract override val price: Int

    /**
     * List of all available songs to play
     */
    protected val available_playlist: ArrayList<Song> = arrayListOf()

    abstract override fun buyNextCourse(courses: Player.Courses)

    /**
     * Function checks if the song is available to play
     *
     * @param   song    name of the song
     * @return          song availability (true/false)
     */
    open fun isAvailable(song: Song): Boolean {
        return available_playlist.contains(song)
    }

    abstract override fun timerTickHandler()

    abstract override fun timerEndHandler()
}
