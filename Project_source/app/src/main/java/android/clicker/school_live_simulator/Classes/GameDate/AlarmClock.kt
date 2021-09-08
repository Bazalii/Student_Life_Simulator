package android.clicker.school_live_simulator.Classes.GameDate

import android.clicker.school_live_simulator.Classes.Enum_classes.Entertainment
import android.clicker.school_live_simulator.Classes.Enum_classes.Months
import android.clicker.school_live_simulator.Classes.Enum_classes.Studies
import android.clicker.school_live_simulator.Game
import android.text.TextUtils.indexOf
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import kotlin.reflect.KFunction

@Serializable
class AlarmClock(private var day: Int, private var month: Months, private var year: Int): TimeObservable {

    /**
     * Handler function of tick timer signal
     */
    @kotlinx.serialization.Transient
    private lateinit var tick_signal_handler: KFunction<Any>

    /**
     * Handler function key in end_signal_handlers Map
     */
    private lateinit var end_signal_handler_id: String

    /**
     * Delay before ticks
     */
    private var tick_delay: Int = 1

    /**
     * Past ticks counter
     */
    private var tick_counter: Int = 0

    /**
     * When the AlarmClock should 'ring' it calls corresponding function
     */
    fun tick() {
        if (this.toString() == Game.game_date.toString()) {
            val end_function = Game.game_date.end_signal_handlers[this.end_signal_handler_id]
            end_function!!.call()
            /**
             * This should be done later for repeated alarm clocks
             */
//            if (end_function == Entertainment.LISTEN_TO_THE_MUSIC::listenToTheMusic ||
//                end_function == Entertainment.MAKE_A_YOUTUBE_VIDEO::makeYouTubeVideo ||
//                end_function == Entertainment.DO_SPORT::doSport ||
//                end_function == Studies.GO_TO_SCHOOL::goToSchool ||
//                end_function == Studies.SIGN_UP_IN_AN_ONLINE_SCHOOL::signUpInOnlineSchool) {
//                Game.game_date.alarmclocks_iterator.previous()
//                Game.game_date.alarmclocks_iterator.previous()
//            }
            Game.game_date.removeAlarmClock()
        }
    }

    override fun setTickSignalHandler(handler: KFunction<Any>, tickDelay: Int) {
        tick_signal_handler = handler
        tick_delay = tickDelay
    }

    /**
     * Sets string key for end function in end_signal_handlers Map and
     * adds AlarmClock to the corresponding ArrayList
     */
    override fun registerTimeHandler(key: String) {
        this.end_signal_handler_id = key
        Game.game_date.registerAlarmClock(this)
    }

    /**
     * Returns used format of date in Game
     */
    override fun toString(): String {
        return "${this.day} ${this.month.title} ${this.year}"
    }

}
