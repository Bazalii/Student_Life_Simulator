package android.clicker.school_live_simulator.Classes.AchievementsClasses.PurchaseAchievements

import android.clicker.school_live_simulator.Classes.AchievementsClasses.Interfaces.PurchaseAchievements
import android.clicker.school_live_simulator.Game

/**
 * Purchase Achievements related to the purchase of a bicycle
 */

enum class BicycleEventsAchievements(
    override val achievement_name: String,
    override val achievement_message: String
) : PurchaseAchievements {
    USSR_BIKE(
        achievement_name = Game.context_bundle.getTitle("ach_usual_bike_name"),
        achievement_message = Game.context_bundle.getTitle("ach_usual_bike_text")
    ),
    MOUNTAIN_BIKE(
        achievement_name = Game.context_bundle.getTitle("ach_mountain_bike_name"),
        achievement_message = Game.context_bundle.getTitle("ach_mountain_bike_text")
    )
}
