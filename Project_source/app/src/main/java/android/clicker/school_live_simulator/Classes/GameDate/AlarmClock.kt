package android.clicker.school_live_simulator.Classes.GameDate

import android.clicker.school_live_simulator.Classes.Enum_classes.Months
import android.clicker.school_live_simulator.Game
import android.text.TextUtils.indexOf
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import kotlin.reflect.KFunction

@Serializable
class AlarmClock(private var day: Int, private var month: Months, private var year: Int): TimeObservable {
    init {
        Game.game_date.registerAlarmClock(this)
    }
    /**
     * Handler function of tick timer signal
     */
    private lateinit var tick_signal_handler: KFunction<@Contextual Any>

    /**
     * Handler function of end timer signal
     */
    private lateinit var end_signal_handler: KFunction<@Contextual Any>

    /**
     * Delay before ticks
     */
    private var tick_delay: Int = 1

    /**
     * Past ticks counter
     */
    private var tick_counter: Int = 0

    /**
     * DEPRECATED
     * Update the alarm time
     *
     * @param   day     new day
     * @param   month   new month
     * @param   year    new year
     */
//    fun update(day: Int, month: Int, year: Int) {
//        this.day = day
//        this.month = month
//        this.year = year
//    }

    fun tick() {
        if (this.toString() == Game.game_date.toString()) {
            this.end_signal_handler.call()
            Game.game_date.removeAlarmClock(this)
        }
    }

    override fun setTickSignalHandler(handler: KFunction<Any>, tickDelay: Int) {
        tick_signal_handler = handler
        tick_delay = tickDelay
    }

    override fun setEndSignalHandler(handler: KFunction<Any>) {
        end_signal_handler = handler
    }
}
