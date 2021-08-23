package android.clicker.school_live_simulator.Classes.Achievements_classes.Purchase_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.PurchaseAchievements
import android.clicker.school_live_simulator.Game

/**
 * Purchase Achievements related to the purchase of a guitar
 */
enum class GuitarEventsAchievements(override val achievement_name: String, override val achievement_message: String): PurchaseAchievements {
    USSR_GUITAR(achievement_name = Game.context_bundle.getTitle("ach_ussr_guitar_name"), achievement_message = Game.context_bundle.getTitle("ach_ussr_guitar_text")),
    URAL_GUITAR(achievement_name = Game.context_bundle.getTitle("ach_ural_guitar_name"), achievement_message = Game.context_bundle.getTitle("ach_ural_guitar_text")),
    DOUBLE_NECK_GUITAR(achievement_name = Game.context_bundle.getTitle("ach_dual_neck_guitar_name"), achievement_message = Game.context_bundle.getTitle("ach_dual_neck_guitar_text"))
}
