package android.clicker.school_live_simulator.Classes.Achievements_classes.Purchase_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.PurchaseAchievements
import android.clicker.school_live_simulator.Game

/**
 * Purchase Achievements related to the purchase of a bicycle
 */
enum class BicycleEventsAchievements(val achievement_name: String, val achievement_message: String): PurchaseAchievements {
    USUAL_BIKE(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    MOUNTAIN_BIKE(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle(""))
}
