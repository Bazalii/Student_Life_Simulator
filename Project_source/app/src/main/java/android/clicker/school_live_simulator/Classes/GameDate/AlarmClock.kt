package android.clicker.school_live_simulator.Classes.GameDate

import kotlin.reflect.KFunction

class AlarmClock(private var day: Int, private var month: Int, private var year: Int): TimeObservable {
    /**
     * Handler function of tick timer signal
     */
    private lateinit var tick_signal_handler: KFunction<Any>

    /**
     * Handler function of end timer signal
     */
    private lateinit var end_signal_handler: KFunction<Any>

    /**
     * Delay before ticks
     */
    private var tick_delay: Int = 1

    /**
     * Past ticks counter
     */
    private var tick_counter: Int = 0

    /**
     * Update the alarm time
     *
     * @param   day     new day
     * @param   month   new month
     * @param   year    new year
     */
    fun update(day: Int, month: Int, year: Int) {
        this.day = day
        this.month = month
        this.year = year
    }

    override fun setTickSignalHandler(handler: KFunction<Any>, tickDelay: Int) {
        tick_signal_handler = handler
        tick_delay = tickDelay
    }

    override fun setEndSignalHandler(handler: KFunction<Any>) {
        end_signal_handler = handler
    }
}
