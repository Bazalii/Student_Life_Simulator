package android.clicker.school_live_simulator.Classes.GameDate

import android.clicker.school_live_simulator.Classes.Enum_classes.Entertainment
import android.clicker.school_live_simulator.Classes.Enum_classes.Studies
import android.clicker.school_live_simulator.Game
import android.util.Log
import kotlin.reflect.KFunction

class Timer(input_days: Int): TimeObservable {
    init {
        Game.game_date.registerTimer(this)
    }

    /**
     * Handler function of tick timer signal
     */
    private lateinit var tick_signal_handler: KFunction<Any>

    /**
     * Handler function of end timer signal
     */
    private lateinit var end_signal_handler: KFunction<Any>

    var days = input_days
        private set
    /**
     *
     */
    fun tick() {
        this.days -= 1
        if (this.days == 0) {
            Log.d("MyLog", "timer" + Game.game_date.timers.toString())
            this.end_signal_handler.call()
            if (this.end_signal_handler == Entertainment.LISTEN_TO_THE_MUSIC::listenToTheMusic ||
                this.end_signal_handler == Entertainment.MAKE_A_YOUTUBE_VIDEO::makeYouTubeVideo ||
                this.end_signal_handler == Entertainment.DO_SPORT::doSport ||
                this.end_signal_handler == Studies.GO_TO_SCHOOL::goToSchool ||
                this.end_signal_handler == Studies.SIGN_UP_IN_AN_ONLINE_SCHOOL::signUpInOnlineSchool) {
                Game.game_date.timers_iterator.previous()
                Game.game_date.timers_iterator.previous()
            }
            Game.game_date.removeTimer()
        }
    }

    override fun setTickSignalHandler(handler: KFunction<Any>, tickDelay: Int) {
        tick_signal_handler = handler
    }

    override fun setEndSignalHandler(handler: KFunction<Any>) {
        end_signal_handler = handler
    }
}
