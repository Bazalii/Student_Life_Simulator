package android.clicker.school_live_simulator

abstract class StudyCourseState: TimerObserver {
    abstract val price: Int
    abstract fun buyNextCourse(var student: Player) {

    }
    abstract override fun timerTickHandler() {

    }
    abstract override fun timerEndHandler() {
    }

}