package android.clicker.school_live_simulator

enum class Delivery(val money_diff: Int) {
    SLOW_DELIVERY(Game.context_bundle.getNumber("work_as_a_courier_v1_income")),
    USUAL_DELIVERY(Game.context_bundle.getNumber("work_as_a_courier_v2_income")),
    FAST_DELIVERY(Game.context_bundle.getNumber("work_as_a_courier_v3_income"))
}
