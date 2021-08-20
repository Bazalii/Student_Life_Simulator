package android.clicker.school_live_simulator.Classes.Enum_classes

import android.clicker.school_live_simulator.Game


enum class OtherWork(val happiness: Int, val money_diff: Int) {
    COLLECT_CHANGE(Game.context_bundle.getNumber("work_collect_change_happiness"), Game.context_bundle.getNumber("work_collect_change_income")),
    WATCH_ADS(Game.context_bundle.getNumber("work_watch_ads_happiness"), Game.context_bundle.getNumber("work_watch_ads_income")),
    DISTRIBUTE_FLYERS(Game.context_bundle.getNumber("work_distribute_flyers_happiness"), Game.context_bundle.getNumber("work_distribute_flyers_income")),
    AS_A_GREENER(Game.context_bundle.getNumber("work_as_a_greener_happiness"), Game.context_bundle.getNumber("work_as_a_greener_income")),
    AS_AN_OPERATOR(Game.context_bundle.getNumber("work_as_an_operator_happiness"), Game.context_bundle.getNumber("work_as_an_operator_income"))
}
