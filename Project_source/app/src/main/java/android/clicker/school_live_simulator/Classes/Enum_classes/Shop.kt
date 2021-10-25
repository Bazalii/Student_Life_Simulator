package android.clicker.school_live_simulator.Classes.Enum_classes

import android.clicker.school_live_simulator.Game

enum class Shop(val happiness: Int, val money_diff: Int) {
    USSR_BICYCLE(
        Game.context_bundle.getNumber("shop_ussr_bicycle_happiness"),
        Game.context_bundle.getNumber("shop_ussr_bicycle_price")
    ),
    USUAL_BICYCLE(
        Game.context_bundle.getNumber("shop_usual_bicycle_happiness"),
        Game.context_bundle.getNumber("shop_usual_bicycle_price")
    ),
    MOUNTAIN_BICYCLE(
        Game.context_bundle.getNumber("shop_mountain_bicycle_happiness"),
        Game.context_bundle.getNumber("shop_mountain_bicycle_price")
    ),
    USSR_GUITAR(
        Game.context_bundle.getNumber("shop_ussr_guitar_happiness"),
        Game.context_bundle.getNumber("shop_ussr_guitar_price")
    ),
    URAL_GUITAR(
        Game.context_bundle.getNumber("shop_ural_guitar_happiness"),
        Game.context_bundle.getNumber("shop_ural_guitar_price")
    ),
    YAMAHA_GUITAR(
        Game.context_bundle.getNumber("shop_yamaha_guitar_happiness"),
        Game.context_bundle.getNumber("shop_yamaha_guitar_price")
    ),
    FENDER_GUITAR(
        Game.context_bundle.getNumber("shop_fender_guitar_happiness"),
        Game.context_bundle.getNumber("shop_fender_guitar_price")
    ),
    DOUBLE_NECK_GUITAR(
        Game.context_bundle.getNumber("shop_double_neck_guitar_happiness"),
        Game.context_bundle.getNumber("shop_double_neck_guitar_price")
    ),
    PREVIOUSLY_USED_COMPUTER(
        Game.context_bundle.getNumber("shop_previously_used_computer_happiness"),
        Game.context_bundle.getNumber("shop_previously_used_computer_price")
    ),
    OLD_COMPUTER(
        Game.context_bundle.getNumber("shop_old_computer_happiness"),
        Game.context_bundle.getNumber("shop_old_computer_price")
    ),
    USUAL_COMPUTER(
        Game.context_bundle.getNumber("shop_usual_computer_happiness"),
        Game.context_bundle.getNumber("shop_usual_computer_price")
    ),
    XIAOMI_MI_NOTEBOOK(
        Game.context_bundle.getNumber("shop_xiaomi_computer_happiness"),
        Game.context_bundle.getNumber("shop_xiaomi_computer_price")
    ),
    MACBOOK(
        Game.context_bundle.getNumber("shop_macbook_computer_happiness"),
        Game.context_bundle.getNumber("shop_macbook_computer_price")
    )
}
