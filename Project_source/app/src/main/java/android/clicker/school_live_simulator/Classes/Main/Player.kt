package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.Enum_classes.Entertainment
import android.clicker.school_live_simulator.Classes.Enum_classes.Studies
import android.clicker.school_live_simulator.Classes.IncorrectValueException
import android.clicker.school_live_simulator.Classes.NotAvailableException

class Player {
    inner class Bag {
        var bicycle: BicycleState = NullBicycleState()
            set(value) {
                changeMoney(value.price)
                field = value
            }
        var guitar: GuitarState = NullGuitarState()
            set(value) {
                changeMoney(value.price)
                field = value
            }
        var computer: ComputerState = NullComputerState()
            set(value) {
                changeMoney(value.price)
                field = value
            }
    }
    inner class Courses {
        var guitar_course: GuitarCourseState = NullGuitarCourseState()
            set(value) {
                changeMoney(value.price)
                field = value
            }
        var computer_course: ComputerCourseState = NullComputerCourseState()
            set(value) {
                changeMoney(value.price)
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

    var items: Bag = Bag()
        private set
    var current_courses: Courses = Courses()
        private set

    private var player_state: PlayerState = NormalState()
//    private var live_observers: ArrayList<LiveObserver> = arrayListOf<LiveObserver>()

    /**
     * Function correct value to check if we can reduce player_stats
     * @param value Value to reduce
     * @param player_stat One of the stats: money, satiety, school_performance, happiness
     */
    private fun checkMin(player_stat: Int, value: Int): Boolean {
        return player_stat >= -value
    }
    private fun checkMax(player_stat: Int, value: Int): Boolean {
        return player_stat + value <= 1000
    }

    fun tick() {
        changeSchoolPerformance(this.player_state.reduce_school_performance_percent)
        changeHappiness(this.player_state.reduce_happines_percent)
        changeSatiety(this.player_state.reduce_satiety_percent)
    }

    fun getClass(): Int {
        TODO("Not yet implemented")
    }

    fun playSong(song: Song) {
        if(this.current_courses.guitar_course.isAvailable(song))
            changeMoney(song.money_diff)
        else
            throw NotAvailableException("Work is not available")
    }
    fun deliver(delivery_type: Delivery){
        if(this.items.bicycle.isAvailable(delivery_type))
            changeMoney(delivery_type.money_diff)
        else
            throw NotAvailableException("Work is not available")
    }
    fun realiseWebTask(web_task: WebTask) {
        if(this.current_courses.computer_course.isAvailable(web_task))
            changeMoney(web_task.money_diff)
        else
            throw NotAvailableException("Work is not available")
    }

    fun eat(food: Food) {
        if (checkMin(this.money, food.money_diff)) {
            changeMoney(food.money_diff)
            if (checkMax(this.satiety, food.satiety))
                changeSchoolPerformance(food.satiety)
            else
                this.satiety = 1000
            if (checkMax(this.happiness, food.happiness))
                changeSchoolPerformance(food.happiness)
            else
                this.happiness = 1000
        }
        else
            throw IncorrectValueException("You don't have enough money!")
    }
    fun entertain(entertainment: Entertainment) {
        //TODO everyday happiness and monthly payment
        if (checkMin(this.money, entertainment.money_diff)) {
            changeMoney(entertainment.money_diff)
            if (checkMax(this.happiness, entertainment.happiness))
                changeSchoolPerformance(entertainment.happiness)
            else
                this.happiness = 1000
        }
        else
            throw IncorrectValueException("You don't have enough money!")
    }
    fun study(studies: Studies) {
        if (checkMin(this.money, studies.money_diff)) {
            changeMoney(studies.money_diff)
            if (checkMax(this.school_performance, studies.school_performance))
                changeSchoolPerformance(studies.school_performance)
            else
                this.school_performance = 1000
        }
        else
            throw IncorrectValueException("You don't have enough money!")
    }


    fun changeSchoolPerformance(value: Int) {
        if (checkMax(this.school_performance, value))
            this.school_performance += value
    }

    fun changeHappiness(value: Int) {
        if (checkMax(this.happiness, value))
            this.happiness += value
    }

    fun changeSatiety(value: Int) {
        if (checkMax(this.satiety, value))
            this.satiety += value
    }

    fun changeMoney(value: Int) {
        this.money += value
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


