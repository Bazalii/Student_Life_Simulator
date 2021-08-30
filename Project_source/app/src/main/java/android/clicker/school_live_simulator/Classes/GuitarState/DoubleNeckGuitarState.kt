package android.clicker.school_live_simulator

class DoubleNeckGuitarState: FenderGuitarState() {
    override val price: Int = 150000

    init {
        available_courses.add(MusicalObservatoryCourseState())
    }

    override fun changeState(bag: Player.Bag):
        Unit = throw UnsupportedOperationException("Operation not supported")
}
