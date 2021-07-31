package android.clicker.school_live_simulator

open class YamahaGuitarState : UralGuitarState() {
    override val price: Int = 12000

    init {
        available_courses.add("MusicalSchoolCourseState")
    }

    override fun changeState(bag: Player.Bag) {
        bag.guitar = FenderGuitarState()
    }
}
