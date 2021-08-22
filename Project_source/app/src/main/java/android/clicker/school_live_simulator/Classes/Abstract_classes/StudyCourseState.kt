package android.clicker.school_live_simulator

abstract class StudyCourseState: TimerObserver {
    /**
	 * Price of course
	 */
	abstract val price: Int

	abstract val course_length: Int

	/**
	 * Function change current course for player
	 * @param courses current courses state
	 */
    abstract fun buyNextCourse(courses: Player.Courses)

    abstract override fun timerTickHandler()

    abstract override fun timerEndHandler()
}
