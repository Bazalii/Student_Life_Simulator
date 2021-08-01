package android.clicker.school_live_simulator

interface TimerObserver {
	/**
	 * Handler who will be risen  
	 * when timer will change time on one point
	 */
    fun timerTickHandler()
	
	/**
	 * Handler which will be risen
	 * when timer will "ring"
	 */
    fun timerEndHandler()
}
