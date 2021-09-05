package android.clicker.school_live_simulator.Classes.GameDate

import android.clicker.school_live_simulator.Classes.Enum_classes.Months
import android.clicker.school_live_simulator.Game
import kotlinx.serialization.Serializable

@Serializable
class GameDate(private var day: Int = 1, private var month: Months = Months.September, private var year: Int = 2009) {

    val subscription_length: Int = 30

    /**
     * List of all current game timers
     */

    val timers: ArrayList<Timer> = arrayListOf()

    @kotlinx.serialization.Transient
    var timers_iterator: MutableListIterator<Timer> = timers.listIterator()
        private set
    /**
     * List of all current game alarm clocks
     */
    @kotlinx.serialization.Transient
    private val alarm_clocks: ArrayList<AlarmClock> = arrayListOf()

    /**
     *
     */
    @kotlinx.serialization.Transient
    private val time_dependencies: ArrayList<() -> Unit> = arrayListOf()

    /**
     *
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
                //Добавляем или не добавляем таймер
//                Log.d("MyLog", "gd" + Game.game_date.timers.toString())
        }
    }

    /**
     * Current date in String type in "dd.mm.yyyy" format
     *
     * @return      date string
     */
    override fun toString(): String {
        return "${this.day} ${this.month} ${this.year}"
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
        this.timers_iterator.add(timer)
    }
    fun removeTimer(){
        this.timers_iterator.remove()
    }
    /**
     *
     */
    fun registerTickHandler(handler: () -> Unit) {

    }
}
