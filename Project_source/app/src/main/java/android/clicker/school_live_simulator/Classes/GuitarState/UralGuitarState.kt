package android.clicker.school_live_simulator

open class UralGuitarState : UssrGuitarState() {
    override val price: Int = 5000

    init {
        available_courses.add(FirstSongCourseState())
    }

    override fun changeState(bag: Player.Bag) {
        bag.guitar = YamahaGuitarState()
    }
}
