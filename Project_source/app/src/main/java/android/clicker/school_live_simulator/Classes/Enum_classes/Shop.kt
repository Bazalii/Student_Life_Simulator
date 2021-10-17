package android.clicker.school_live_simulator.Classes.Enum_classes

import android.clicker.school_live_simulator.Game

enum class Shop(val happiness: Int, val money_diff: Int) {
    USSR_BICYCLE(
        Game.context_bundle.getNumber("work_collect_change_happiness"),
        Game.context_bundle.getNumber("work_collect_change_income")
    )
}
