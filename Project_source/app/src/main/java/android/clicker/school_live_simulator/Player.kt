package android.clicker.school_live_simulator

class Player {
    object Bag {
        var bicycle: BicycleState = NullBicycleState()
            set(value) {
                TODO("Not yet implemented")
            }
        var guitar: GuitarState = NullGuitarState()
            set(value) {
                TODO("Not yet implemented")
            }
        var computer: ComputerState = NullComputerState()
            set(value) {
                TODO("Not yet implemented")
            }
    }
    object Courses {
        var guitar_course: GuitarCourseState = NullGuitarCourseState()
            set(value) {
                TODO("Not yet implemented")
            }
        var computer_course: ComputerCourseState = NullComputerCourseState()
            set(value) {
                TODO("Not yet implemented")
            }
    }
    private var achieved_achievements: ArrayList<GameAchievements> = arrayListOf<GameAchievements>()

    private lateinit var name: String
    private lateinit var birthday: Birthday
    private var school_performance: Int = 1000
    private var happiness: Int = 1000
    private var satiety: Int = 1000
    private var money: Int = 100

    private var school_class: Int = 1

    private var items: Bag = Bag
    private var current_courses: Courses = Courses

    private var player_state: PlayerState = NormalState()
    private var live_observers: ArrayList<LiveObserver> = arrayListOf<LiveObserver>()


    fun tick() {
        TODO("Not yet implemented")
    }

    fun getClass(): Int {
        TODO("Not yet implemented")
    }

    fun playSong(song: Song) {
        TODO("Not yet implemented")
    }
    fun deliver(delivery_type: Delivery) {
        TODO("Not yet implemented")
    }
    fun realiseWebTask(web_task: WebTask) {
        TODO("Not yet implemented")
    }

    fun eat(food: Food) {
        TODO("Not yet implemented")
    }

    fun addSchoolPerformance(value: Int) {
        TODO("Not yet implemented")
    }
    fun addPercentSchoolPerformance(value: Int) {
        TODO("Not yet implemented")
    }
    fun reduceSchoolPerformance(value: Int) {
        TODO("Not yet implemented")
    }

    fun addHappiness(value: Int) {
        TODO("Not yet implemented")
    }
    fun addPercentHappiness(value: Int) {
        TODO("Not yet implemented")
    }
    fun reduceHappiness(value: Int) {
        TODO("Not yet implemented")
    }

    fun addSatiety(value: Int) {
        TODO("Not yet implemented")
    }
    fun addPercentSatiety(value: Int) {
        TODO("Not yet implemented")
    }
    fun reduceSatiety(value: Int) {
        TODO("Not yet implemented")
    }

    fun addMoney(value: Int) {
        TODO("Not yet implemented")
    }
    fun reduceMoney(value: Int) {
        TODO("Not yet implemented")
    }

    private fun changePlayerState(state: PlayerState) {
        TODO("Not yet implemented")
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
        TODO("Not yet implemented")
    }
    fun buyNewGuitar() {
        TODO("Not yet implemented")
    }
    fun buyNextGuitarCourse() {
        TODO("Not yet implemented")
    }
    fun buyNewComputer() {
        TODO("Not yet implemented")
    }
    fun buyNextComputerCourse() {
        TODO("Not yet implemented")
    }

}


