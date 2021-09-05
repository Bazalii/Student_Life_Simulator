package android.clicker.school_live_simulator.Classes.GameDate

import kotlin.reflect.KFunction

interface TimeObservable {
    /**
     * Set handler function on game ticks
     *
     * @param   handler     handler function
     * @param   tickDelay   tick delay
     */
    fun setTickSignalHandler(handler: KFunction<Any>, tickDelay: Int = 1)

    /**
     * Set handler function on timer/alarm ends
     *
     * @param   handler     handler function
     */
    fun setEndSignalHandler(key: String, input_kfunction: KFunction<Any>)
}
