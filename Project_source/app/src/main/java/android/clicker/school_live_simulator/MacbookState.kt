package android.clicker.school_live_simulator

open class MacbookState: XiaomiMiNotebookState() {
    override val price: Int = 200000

    init {
        available_courses.add(GameDevelopmentCourseState::class)
    }
    override fun changeState(bag: Player.bag) {
        Unit = throw UnsupportedOperationException("Operation not supported")
    }

}
