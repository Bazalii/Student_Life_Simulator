package android.clicker.school_live_simulator


import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.Achievements
import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.RandomAchievements
import android.clicker.school_live_simulator.Classes.Enum_classes.Entertainment
import android.clicker.school_live_simulator.Classes.Enum_classes.OtherWork
import android.clicker.school_live_simulator.Classes.Enum_classes.Studies
import android.clicker.school_live_simulator.Classes.NotEnoughMoneyException
import android.clicker.school_live_simulator.Classes.IsNotAvailableException
import kotlinx.serialization.*

@Serializable
class Player {
    @Serializable
    class Bag {
        @Contextual
        var bicycle: BicycleState = NullBicycleState()
            set(value) {
                Game.player.changeMoney(-value.price)
                field = value
            }
        var guitar: GuitarState = NullGuitarState()
            set(value) {
                Game.player.changeMoney(-value.price)
                field = value
            }
        var computer: ComputerState = NullComputerState()
            set(value) {
                Game.player.changeMoney(-value.price)
                field = value
            }
    }
    @Serializable
    class Courses {
        var guitar_course: GuitarCourseState = NullGuitarCourseState()
            set(value) {
                Game.player.changeMoney(value.price)
                field = value
            }
        var computer_course: ComputerCourseState = NullComputerCourseState()
            set(value) {
                Game.player.changeMoney(value.price)
                field = value
            }
    }
     var achieved_achievements: ArrayList<Achievements> = arrayListOf<Achievements>()
    /**
     * Player's name
     */
//    private lateinit var name: String
//    private lateinit var birthday: Birthday
    /**
     * Points of Player school studies
     */

    var school_performance: Int = 1000
        private set
    /**
     * Points of Player happiness
     */
    var happiness: Int = 1000
        private set
    /**
     * Points of player satiety
     */
    var satiety: Int = 1000
        private set
    /**
     * Amount of player's money
     */
    var money: Int = 100000
        private set
    var earned_money: Int = 0
        private set
    /**
     * Player's class at school
     */
    private var school_class: Int = 1

    /**
     * All the items that player has last bought: bicycle, guitar and computer
     */
    var items: Bag = Bag()
        private set
    /**
     * All the courses that player has last bought: guitar and computer course
     */
    var current_courses: Courses = Courses()
        private set

    private var player_state: PlayerState = NormalState()
//    private var live_observers: ArrayList<LiveObserver> = arrayListOf<LiveObserver>()

    /**
     * Block of functions to check if the value is correct
     * @param value Value to reduce
     * @param player_stat One of the stats: money, satiety, school_performance, happiness
     */
    private fun checkMin(player_stat: Int, value: Int): Boolean {
        return player_stat >= -value
    }
    private fun checkMax(player_stat: Int, value: Int): Boolean {
        return player_stat + value <= 1000
    }


    /**
     * Changes each 3 seconds Player stats
     * It is used in {@link Game.tick()}
     */
    fun tick() {
        changeSchoolPerformance(this.player_state.reduce_school_performance_value)
        changeHappiness(this.player_state.reduce_happiness_value)
        changeSatiety(this.player_state.reduce_satiety_value)
    }


    /**
     * Maybe that should be deprecated
     */
    fun getClass(): Int {
        TODO("Not yet implemented")
    }


    /**
     * Block of functions that reproduce Player's actions
     * @param song Field of corresponding Enum class that is used to change stats
     * @param delivery_type Field of corresponding Enum class that is used to change stats
     * @param web_task Field of corresponding Enum class that is used to change stats
     * @param food Field of corresponding Enum class that is used to change stats
     * @param entertainment Field of corresponding Enum class that is used to change stats
     * @param study Field of corresponding Enum class that is used to change stats
     */
    fun playSong() {
        changeMoney(this.current_courses.guitar_course.BestSong().money_diff)
    }
    fun deliver() {
        changeMoney(this.items.bicycle.BestDelivery().money_diff)
    }
    fun realiseWebTask() {
        changeMoney(this.current_courses.computer_course.BestNetWork().money_diff)
    }
    fun work(work: OtherWork) {
        changeMoney(work.money_diff)
        changeHappiness(work.happiness)
    }
    fun eat(food: Food) {
        changeMoney(food.money_diff)
        changeSatiety(food.satiety)
        changeHappiness(food.happiness)
    }
    fun entertain(entertainment: Entertainment) {
        changeMoney(entertainment.money_diff)
        changeHappiness(entertainment.happiness)
    }
    fun study(studies: Studies) {
        changeMoney(studies.money_diff)
        changeSchoolPerformance(studies.school_performance)
    }


    /**
     * Block of functions that change Player stats
     * @param value Value which will be used to change corresponding field
     */
    fun changeSchoolPerformance(value: Int) {
        if (checkMax(this.school_performance, value))
            this.school_performance += value
        else
            this.school_performance = 1000
    }
    fun changeHappiness(value: Int) {
        if (checkMax(this.happiness, value))
            this.happiness += value
        else
            this.happiness = 1000
    }
    fun changeSatiety(value: Int) {
        if (checkMax(this.satiety, value))
            this.satiety += value
        else
            this.satiety = 1000
    }
    fun changeMoney(value: Int) {
        if (value > 0) earned_money += value
        if (checkMin(this.money, value))
            this.money += value
        else
            throw NotEnoughMoneyException("You don't have enough money!")
    }

    /**
     * Functions for changing State of the player
     * @param state Is responsible for reducing stats each tick
     */
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


    /**
     * Block of functions for buying new items and courses
     */
    fun buyNewBicycle() {
        this.items.bicycle.changeState(this.items)
    }
    fun buyNewGuitar() {
        this.items.guitar.changeState(this.items)
    }
    fun buyNextGuitarCourse(course: GuitarCourseState) {
        if (this.items.guitar.isAvailable(course))
            this.current_courses.guitar_course.buyNextCourse(this.current_courses)
        else
            throw IsNotAvailableException("Course is not available!")
    }
    fun buyNewComputer() {
        this.items.computer.changeState(this.items)
    }
    fun buyNextComputerCourse(course: ComputerCourseState) {
        if (this.items.computer.isAvailable(course))
            this.current_courses.computer_course.buyNextCourse(this.current_courses)
        else
            throw IsNotAvailableException("Course is not available!")
    }


    fun achieved(achievement: Achievements): Boolean {
        if (achievement !in achieved_achievements) {
            if (achievement is RandomAchievements) {
                if(achievement.achievementGetCheck()) {
                    this.achieved_achievements.add(achievement)
                    return true
                }
            }
            else {
                this.achieved_achievements.add(achievement)
                return true
            }
        }
        return false
    }

    fun dead(): Boolean {
        if (this.satiety <= 0 || this.happiness <= 0)
            return true
        return false
    }
}


