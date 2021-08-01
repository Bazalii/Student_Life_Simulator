package android.clicker.school_live_simulator

/**
 * @author      Kirill Zheludev kirill.zheludev@yandex.ru
 * @version     1.0                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */

interface TimerObserver {
    fun timerTickHandler()
	
    fun timerEndHandler()
	
}
