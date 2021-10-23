package android.clicker.school_live_simulator.Classes.Enum_classes

import android.clicker.school_live_simulator.Game

enum class Shop(val happiness: Int, val money_diff: Int) {
    USSR_BICYCLE(
        Game.context_bundle.getNumber("ussr_bicycle_happiness"),
        Game.context_bundle.getNumber("ussr_bicycle_price")
    ),
    USUAL_BICYCLE(
        Game.context_bundle.getNumber("usual_bicycle_happiness"),
        Game.context_bundle.getNumber("usual_bicycle_price")
    ),
    MOUNTAIN_BICYCLE(
        Game.context_bundle.getNumber("mountain_bicycle_happiness"),
        Game.context_bundle.getNumber("mountain_bicycle_price")
    ),
    URAL_GUITAR(
        Game.context_bundle.getNumber("ural_guitar_happiness"),
        Game.context_bundle.getNumber("ural_guitar_price")
    ),
    YAMAHA_GUITAR(
        Game.context_bundle.getNumber("yamaha_guitar_happiness"),
        Game.context_bundle.getNumber("yamaha_guitar_price")
    ),
    FENDER_GUITAR(
        Game.context_bundle.getNumber("fender_guitar_happiness"),
        Game.context_bundle.getNumber("fender_guitar_price")
    ),
    PREVIOUSLY_USED_COMPUTER(
        Game.context_bundle.getNumber("previously_used_computer_happiness"),
        Game.context_bundle.getNumber("previously_used_computer_price")
    ),
    OLD_COMPUTER(
        Game.context_bundle.getNumber("old_computer_happiness"),
        Game.context_bundle.getNumber("old_computer_price")
    ),
    USUAL_COMPUTER(
        Game.context_bundle.getNumber("usual_computer_happiness"),
        Game.context_bundle.getNumber("usual_computer_price")
    ),
    XIAOMI_MI_NOTEBOOK(
        Game.context_bundle.getNumber("xiaomi_mi_notebook_happiness"),
        Game.context_bundle.getNumber("xiaomi_mi_notebook_price")
    ),
    MACBOOK(
        Game.context_bundle.getNumber("macbook_happiness"),
        Game.context_bundle.getNumber("macbook_price")
    )
}
