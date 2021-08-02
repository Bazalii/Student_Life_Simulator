package android.clicker.school_live_simulator

class BadState : PlayerState() {
    init {
        reduce_school_performance_percent = 0
        reduce_happines_percent = 0
        reduce_satiety_percent = 0
    }
}
