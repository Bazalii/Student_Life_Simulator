package android.clicker.school_live_simulator

class ExtremeState : PlayerState() {
    /**
     * values will be balanced in the future, now they are default(=0)
     */
    override val reduce_school_performance_percent: Int = 0
    override val reduce_happines_percent: Int = 0
    override val reduce_satiety_percent: Int = 0
}
