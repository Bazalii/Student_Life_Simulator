package android.clicker.school_live_simulator.Classes.GameDate

import android.clicker.school_live_simulator.Classes.Enum_classes.Months
import kotlinx.serialization.Serializable
import kotlin.reflect.KFunction

@Serializable
class GameDate(private var day: Int, private var month: Months, private var year: Int){

    /**
     * Length of subscriptions
     */
    @kotlinx.serialization.Transient
    val subscription_length: Int = 30

    /**
     * Map that contains id and link of function that will be called
     * when alarm clock or timer will 'ring'
     */
    @kotlinx.serialization.Transient
    var end_signal_handlers: MutableMap<String, KFunction<Any>> = mutableMapOf()

    /**
     * ArrayList that contains all existing game timers
     */
    val timers: ArrayList<Timer> = arrayListOf()

    /**
     * Iterator for interaction with Timer's ArrayList
     */
    @kotlinx.serialization.Transient
    var timers_iterator: MutableListIterator<Timer> = timers.listIterator()
        private set

    /**
     * ArrayList that contains all existing game alarm clocks
     */
    private val alarm_clocks: ArrayList<AlarmClock> = arrayListOf()

    /**
     * Iterator for interaction with AlarmClock's ArrayList
     */
    @kotlinx.serialization.Transient
    var alarmclocks_iterator: MutableListIterator<AlarmClock> = alarm_clocks.listIterator()
        private set

    /**
     *
     */
    @kotlinx.serialization.Transient
    private val time_dependencies: ArrayList<() -> Unit> = arrayListOf()

    /**
     * Increments game date, calls tick() for every Timer and AlarmClock
     */
    fun tick() {
        if (this.day + 1 > this.month.days) {
            this.day = 1
            if (this.month == Months.December)
                this.year += 1
            this.month = enumValues<Months>()[(enumValues<Months>().indexOf(this.month) + 1) % 12]
        }
        else
            this.day += 1

        this.timers_iterator = this.timers.listIterator()
        while (this.timers_iterator.hasNext()) {
            val current_timer = this.timers_iterator.next()
            current_timer.tick()
        }

        this.alarmclocks_iterator = this.alarm_clocks.listIterator()
        while (this.alarmclocks_iterator.hasNext()) {
            val current_alarm_clock = this.alarmclocks_iterator.next()
            current_alarm_clock.tick()
        }
    }

    /**
     * Current date in String type in "dd Month yyyy" format
     *
     * @return date string
     */
    override fun toString(): String {
        return "${this.day} ${this.month.title} ${this.year}"
    }

    /**
     * Registers alarm clock in game time
     *
     * @param clock an alarm clock to register
     */
    fun registerAlarmClock(clock: AlarmClock) {
        this.alarmclocks_iterator.add(clock)
    }

    /**
     * Removes alarm clock from alarm_clocks ArrayList
     */
    fun removeAlarmClock() {
        this.alarmclocks_iterator.remove()
    }

    /**
     * Registers timer in game time
     *
     * @param timer timer to register
     */
    fun registerTimer(timer: Timer) {
        this.timers_iterator.add(timer)
    }

    /**
     * Removes timer from timers ArrayList
     */
    fun removeTimer(){
        this.timers_iterator.remove()
    }

    /**
     *
     */
    fun registerTickHandler(handler: () -> Unit) {

    }
}
