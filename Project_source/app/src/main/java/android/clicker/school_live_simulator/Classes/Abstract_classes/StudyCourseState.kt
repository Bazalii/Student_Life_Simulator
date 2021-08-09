package android.clicker.school_live_simulator

abstract class StudyCourseState: TimerObserver {
    /**
	 * Price of course
	 */
	protected abstract val price: Int

	/**
	 * For student change current course
	 * @param courses current courses state
	 */
    abstract fun buyNextCourse(courses: Player.Courses)

    abstract override fun timerTickHandler()

    abstract override fun timerEndHandler()
}
