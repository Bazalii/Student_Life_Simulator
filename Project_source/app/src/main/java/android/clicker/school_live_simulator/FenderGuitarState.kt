package android.clicker.school_live_simulator

open class FenderGuitarState : YamahaGuitarState() {
    override val price: Int = 40000

    init {
        available_courses.add(MusicalObservatoryCourseState::class)
    }

    override fun changeState(bag: Player.Bag) {
        bag.guitar = DualNeckGuitarState()
    }
}
