package android.clicker.school_live_simulator

abstract class GuitarCourseState: StudyCourseState() {
    /**
     * List of all available songs to play
     */
    protected val available_playlist: ArrayList<Song> = arrayListOf()

    /**
     * Function checks if the song is available to play
     *
     * @param   song    name of the song
     * @return          song availability (true/false)
     */
    open fun isAvailable(song: Song): Boolean {
        return available_playlist.contains(song)
    }
}
