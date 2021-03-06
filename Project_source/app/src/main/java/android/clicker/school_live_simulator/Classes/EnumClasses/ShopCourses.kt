package android.clicker.school_live_simulator.Classes.EnumClasses

import android.clicker.school_live_simulator.Game

enum class ShopCourses (val happiness: Int, val satiety: Int, val length: Int, val money_diff: Int){
    GUITAR_COURSE_V1(
        Game.context_bundle.getNumber("shop_guitar_course_v1_happiness"),
        Game.context_bundle.getNumber("shop_guitar_course_v1_satiety"),
        Game.context_bundle.getNumber("shop_guitar_course_v1_length"),
        Game.context_bundle.getNumber("shop_guitar_course_v1_price")
    ),
    GUITAR_COURSE_V2(
        Game.context_bundle.getNumber("shop_guitar_course_v2_happiness"),
        Game.context_bundle.getNumber("shop_guitar_course_v2_satiety"),
        Game.context_bundle.getNumber("shop_guitar_course_v2_length"),
        Game.context_bundle.getNumber("shop_guitar_course_v2_price")
    ),
    GUITAR_COURSE_V3(
        Game.context_bundle.getNumber("shop_guitar_course_v3_happiness"),
        Game.context_bundle.getNumber("shop_guitar_course_v3_satiety"),
        Game.context_bundle.getNumber("shop_guitar_course_v3_length"),
        Game.context_bundle.getNumber("shop_guitar_course_v3_price")
    ),
    GUITAR_COURSE_V4(
        Game.context_bundle.getNumber("shop_guitar_course_v4_happiness"),
        Game.context_bundle.getNumber("shop_guitar_course_v4_satiety"),
        Game.context_bundle.getNumber("shop_guitar_course_v4_length"),
        Game.context_bundle.getNumber("shop_guitar_course_v4_price")
    ),
    GUITAR_COURSE_V5(
        Game.context_bundle.getNumber("shop_guitar_course_v5_happiness"),
        Game.context_bundle.getNumber("shop_guitar_course_v5_satiety"),
        Game.context_bundle.getNumber("shop_guitar_course_v5_length"),
        Game.context_bundle.getNumber("shop_guitar_course_v5_price")
    ),
    COMPUTER_COURSE_V1(
        Game.context_bundle.getNumber("shop_computer_course_v1_happiness"),
        Game.context_bundle.getNumber("shop_computer_course_v1_satiety"),
        Game.context_bundle.getNumber("shop_computer_course_v1_length"),
        Game.context_bundle.getNumber("shop_computer_course_v1_price")
    ),
    COMPUTER_COURSE_V2(
        Game.context_bundle.getNumber("shop_computer_course_v2_happiness"),
        Game.context_bundle.getNumber("shop_computer_course_v2_satiety"),
        Game.context_bundle.getNumber("shop_computer_course_v2_length"),
        Game.context_bundle.getNumber("shop_computer_course_v2_price")
    ),
    COMPUTER_COURSE_V3(
        Game.context_bundle.getNumber("shop_computer_course_v3_happiness"),
        Game.context_bundle.getNumber("shop_computer_course_v3_satiety"),
        Game.context_bundle.getNumber("shop_computer_course_v3_length"),
        Game.context_bundle.getNumber("shop_computer_course_v3_price")
    ),
    COMPUTER_COURSE_V4(
        Game.context_bundle.getNumber("shop_computer_course_v4_happiness"),
        Game.context_bundle.getNumber("shop_computer_course_v4_satiety"),
        Game.context_bundle.getNumber("shop_computer_course_v4_length"),
        Game.context_bundle.getNumber("shop_computer_course_v4_price")
    ),
    COMPUTER_COURSE_V5(
        Game.context_bundle.getNumber("shop_computer_course_v5_happiness"),
        Game.context_bundle.getNumber("shop_computer_course_v5_satiety"),
        Game.context_bundle.getNumber("shop_computer_course_v5_length"),
        Game.context_bundle.getNumber("shop_computer_course_v5_price")
    )
}
