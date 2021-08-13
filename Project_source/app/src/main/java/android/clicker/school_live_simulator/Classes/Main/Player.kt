package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.Enum_classes.Entertainment
import android.clicker.school_live_simulator.Classes.IncorrectValueException
import android.clicker.school_live_simulator.Classes.NotAvailableException

class Player {
    inner class Bag {
        var bicycle: BicycleState = NullBicycleState()
            set(value) {
                reduceMoney(value.price)
                field = value
            }
        var guitar: GuitarState = NullGuitarState()
            set(value) {
                reduceMoney(value.price)
                field = value
            }
        var computer: ComputerState = NullComputerState()
            set(value) {
                reduceMoney(value.price)
                field = value
            }
    }
    inner class Courses {
        var guitar_course: GuitarCourseState = NullGuitarCourseState()
            set(value) {
                reduceMoney(value.price)
                field = value

            }
        var computer_course: ComputerCourseState = NullComputerCourseState()
            set(value) {
                reduceMoney(value.price)
                field = value

            }
    }
//    private var achieved_achievements: ArrayList<GameAchievements> = arrayListOf<GameAchievements>()

    private lateinit var name: String
//    private lateinit var birthday: Birthday
    var school_performance: Int = 1000
        private set
    var happiness: Int = 1000
        private set
    var satiety: Int = 1000
        private set
    var money: Int = 100
        private set

    private var school_class: Int = 1

    private var items: Bag = Bag()
    private var current_courses: Courses = Courses()

    private var player_state: PlayerState = NormalState()
//    private var live_observers: ArrayList<LiveObserver> = arrayListOf<LiveObserver>()

    /**
     * Function correct value to check if we can reduce player_stats
     * @param value Value to reduce
     * @param player_stat One of the stats: money, satiety, school_performance, happiness
     */
    private fun correctValue(player_stat: Int, value: Int): Boolean {
        return player_stat >= value
    }

    fun tick() {
        reduceSchoolPerformance(this.player_state.reduce_school_performance_percent)
        reduceHappiness(this.player_state.reduce_happines_percent)
        reduceSatiety(this.player_state.reduce_satiety_percent)
    }

    fun getClass(): Int {
        TODO("Not yet implemented")
    }

    fun playSong(song: Song) {
        if(this.current_courses.guitar_course.isAvailable(song))
            addMoney(song.salary)
        else
            throw NotAvailableException("Work is not available")
    }
    fun deliver(delivery_type: Delivery){
        if(this.items.bicycle.isAvailable(delivery_type))
            addMoney(delivery_type.salary)
        else
            throw NotAvailableException("Work is not available")
    }
    fun realiseWebTask(web_task: WebTask) {
        if(this.current_courses.computer_course.isAvailable(web_task))
            addMoney(web_task.salary)
        else
            throw NotAvailableException("Work is not available")
    }

    fun eat(food: Food) {
        if (correctValue(this.money, food.cost)) {
            addSatiety(food.satiety)
            addHappiness(food.happiness)
            reduceMoney(food.cost)
        }
        else
            throw IncorrectValueException("You don't have enough money!")
    }
    fun entertain(entertainment: Entertainment) {

    }

    fun addSchoolPerformance(value: Int) {
        this.school_performance += value
    }
    fun addPercentSchoolPerformance(value: Int) {
        this.school_performance *= (1 + value/100)
    }
    fun reduceSchoolPerformance(value: Int) {
        correctValue(this.school_performance, value)
        this.school_performance -= value

    }

    fun addHappiness(value: Int) {
        this.happiness += value
    }
    fun addPercentHappiness(value: Int) {
        this.happiness *= (1 + value/100)
    }
    fun reduceHappiness(value: Int) {
        correctValue(this.happiness, value)
        this.happiness -= value

    }

    fun addSatiety(value: Int) {
        this.satiety += value
    }
    fun addPercentSatiety(value: Int) {
        this.satiety *= (1 + value/100)
    }
    fun reduceSatiety(value: Int) {
        correctValue(this.satiety, value)
        this.satiety -= value
    }

    fun addMoney(value: Int) {
        this.money += value
    }
    fun reduceMoney(value: Int) {
        correctValue(this.money, value)
        this.money -= value

    }

    private fun changePlayerState(state: PlayerState) {
        this.player_state = state
    }
    /**
     * Commented because that should be realised later
     */
//    fun registerObserver(Observer o) {
//        TODO("Not yet implemented")
//    }
//    fun removeObserver(Observer o) {
//        TODO("Not yet implemented")
//    }
//    fun notifyObservers() {
//        TODO("Not yet implemented")
//    }

    fun buyNewBicycle() {
        this.items.bicycle.changeState(this.items)
    }
    fun buyNewGuitar() {
        this.items.guitar.changeState(this.items)
    }
    fun buyNextGuitarCourse() {
        this.current_courses.guitar_course.buyNextCourse(this.current_courses)
    }
    fun buyNewComputer() {
        this.items.computer.changeState(this.items)
    }
    fun buyNextComputerCourse() {
        this.current_courses.computer_course.buyNextCourse(this.current_courses)
    }



}


