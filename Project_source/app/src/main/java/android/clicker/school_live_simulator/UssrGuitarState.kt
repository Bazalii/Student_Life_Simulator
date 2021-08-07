package android.clicker.school_live_simulator

open class UssrGuitarState : NullGuitarState() {
    override val price: Int = 1000

    init {
        available_courses.add(YardGuitarCourseState::class)
    }

    override fun changeState(bag: Player.Bag) {
        bag.guitar = UralGuitarState()
    }
}
