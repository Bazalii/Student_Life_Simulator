package android.clicker.school_live_simulator

class Player {
    object Bag {
        var bicycle: BicycleState = NullBicycleState()
            set(value) {
                if(money >= value.price){
                    reduceMoney(value.price)
                    field = value
                }
            }
        var guitar: GuitarState = NullGuitarState()
            set(value) {
                if(money >= value.price){
                    reduceMoney(value.price)
                    field = value
                }
            }
        var computer: ComputerState = NullComputerState()
            set(value) {
                if(money >= value.price){
                    reduceMoney(value.price)
                    field = value
                }
            }
    }
    object Courses {
        var guitar_course: GuitarCourseState = NullGuitarCourseState()
            set(value) {
                if(money >= value.price){
                    reduceMoney(value.price)
                    field = value
                }
            }
        var computer_course: ComputerCourseState = NullComputerCourseState()
            set(value) {
                if(money >= value.price){
                    reduceMoney(value.price)
                    field = value
                }
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
        if(this.current_courses.guitar_course.isAvailable(song)){
            addMoney(song)
        }
    }
    fun deliver(delivery_type: Delivery){
        this.money += addMoney(delivery_type)
    }
    fun realiseWebTask(web_task: WebTask) {
        if(this.current_courses.computer_course.isAvailable(web_task)){
            addMoney(web_task)
        }
    }

    fun eat(food: Food) {
        if(this.money >= food.cost) {
            addSatiety(food.satiety)
            addHappiness(food.happiness)
            reduceMoney(food.cost)
        }
    }

    fun addSchoolPerformance(value: Int) {
        this.school_performance += value
    }
    fun addPercentSchoolPerformance(value: Int) {
        this.school_performance *= (1 + value/100)
    }
    fun reduceSchoolPerformance(value: Int) {
        if(this.school_performance >= value){
            this.school_performance -= value
        }
    }

    fun addHappiness(value: Int) {
        this.happiness += value
    }
    fun addPercentHappiness(value: Int) {
        this.happiness *= (1 + value/100)
    }
    fun reduceHappiness(value: Int) {
        if (this.happiness >= value){
            this.happiness -= value
        }
    }

    fun addSatiety(value: Int) {
        this.satiety += value
    }
    fun addPercentSatiety(value: Int) {
        this.satiety *= (1 + value/100)
    }
    fun reduceSatiety(value: Int) {
        if(this.satiety >= value){
            this.satiety -= value
        }
    }

    fun addMoney(value: Int) {
        this.money += value
    }
    fun reduceMoney(value: Int) {
        if(this.money >= value){
            this.money -= value
        }
    }

    private fun changePlayerState(state: PlayerState) {

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
        this.items.bicycle.changeState(Player.Bag)
    }
    fun buyNewGuitar() {
        this.items.guitar.changeState(Player.Bag)
    }
    fun buyNextGuitarCourse() {
        this.current_courses.guitar_course.changeState(Player.Courses)
    }
    fun buyNewComputer() {
        this.items.computer.changeState(Player.Bag)
    }
    fun buyNextComputerCourse() {
        this.current_courses.computer_course.changeState(Player.Courses)
    }

}


