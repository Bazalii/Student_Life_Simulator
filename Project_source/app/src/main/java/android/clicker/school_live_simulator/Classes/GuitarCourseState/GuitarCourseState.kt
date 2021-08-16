package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.IsNotAvailableException

abstract class GuitarCourseState: StudyCourseState() {
    /**
     * List of all available songs to play
     */
    protected open val best_song: Song? = null

    /**
     * Function checks if the song is available to play
     *
     * @param   song    name of the song
     * @return          song availability (true/false)
     */
    fun BestSong(): Song {
        return best_song ?: throw IsNotAvailableException("song is not available!")
    }

}
