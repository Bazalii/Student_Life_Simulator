package android.clicker.school_live_simulator

interface TimerObserver {
	/**
	 * Function which response 
	 * for timer tick 
	*/
    fun timerTickHandler()
	
	/**
	 * Function which end timer
	*/
    fun timerEndHandler()
	
}
