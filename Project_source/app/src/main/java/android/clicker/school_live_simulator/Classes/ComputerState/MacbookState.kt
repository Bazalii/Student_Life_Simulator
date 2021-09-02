package android.clicker.school_live_simulator

open class MacbookState : XiaomiMiNotebookState() {
    override val price: Int = 200000

    init {
        available_courses.add(GameDevelopmentCourseState())
    }
    override fun changeState(bag: Player.Bag) {
//        Unit = throw UnsupportedOperationException("Operation not supported")
    }

}
