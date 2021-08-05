package android.clicker.school_live_simulator
/**
 * Every tick player characteristics: school_performance, happiness and satiety reduces.
 * 3 subclasses of abstract class define different player state.
 * Each player state defines its constants.
 * These constants define player characteristics reduce.
 */
abstract class PlayerState {
    abstract val reduce_school_performance_percent: Int
    abstract val reduce_happines_percent: Int
    abstract val reduce_satiety_percent: Int
}
