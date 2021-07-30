package android.clicker.school_live_simulator

class BadState : PlayerState() {
    override val reduce_school_performance_percent: Int = 0
    override val reduce_happines_percent: Int = 0
    override val reduce_satiety_percent: Int = 0
}
