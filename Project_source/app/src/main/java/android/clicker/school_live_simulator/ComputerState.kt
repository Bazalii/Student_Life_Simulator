package android.clicker.school_live_simulator

abstract class ComputerState {
    protected abstract val price: Int

    protected val available_courses: List<String> = listOf<String>()

    protected  abstract val owner: Player

    abstract fun changeState(thingsHandler: Things)

    abstract fun isAvailable(courseName: String): Boolean

}
