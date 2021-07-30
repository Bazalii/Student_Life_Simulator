package android.clicker.school_live_simulator
/**
 * @author      Andrey Novikov andrewnovicov@gmail.com
 * @version     1.0                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */
abstract class PlayerState {
    abstract val reduce_school_performance_percent: Int
    abstract val reduce_happines_percent: Int
    abstract val reduce_satiety_percent: Int
}
