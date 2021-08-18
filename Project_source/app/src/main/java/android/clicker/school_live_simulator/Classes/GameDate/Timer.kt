package android.clicker.school_live_simulator.Classes.GameDate

import kotlin.reflect.KFunction

class Timer(private var days: Int): TimeObservable {
    /**
     * Handler function of tick timer signal
     */
    private lateinit var tick_signal_handler: KFunction<Any>

    /**
     * Handler function of end timer signal
     */
    private lateinit var end_signal_handler: KFunction<Any>

    /**
     *
     */
    fun tick() {

    }

    override fun setTickSignalHandler(handler: KFunction<Any>, tickDelay: Int) {
        tick_signal_handler = handler
    }

    override fun setEndSignalHandler(handler: KFunction<Any>) {
        end_signal_handler = handler
    }
}
