package android.clicker.school_live_simulator

open class UralGuitarState : UssrGuitarState() {
    override val price: Int = 5000

    init {
        available_courses.add("YardSongCourseState")
    }

    override fun changeState(bag: Player.Bag) {
        bag.guitar = YamahaGuitarState()
    }
}
