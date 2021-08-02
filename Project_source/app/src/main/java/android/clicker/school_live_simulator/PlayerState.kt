package android.clicker.school_live_simulator
/**
 * Every tick player characteristics: school_performance, happiness and satiety reduces.
 * 3 subclasses of abstract class define different player state.
 * Each player state defines its constants.
 * These constants define player characteristics reduce.
 */
abstract class PlayerState {
    /**
     * initialize with default values
     */
    protected var reduce_school_performance_percent: Int = 0
    protected var reduce_happines_percent: Int = 0
    protected var reduce_satiety_percent: Int = 0
}
