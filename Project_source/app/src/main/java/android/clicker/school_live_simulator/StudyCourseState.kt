package android.clicker.school_live_simulator

/**
 * @author      Kirill Zheludev kirill.zheludev@yandex.ru
 * @version     1.0                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */

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
