package android.clicker.school_live_simulator.Classes.GameDate

import android.clicker.school_live_simulator.Game
import kotlin.reflect.KFunction

class Timer(private var days: Int): TimeObservable {
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


    /**
     *
     */
    fun tick() {
        this.days -= 1
        if (this.days == 0) {
            this.end_signal_handler.call()
            Game.game_date.removeTimer(this)
        }
    }

    override fun setTickSignalHandler(handler: KFunction<Any>, tickDelay: Int) {
        tick_signal_handler = handler
    }

    override fun setEndSignalHandler(handler: KFunction<Any>) {
        end_signal_handler = handler
    }
}
