package android.clicker.school_live_simulator


enum class WebTask(val money_diff: Int) {
    ACCOUNT_BOOST(Game.context_bundle.getNumber("work_on_the_net_v1_income")),
    PUBLIC_PR(Game.context_bundle.getNumber("work_play_guitar_v2_income")),
    MAKE_FRONTEND(Game.context_bundle.getNumber("work_play_guitar_v3_income")),
    VIDEO_EDITING(Game.context_bundle.getNumber("work_play_guitar_v4_income")),
    MAKE_A_GAME(Game.context_bundle.getNumber("work_play_guitar_v5_income"))
}
