package android.clicker.school_live_simulator.Classes.GameDate

import android.clicker.school_live_simulator.Classes.Enum_classes.Entertainment
import android.clicker.school_live_simulator.Classes.Enum_classes.Studies
import android.clicker.school_live_simulator.Game
import kotlinx.serialization.Serializable
import kotlin.reflect.KFunction

@Serializable
class Timer(private var days: Int): TimeObservable {

    /**
     * Handler function of tick timer signal
     *
     * Maybe this should be deleted
     */
    @kotlinx.serialization.Transient
    private lateinit var tick_signal_handler: KFunction<Any>

    /**
     * Handler function key in end_signal_handlers Map
     */
    private lateinit var end_signal_handler_id: String


    /**
     * Decrements Timer's days and calls corresponding function when
     * there are no days left. For 5 end functions that set new Timer
     * it moves iterator to the place of previous timer that should
     * be deleted.
     */
    fun tick() {
        this.days -= 1
        if (this.days == 0) {
            val end_function = Game.game_date.end_signal_handlers[this.end_signal_handler_id]
            end_function!!.call()
            if (end_function == Entertainment.LISTEN_TO_THE_MUSIC::listenToTheMusic ||
                end_function == Entertainment.MAKE_A_YOUTUBE_VIDEO::makeYouTubeVideo ||
                end_function == Entertainment.DO_SPORT::doSport ||
                end_function == Studies.GO_TO_SCHOOL::goToSchool ||
                end_function == Studies.SIGN_UP_IN_AN_ONLINE_SCHOOL::signUpInOnlineSchool) {
                Game.game_date.timers_iterator.previous()
                Game.game_date.timers_iterator.previous()
            }
            Game.game_date.removeTimer()
        }
    }

    override fun setTickSignalHandler(handler: KFunction<Any>, tickDelay: Int) {
        tick_signal_handler = handler
    }

    /**
     * Sets string key for end function in end_signal_handlers Map and
     * adds Timer to the corresponding ArrayList
     */
    override fun registerTimeHandler(key: String) {
        this.end_signal_handler_id = key
        Game.game_date.registerTimer(this)
    }
}
