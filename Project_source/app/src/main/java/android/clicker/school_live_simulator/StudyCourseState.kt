package android.clicker.school_live_simulator

abstract class StudyCourseState: TimerObserver {
    /**
	 * Price of course
	 */
	protected abstract val price: Int
	
	/**
	 * For student change current course
	 * @param student who change course
	 */
    abstract fun buyNextCourse(var student: Player) {
	
	}
	
    abstract override fun timerTickHandler() {
	
	}
	
    abstract override fun timerEndHandler() {
	
	}
}
