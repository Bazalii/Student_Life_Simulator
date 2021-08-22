package android.clicker.school_live_simulator.Classes.Achievements_classes.Purchase_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.PurchaseAchievements
import android.clicker.school_live_simulator.Game

/**
 * Purchase Achievements related to the purchase of a guitar
 */
enum class GuitarEventsAchievements(val achievement_name: String, val achievement_message: String): PurchaseAchievements {
    USSR_GUITAR(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    URAL_GUITAR(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    YAMAHA_GUITAR(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    FENDER_GUITAR(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    DUAL_NECK_GUITAR(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle(""))
}
