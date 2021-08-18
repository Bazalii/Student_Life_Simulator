package android.clicker.school_live_simulator.Classes.GameDate

import android.clicker.school_live_simulator.Classes.Enum_classes.Months

data class GameDate(private var day: Int = 1, private var month: Months = Months.September, private var year: Int = 2009) {
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
        if (this.day + 1 > this.month.days) {
            this.day = 1
            this.month = enumValues<Months>()[(enumValues<Months>().indexOf(this.month) + 1) % 12]
            if (this.month == Months.December) {
                this.year += 1
            }
        }
        for (timer: Timer in timers)
            timer.tick()
        for (alarm_clock: AlarmClock in alarm_clocks)
            alarm_clock.tick()
    }

    /**
     * Current date in String type in "dd.mm.yyyy" format
     *
     * @return      date string
     */
    override fun toString(): String {
        return "$day $month $year"
    }

    /**
     * Register alarm clock in game time
     *
     * @param   clock   alarm clock to register
     */
    fun registerAlarmClock(clock: AlarmClock) {
        alarm_clocks.add(clock)
    }
    fun removeAlarmClock(clock: AlarmClock) {
        alarm_clocks.remove(clock)
    }
    /**
     * Register timer in game time
     *
     * @param   timer   timer to register
     */
    fun registerTimer(timer: Timer) {
        timers.add(timer)
    }
    fun removeTimer(timer: Timer){
        timers.remove(timer)
    }
    /**
     *
     */
    fun registerTickHandler(handler: () -> Unit) {

    }
}
