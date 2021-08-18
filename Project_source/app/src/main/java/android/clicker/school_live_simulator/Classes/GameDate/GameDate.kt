package android.clicker.school_live_simulator.Classes.GameDate

data class GameDate(private var day: Int = 1, private var month: Int = 9, private var year: Int = 2009) {
    /**
     * List of all current game timers
     */
    private val timers: ArrayList<Timer> = arrayListOf()

    /**
     * List of all current game alarm clocks
     */
    private val alarm_clocks: ArrayList<AlarmClock> = arrayListOf()

    /**
     *
     */
    private val time_dependencies: ArrayList<() -> Unit> = arrayListOf()

    /**
     *
     */
    fun tick() {

    }

    /**
     * Current date in String type in "dd.mm.yyyy" format
     *
     * @return      date string
     */
    override fun toString(): String {
        return "$day.$month.$year"
    }

    /**
     * Register alarm clock in game time
     *
     * @param   clock   alarm clock to register
     */
    fun registerAlarmClock(clock: AlarmClock) {
        alarm_clocks.add(clock)
    }

    /**
     * Register timer in game time
     *
     * @param   timer   timer to register
     */
    fun registerTimer(timer: Timer) {
        timers.add(timer)
    }

    /**
     *
     */
    fun registerTickHandler(handler: () -> Unit) {

    }
}
